package com.bankguru.login;

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

public class Madison_Lylt_Shopify {
	WebDriver driver;
	BasePage basePage;
	String userName,password, loginPageURL;
	String projectLocation = System.getProperty("user.dir");

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdriver.gecko.driver", projectLocation + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://lylt-staging.myshopify.com/admin");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		basePage = new BasePage();
		userName = "dev@madison-technology.com";
		password = "Maddie123^^";
	}

	@Test
	public void Login_01_Register_To_System() {
		loginPageURL = basePage.getPageURL(driver);
		basePage.sendKeyToElement(driver, "//input[@id='account_email']", userName);
		basePage.waitForElementVisible(driver, "//button[text()='Next']");
		basePage.clickToElement(driver, "//button[text()='Next']");
		
		basePage.sendKeyToElement(driver, "//input[@id='account_password']", password);
		basePage.clickToElement(driver, "//button[text()='Log in']");
		
	

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

}
