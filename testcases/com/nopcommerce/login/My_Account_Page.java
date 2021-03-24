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
import pageObjects.nopcommerce.MyAccountPageObject;
import pageObjects.nopcommerce.RegisterPageObject;

public class My_Account_Page  extends BaseTest {
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
	public void My_Account_01_Update_Customer_Info() {
		
		homePage = new HomePageObject(driver);
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		loginPage.enterToEmailTextbox("johnng123@gmail.com");
		loginPage.enterToPasswordTextbox("123456");
		loginPage.clickToLoginButton();
		
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		
		loginPage.clickToMyAccountButton();
		
		myAccountPage = new MyAccountPageObject(driver);
		
		myAccountPage.clickToFemaleRadioButton();
		myAccountPage.updateFirstNameTextbox("Automation");
		myAccountPage.updateLastNameTextbox("FC");
		myAccountPage.updateDateDropdown();
		myAccountPage.updateMonthDropdown();
		myAccountPage.updateYearDropdown();
		
		myAccountPage.updateEmailTextbox("automationfc.vn@gmail.com");
		myAccountPage.enterToCompanyNameTextbox("Automation FC");
		myAccountPage.uncheckToNewLetterCheckbox();
		
		myAccountPage.clickToSaveButton();
		
		
		
		
		
	}
	
	@Test
	public void My_Account_02_Add_Address() {
		
		myAccountPage.clickToAddressLink();
		myAccountPage.clickToAddNewButton();
		
		myAccountPage.enterToFirstNameAddressTextbox("Automation");
		myAccountPage.enterToLastNameAddressTextbox("FC");
		myAccountPage.enterToEmailAddressTextbox("automationfc.vn@gmail.com");
		myAccountPage.enterToCompanyAddressTextbox("VN");
		myAccountPage.selectToCountryAddressDropdown();
		myAccountPage.selectToStateAddressDropdown();
		myAccountPage.enterToCityTextbox("");
		myAccountPage.enterToAddress1Textbox("");
		myAccountPage.enterToAddress2Textbox("");
		myAccountPage.enterToZipTextbox("");
		myAccountPage.enterToPhoneNumberTextbox("");
		myAccountPage.enterToFaxNumberTextbox("");
		
		
		
		
		
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
	MyAccountPageObject myAccountPage;
	
	
	

}
