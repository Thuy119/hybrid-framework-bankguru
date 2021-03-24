package com.nopcommerce.login;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BasePage;
import commons.BaseTest;
import pageObjects.nopcommerce.HomePageObject;
import pageObjects.nopcommerce.LoginPageObject;
import pageObjects.nopcommerce.RegisterPageObject;

public class Register_Page  extends BaseTest {
	WebDriver driver;
	
	String emailAddress, password;
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		
		driver = getBrowserDriver(browserName, appUrl);
		
		driver.get("https://demo.nopcommerce.com/");
		
		
	emailAddress = getRandomEmail();
	password = "123456";
		
		
	}

	@Test
	public void Register_01_With_Empty_Data() {
		
		
		homePage = new HomePageObject(driver);
		
		homePage.clickToRegisterLink();
		
		registerPage = new RegisterPageObject(driver);
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getEmptyFirstNameErrorMessage(), "First name is required.");
		Assert.assertEquals(registerPage.getEmptyLastNameErrorMessage(), "Last name is required.");
		Assert.assertEquals(registerPage.getEmptyEmailErrorMessage(), "Email is required.");
		Assert.assertEquals(registerPage.getEmptyPasswordErrorMessage(), "Password is required.");
		Assert.assertEquals(registerPage.getEmptyConfirmPasswordErrorMessage(), "Password is required.");
		
	}

	@Test
	public void Register_02_With_Invalid_Email() {
		registerPage.refreshCurrentPage(driver);
		
		registerPage.enterToFirstNameTextbox("thuy");
		registerPage.enterToLastNameTextbox("nguyen");
		registerPage.enterToEmailTextbox("thuy123@123");
		
		registerPage.enterToPasswordTextbox("123456");
		registerPage.enterToConfirmPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getWrongEmailErrorMessage(), "Wrong email");
		
	}
	
	
	@Test
	public void Register_03_With_Existed_Email() {
		registerPage.clickToRegisterButton();
		
		
		registerPage.enterToFirstNameTextbox("ly");
		registerPage.enterToLastNameTextbox("ly");
		registerPage.enterToEmailTextbox("dam@gmail.com");
		
		registerPage.enterToPasswordTextbox("123123");
		registerPage.enterToConfirmPasswordTextbox("123123");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getExistedEmailErrorMessage(), "The specified email already exists");
		
	}
	
	@Test
	public void Register_04_With_Password_Less_Than_6_Characters() {
		registerPage.clickToRegisterButton();
		registerPage.enterToFirstNameTextbox("thuy");
		registerPage.enterToLastNameTextbox("thanh");
		registerPage.enterToEmailTextbox(getRandomEmail());
		
		registerPage.enterToPasswordTextbox("12345");
		registerPage.enterToConfirmPasswordTextbox("12345");
		
		registerPage.clickToRegisterButton();
		System.out.println(registerPage.getPasswordLessThan6charactersErrorMessage());
		Assert.assertEquals(registerPage.getPasswordLessThan6charactersErrorMessage(), "Password must meet the following rules: must have at least 6 characters");
	}
	
	
	@Test
	public void Register_05_Password_Not_Match_With_Confirm_Password () {
		registerPage.clickToRegisterButton();
		registerPage.enterToFirstNameTextbox("thanh");
		registerPage.enterToLastNameTextbox("thuy");
		registerPage.enterToEmailTextbox(getRandomEmail());
		
		registerPage.enterToPasswordTextbox("123456");
		registerPage.enterToConfirmPasswordTextbox("123457");
		
		Assert.assertEquals(registerPage.getPasswordNotMatchWithConfirmPasswordErrorMessage(), "The password and confirmation password do not match.");
	}
	
	
	@Test
	public void Register_06_Success() {
		
		registerPage.clickToRegisterButton();
		registerPage.enterToFirstNameTextbox("qa");
		registerPage.enterToLastNameTextbox("thuy");
		registerPage.enterToEmailTextbox(getRandomEmail());
		
		registerPage.enterToPasswordTextbox("123456");
		registerPage.enterToConfirmPasswordTextbox("123456");
		
		
	
		// homePage = new HomePageObject(driver);
		 //Assert.assertTrue(registerPage.isSuccessMessageDisplayed());
		
	}
	
	

	@AfterClass
	public void cleanBrowser() {
		//driver.quit();

	}

	public String getRandomEmail() {
		Random rand = new Random();
		rand.nextInt(99999);
		return "Thuyqa" + rand.nextInt(99999) + "@gmail.com";

	}
	
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	
	
	

}
