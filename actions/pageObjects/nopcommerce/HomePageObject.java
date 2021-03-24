package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.HomePageUI;

public class HomePageObject extends BasePage{
	private WebDriver driver;

	
	public HomePageObject(WebDriver driver) {
		// Map Driver cho các object dùng Constructor (hàm khởi tạo)
		// khi new 1 class lên, nó sẽ nhảy vào hàm khởi tạo đầu tiên
		// Trùng tên với class
		//Ko có kiểu trả về
		//1 Class có thể có nhiều hàm khởi tạo => tính đa hình
		// https://i.imgur.com/JL2gaF9.png
		
		
		this.driver = driver;
		//this: lay ten bien thuoc pham vi class
		
	}
	
	public boolean isHomePageSliderDisplayed() {
		waitForElementVisible(driver, HomePageUI.HOME_PAGE_SLIDER);
	
		return isElementDisplay(driver, HomePageUI.HOME_PAGE_SLIDER);
	}

	public void clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
	}

	public void clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.lOGIN_LINK);
		clickToElement(driver,  HomePageUI.lOGIN_LINK);
		
		
	}

}


