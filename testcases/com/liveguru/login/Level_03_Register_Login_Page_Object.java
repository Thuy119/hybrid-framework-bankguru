package com.liveguru.login;

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

import pageObjects.liveguru.HomePageObject;
import pageObjects.liveguru.LoginPageObject;
import pageObjects.liveguru.MyDashboardPageObject;


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
	public void Login_01_Empty_Email_And_Password() {
		
		
		//Step01: Mở URL -> Homepage
		driver.get("http://live.demoguru99.com/");
		homePage = new HomePageObject(driver);
		
		homePage.clickToMyAccountFooterlink();
		
		
		loginPage = new LoginPageObject(driver);
		loginPage.enterToEmailTextbox("");
		loginPage.enterToPasswordTextbox("");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getEmptyEmailErrorMessage(), "This is a required field.");
		Assert.assertEquals(loginPage.getEmptyPasswordErrorMessage(), "This is a required field.");
		
		
		
	}
	
	@Test
	public void Login_02_Invalid_Email() {
		
		loginPage.refreshCurrentPage(driver);
		
		loginPage.enterToEmailTextbox("123@456789");
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getInvalidEmailErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
				
		
		
	}
	@Test(description = "password less than 6 characters")
	public void Login_03_Invalid_Password() {
		loginPage.refreshCurrentPage(driver);
		
		
		loginPage.enterToEmailTextbox("johnken@gmail.com");
		loginPage.enterToPasswordTextbox("1234");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getInvalidPaswordErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
		
		
		
		
		
	}
	
	@Test(description = "email is not exist in system")
	public void Login_04_Incorrect_Email() {
		
		
		loginPage.refreshCurrentPage(driver);
		
		
		loginPage.enterToEmailTextbox(getRandomEmail());
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		
		Assert.assertEquals(loginPage.getIncorectEmailorPasErrorMessage(), "Invalid login or password.");
		
				
	}
	
	
	@Test
	public void Login_05_Incorrect_Password() {
		

		loginPage.refreshCurrentPage(driver);
		
		
		loginPage.enterToEmailTextbox("dam@gmail.com");
		loginPage.enterToPasswordTextbox("1234906");
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getIncorectEmailorPasErrorMessage(), "Invalid login or password.");
	
		
	}
	

	@Test
	public void Login_06_Valid_Email_And_Password() {
	
	
		
	loginPage.refreshCurrentPage(driver);
	
	
	loginPage.enterToEmailTextbox("dam@gmail.com");
	loginPage.enterToPasswordTextbox("123123");
	loginPage.clickToLoginButton();
	
	myDashboard = new MyDashboardPageObject(driver);
	
	Assert.assertTrue(myDashboard.isMyDashBoardHeaderDisplayed());
	
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
	MyDashboardPageObject myDashboard;
}
	
	
	
	
	
	

	
	
	

