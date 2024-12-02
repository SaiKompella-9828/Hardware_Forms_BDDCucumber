package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {

		this.driver=driver;

	}
	
	By emailids=By.xpath("//*[@id='input27']");
	By passwords=By.xpath("//*[@id='input35']");
	By Login=By.xpath("//*[@id='form19']/div[2]/input");
	By ReceiveCode=By.xpath("//*[@id='form62']/div[2]/input");
	By Verify=By.xpath("//*[@id='form80']/div[2]/input");
	By servicedeskportal=By.xpath("//*[@class='aui-header-primary']/ul/li[9]/a");

	public void emailidenter(String emailid) {
		driver.findElement(emailids).sendKeys(emailid);
	}
	public void passwordenter(String password) {
		driver.findElement(passwords).sendKeys(password);
	}
	public void loginclick() {
		driver.findElement(Login).click();
	}
	public void Code() {
		driver.findElement(ReceiveCode).click();
	}
	public void VerifyCode() {
		driver.findElement(Verify).click();
	}
	public void ServiceDeskPortal() {
		driver.findElement(servicedeskportal).click();
	}
	
	
	
	
}
