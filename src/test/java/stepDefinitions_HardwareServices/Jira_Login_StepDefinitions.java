package stepDefinitions_HardwareServices;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Forms_Hardware_pageObjects;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class Jira_Login_StepDefinitions {

	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public LoginPage loginFunctionality;
	public Forms_Hardware_pageObjects HW;
	
	public Jira_Login_StepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	    loginFunctionality=testContextSetup.pageObjectManager.getLoginPage();
		HW=testContextSetup.pageObjectManager.getHardwareServices();
	}
	@Given("User is on Jira SSO Login Page")
	public void JiraLoginPage() {
	System.out.println("Jira SSO login Page is displayed");
	}
	@When("^User should login through (.+) and (.+)$")
	public void EnterLoginCredentials(String username, String password) throws InterruptedException {
		loginFunctionality.emailidenter(username);
		loginFunctionality.passwordenter(password);
		loginFunctionality.loginclick();
		Thread.sleep(5000);	
		loginFunctionality.Code();
		Thread.sleep(15000);
		loginFunctionality.VerifyCode();
		Thread.sleep(8000);	
		loginFunctionality.ServiceDeskPortal();
		Thread.sleep(8000);
		
	}
	@Then("User Clicks on Hardware Services Module")
	public void Jira_Home_Page() throws InterruptedException {
		HW.WindowHandles();
		HW.moduleSelection();
		Thread.sleep(5000);
		
	}
	

}
