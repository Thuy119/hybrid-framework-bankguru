package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;

import commons.BasePage;
import pageUIs.nopcommerce.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	private WebDriver driver;
	
	
public RegisterPageObject(WebDriver driver) {
		
		
		this.driver = driver;
}
		
		
	
	public void clickToRanderMailRadioButton() {
		waitForElementClickable(driver, RegisterPageUI.RANDER_RADIO_BUTTON);
		clickToElement(driver, RegisterPageUI.RANDER_RADIO_BUTTON);
	}

	public void enterToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
		
	}

	public void enterToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
	}

	public void enterToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailAddress);
		
		
		
	}

	public void enterToPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
		
		
	}

	public void enterToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
		
		
	}

	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
		
	}

	public boolean isSuccessMessageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.SUCCESS_MESSAGE);
		return isElementDisplay(driver, RegisterPageUI.SUCCESS_MESSAGE);
	}

	public void clickToLogoutLink() {
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver, RegisterPageUI.LOGOUT_LINK);
		
	}



	public String getEmptyFirstNameErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMPTY_FIRSTNAME_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EMPTY_FIRSTNAME_ERROR_MESSAGES);
	}



	public String getEmptyLastNameErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMPTY_LASTNAME_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EMPTY_LASTNAME_ERROR_MESSAGES);
	}



	public String getEmptyEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMPTY_EMAIL_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EMPTY_EMAIL_ERROR_MESSAGES);
	}



	public String getEmptyPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMPTY_PASSWORD_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EMPTY_PASSWORD_ERROR_MESSAGES);
	}



	public String getEmptyConfirmPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EMPTY_CONFIRM_PASSWORD_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EMPTY_CONFIRM_PASSWORD_ERROR_MESSAGES);
	}



	public String getWrongEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.WRONG_EMAIL_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.WRONG_EMAIL_ERROR_MESSAGES);
	}



	public String getExistedEmailErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EXISTED_EMAIL_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.EXISTED_EMAIL_ERROR_MESSAGES);
	}



	public String getPasswordLessThan6charactersErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_LESS_THAN_6_CHARACTERS_ERROR_MESSAGES);
		return getElementText(driver, RegisterPageUI.PASSWORD_LESS_THAN_6_CHARACTERS_ERROR_MESSAGES);
	}



	public String getPasswordNotMatchWithConfirmPasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.PASSWOR_NOT_MATCH_WITH_CONFIRM_PASSWORD_ERRORS_MESSAGES);
		return getElementText(driver, RegisterPageUI.PASSWOR_NOT_MATCH_WITH_CONFIRM_PASSWORD_ERRORS_MESSAGES);
	}



	



	
}
