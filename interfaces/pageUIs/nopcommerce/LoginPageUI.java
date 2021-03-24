package pageUIs.nopcommerce;

public class LoginPageUI {
	public static final String LOGIN_LINK = "//a[@class='ico-login']";
	public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
	public static final String LOGIN_BUTTON = "//button[text()='Log in']";
	public static final String EMPTY_EMAIL_ERROR_MESSAGE = "//span[@id='Email-error']";
	public static final String INVALID_EMAIL_ERROR_MESSAGE = "//span[@id='Email-error']";
	public static final String EMAIL_NOT_EXIST_ERROR_MESSAGE ="//li[text()='No customer account found']";
	
	public static final String EMPTY_PASSWORD_ERROR_MESSAGE_1 ="//div[text()='Login was unsuccessful. Please correct the errors and try again.']";
	public static final String EMPTY_PASSWORD_ERROR_MESSAGE_2 = "//li[text()='The credentials provided are incorrect']";
	
	public static final String MY_ACCOUNT_BUTTON = "//a[text()='My account']";

}
