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

public class Login_Page  extends BaseTest {
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
	public void Login_01_With_Empty_Data() {
		homePage = new HomePageObject(driver);
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getEmptyEmailErrorMessage(), "Please enter your email");
	
		
	}
	
	@Test
	public void Login_02_With_Invalid_Email() {
		loginPage.refreshCurrentPage(driver);
		loginPage.enterToEmailTextbox("thuy0989@gmail.com!");
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getInvalidEmailErrorMessage(), "Wrong email");
		
	}
	
	@Test
	public void Login_03_With_Email_Is_Not_Exist() {
		loginPage.refreshCurrentPage(driver);
		loginPage.enterToEmailTextbox("thuy09819@gmail.com");
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getEmailNotExistErrorMessage(), 
				"No customer account found");
	}
	
	
	

	@Test
	public void Login_04_With_Valid_Email_And_Empty_Password() {
		homePage = new HomePageObject(driver);
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		loginPage.enterToEmailTextbox("qateam.madison@gmail.com");
		loginPage.clickToLoginButton();
		
		
		Assert.assertEquals(loginPage.getEmptyPasswordErrorMessage2(), "The credentials provided are incorrect");
	
		
	}
	
	@Test
	public void Login_O5_With_Correct_Email_And_Incorrect_Password() {
		homePage = new HomePageObject(driver);
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		loginPage.enterToEmailTextbox("qateam.madison@gmail.com");
		loginPage.enterToPasswordTextbox("193456");
		loginPage.clickToLoginButton();
	}
	
	
	@Test
	public void Login_06_With_Correct_Email_And_Password() {
		homePage = new HomePageObject(driver);
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		loginPage.enterToEmailTextbox("qateam.madison@gmail.com");
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		
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
	
	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	
	
	

}
