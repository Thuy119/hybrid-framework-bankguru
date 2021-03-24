package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.LoginPageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	
	public LoginPageObject(WebDriver driver) {
		
		
		this.driver = driver;
		
		
	}
		
	//public void enterToLoginLink() {
		//waitForElementClickable(driver, LoginPageUI.LOGIN_LINK);
		//clickToElement(driver, LoginPageUI.LOGIN_LINK);
		
		
	//}


	public void enterToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);
		
	}


	public void enterToPasswordTextbox(String password) {
	waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
	sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
}


	public void clickToLoginButton() {
	waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
	clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	
}

	public String getEmptyEmailErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MESSAGE);
	}

	public String getInvalidEmailErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.INVALID_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.INVALID_EMAIL_ERROR_MESSAGE);
	}

	public String getEmailNotExistErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_NOT_EXIST_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_NOT_EXIST_ERROR_MESSAGE);
	}

	public String getEmptyPasswordErrorMessage1() {
		waitForElementVisible(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MESSAGE_1);
		return getElementText(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MESSAGE_1);
	}

	public String getEmptyPasswordErrorMessage2() {
		waitForElementVisible(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MESSAGE_2);
		return  getElementText(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MESSAGE_2);
	}


	public void clickToMyAccountButton() {
		waitForElementClickable(driver, LoginPageUI.MY_ACCOUNT_BUTTON);
		clickToElement(driver, LoginPageUI.MY_ACCOUNT_BUTTON);
		
	}
	}


