package com.nopcommerce.login;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.nopcommerce.HomePageObject;
import pageObjects.nopcommerce.LoginPageObject;
import pageObjects.nopcommerce.RegisterPageObject;

public class Level_03_Register_Login_Page_Object {
	WebDriver driver;
	
	String emailAddress, password;
	String projectLocation = System.getProperty("user.dir");

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdriver.gecko.driver", projectLocation + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	emailAddress = getRandomEmail();
	password = "123456";
		
		
	}

	@Test
	public void Login_01_Register_To_System() {
		
		
		//Strp01: Mở URL -> Homepage
		driver.get("https://demo.nopcommerce.com/");
		homePage = new HomePageObject(driver);
				
		//Step 02: verify hompage slider display
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
				
		
		
		
		//Step03: Click to Register link -> Register page
		homePage.clickToRegisterLink();
		registerPage = new RegisterPageObject(driver);
		
		//Step 4: Click to Rander mail Radio
		registerPage.clickToRanderMailRadioButton();
		
		//Step 6: Input to First name
		registerPage.enterToFirstNameTextbox("Thuy");
		
		//Step 7: Input to Last name
		registerPage.enterToLastNameTextbox("123");
		
		//Step 8: Input email
		registerPage.enterToEmailTextbox(emailAddress);
		
		//Step 9: Input password
		registerPage.enterToPasswordTextbox(password);
		
		//Step 10: Input confirm password
		registerPage.enterToConfirmPasswordTextbox(password);
		
		//Step 11: Click to Register button
		registerPage.clickToRegisterButton();
		
		//Step 12: Verify success message display
		Assert.assertTrue(registerPage.isSuccessMessageDisplayed());
		
		//Step 13: Click to Logout link
		registerPage.clickToLogoutLink();
		homePage = new HomePageObject(driver);
		

		//Step 14: verify hompage slider display
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		
		
		
	}

	@Test
	public void Login_02_Login_To_System() {
		//Step 01: Click to Login link
		homePage.clickToLoginLink();
		loginPage = new LoginPageObject(driver);
		
		//Step 02: Input to Email textbox
		loginPage.enterToEmailTextbox(emailAddress);
		
		//Step 03: Input to Password textbox
		loginPage.enterToPasswordTextbox(password);
		
		//Step 04: Click to Login button
		loginPage.clickToLoginButton();

		homePage = new HomePageObject(driver);
		
		//Step 5: verify hompage slider display
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		

		
	}

	@AfterClass
	public void cleanBrowser() {
		//driver.quit();

	}

	public String getRandomEmail() {
		Random rand = new Random();
		rand.nextInt(99999);
		return "Testing" + rand.nextInt(99999) + "@live.com";

	}
	
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
