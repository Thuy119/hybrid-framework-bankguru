package pageUIs.nopcommerce;

public class RegisterPageUI {
	public static final String RANDER_RADIO_BUTTON = "//input[@id='gender-female']";
	
	public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
	public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']";
	public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
	
	public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
	public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']";
	
	
	public static final String REGISTER_BUTTON = "//input[@id='register-button']";
	
	
	public static final String SUCCESS_MESSAGE = "//div[@class='result']";
	
	public static final String LOGOUT_LINK = "//a[@class='ico-logout']";
	
	public static final String EMPTY_FIRSTNAME_ERROR_MESSAGES = "//span[@id='FirstName-error']";
	public static final String EMPTY_LASTNAME_ERROR_MESSAGES = "//span[@id='LastName-error']";
	public static final String EMPTY_EMAIL_ERROR_MESSAGES = "//span[@id='Email-error']";
	public static final String EMPTY_PASSWORD_ERROR_MESSAGES = "//span[@id='Password-error']";
	public static final String EMPTY_CONFIRM_PASSWORD_ERROR_MESSAGES = "//span[@id='ConfirmPassword-error']";
	
	
	public static final String WRONG_EMAIL_ERROR_MESSAGES = "//span[text()='Wrong email']";
	public static final String EXISTED_EMAIL_ERROR_MESSAGES = "//li[text()='The specified email already exists']";
	
	public static final String PASSWORD_LESS_THAN_6_CHARACTERS_ERROR_MESSAGES = "//span[@id='Password-error']";
	
	public static final String PASSWOR_NOT_MATCH_WITH_CONFIRM_PASSWORD_ERRORS_MESSAGES = "//span[@id='ConfirmPassword-error']";
	
}
