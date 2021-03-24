package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.LoginPageUI;
import pageUIs.nopcommerce.MyAccountPageUI;

public class MyAccountPageObject extends BasePage {
	private WebDriver driver;

	
	public MyAccountPageObject(WebDriver driver) {
		
		
		this.driver = driver;
		
		
	}


	public void updateFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX,firstName);
	
	}


	public void updateLastNameTextbox(String lastName) {
		waitForElementVisible(driver, MyAccountPageUI.LASTNAME_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.LASTNAME_TEXTBOX,lastName);
		
	}


	public void updateEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX,emailAddress);
		
	}


	public void enterToCompanyNameTextbox(String companyName) {
		waitForElementVisible(driver, MyAccountPageUI.COMPANYNAME_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.COMPANYNAME_TEXTBOX,companyName);
	}


	public void uncheckToNewLetterCheckbox() {
		waitForElementClickable(driver, MyAccountPageUI.NEWLETTER_CHECKBOX);
		uncheckToCheckbox(driver, MyAccountPageUI.NEWLETTER_CHECKBOX);
		
	}


	public void clickToFemaleRadioButton() {
		waitForElementClickable(driver, MyAccountPageUI.GENDER_RADIO);
		clickToElement(driver, MyAccountPageUI.GENDER_RADIO);
		
	}


	public void updateDateDropdown() {
		waitForElementClickable(driver, MyAccountPageUI.DAY_DROPDOWN);
		selectDropdownByText(driver, MyAccountPageUI.DAY_DROPDOWN, "8");
		
	}


	public void updateMonthDropdown() {
		waitForElementClickable(driver, MyAccountPageUI.MONTH_DROPDOWN);
		selectDropdownByText(driver, MyAccountPageUI.MONTH_DROPDOWN, "June");
	}


	public void updateYearDropdown() {
		waitForElementClickable(driver, MyAccountPageUI.YEAR_DROPDOWN);
		selectDropdownByText(driver, MyAccountPageUI.YEAR_DROPDOWN, "1994");
		
	}


	public void clickToSaveButton() {
		waitForElementClickable(driver, MyAccountPageUI.SAVE_BUTTON);
		clickToElement(driver, MyAccountPageUI.SAVE_BUTTON);
		
	}


	public void clickToAddressLink() {
		waitForElementClickable(driver, MyAccountPageUI.ADDRESS_LINK);
		clickToElement(driver, MyAccountPageUI.ADDRESS_LINK);
		
		
	}


	public void clickToAddNewButton() {
		waitForElementClickable(driver, MyAccountPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, MyAccountPageUI.ADD_NEW_BUTTON);
		
		
	}


	public void enterToFirstNameAddressTextbox(String firstNameAddress) {
		waitForElementVisible(driver, MyAccountPageUI.FIRSTNAME_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FIRSTNAME_ADDRESS_TEXTBOX, firstNameAddress);
	}
	


	public void enterToLastNameAddressTextbox(String lastNameAddress) {
		waitForElementVisible(driver, MyAccountPageUI.LASTNAME_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.LASTNAME_ADDRESS_TEXTBOX, lastNameAddress);
		
	}


	public void enterToEmailAddressTextbox(String emailAddress1) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.LASTNAME_ADDRESS_TEXTBOX, emailAddress1);
		
	}


	public void enterToCompanyAddressTextbox(String companyAddress) {
		
		waitForElementVisible(driver, MyAccountPageUI.COMPANY_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.COMPANY_ADDRESS_TEXTBOX, companyAddress);
	}


	public void selectToCountryAddressDropdown() {
		waitForElementClickable(driver, MyAccountPageUI.COUNTRY_DROPDOWN);
		selectDropdownByText(driver, MyAccountPageUI.COUNTRY_DROPDOWN, "Australia");
		
	}


	public void selectToStateAddressDropdown() {
		waitForElementClickable(driver, MyAccountPageUI.STATE_DROPDOWN);
		selectDropdownByText(driver, MyAccountPageUI.STATE_DROPDOWN, "Other");
	}


	public void enterToCityTextbox(String cityTextbox) {
		waitForElementVisible(driver, MyAccountPageUI.CITY_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.CITY_TEXTBOX, cityTextbox);
		
	}


	public void enterToAddress1Textbox(String address1) {
		waitForElementVisible(driver, MyAccountPageUI.ADDRESS1_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ADDRESS1_TEXTBOX, address1);
		
	}


	public void enterToAddress2Textbox(String address2) {
		waitForElementVisible(driver, MyAccountPageUI.ADDRESS2_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ADDRESS2_TEXTBOX, address2);
		
	}


	public void enterToZipTextbox(String zipTextbox) {
		waitForElementVisible(driver, MyAccountPageUI.ZIPCODE_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ZIPCODE_TEXTBOX, zipTextbox);
		
		
	}


	public void enterToPhoneNumberTextbox(String phoneNumber) {
		waitForElementVisible(driver, MyAccountPageUI.PHONE_NUMBERTEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.PHONE_NUMBERTEXTBOX, phoneNumber);
		
		
	}


	public void enterToFaxNumberTextbox(String faxNumber) {
		waitForElementVisible(driver, MyAccountPageUI.FAX_NUMBER_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FAX_NUMBER_TEXTBOX, faxNumber);
		
	}
	
	


	}


