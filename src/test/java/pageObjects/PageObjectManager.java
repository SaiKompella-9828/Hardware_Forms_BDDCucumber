package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage loginFunctionality;
	public Forms_Hardware_pageObjects HW;

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		loginFunctionality=new LoginPage(driver);
		return loginFunctionality;
	}
	
	public Forms_Hardware_pageObjects getHardwareServices() {
		HW=new Forms_Hardware_pageObjects(driver);
		return HW;
	}

}
