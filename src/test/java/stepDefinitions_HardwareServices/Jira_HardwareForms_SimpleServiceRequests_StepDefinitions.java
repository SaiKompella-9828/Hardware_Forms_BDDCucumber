package stepDefinitions_HardwareServices;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import pageObjects.Forms_Hardware_pageObjects;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class Jira_HardwareForms_SimpleServiceRequests_StepDefinitions {

	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public Forms_Hardware_pageObjects HW;
	public Jira_HardwareForms_SimpleServiceRequests_StepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		HW=testContextSetup.pageObjectManager.getHardwareServices();
	}
	@Then("^User completes (.+) functionality$")
	public void Simple_Service_Requests(String Requests) throws InterruptedException {
		Thread.sleep(5000);
		String[] HWCategorySelection= {Requests};
		List<WebElement> HardwareCategories=testContextSetup.pageObjectManager.driver.findElements(By.cssSelector(".rw_request_type_card_name"));
		int count=0;
		for(int i=0;i<HardwareCategories.size();i++) {
			count++;
			System.out.println(HardwareCategories.get(i).getText());
			String Categoryname= HardwareCategories.get(i).getText();
			List<String> RequiredSubcategory = Arrays.asList(HWCategorySelection);
			if(RequiredSubcategory.contains(Categoryname)) {
				testContextSetup.pageObjectManager.driver.findElements(By.cssSelector(".rw_request_type_card_name")).get(i).click();
				Thread.sleep(5000);
				System.out.println(count);
				Thread.sleep(5000);
				if(count==18) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.mouseClick();
					Thread.sleep(3000);
					HW.Mouse_Enter();
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
				}
				else if(count==12) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
					Thread.sleep(3000);
					HW.DS_Enter();
				}
				else if(count==10) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
					Thread.sleep(3000);
					HW.DS_Enter();
				}
				else if(count==8) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.hsClick();
					Thread.sleep(3000);
					HW.hs_Enter();
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
				}
				else if(count==17) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.privacyfilter();
					Thread.sleep(3000);
					HW.PrivacyFilterEnter();
					Thread.sleep(3000);
					HW.monitorModel();
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
				}
				else if(count==15) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.keyboardClick();
					Thread.sleep(3000);
					HW.Keboard_Enter();
					Thread.sleep(3000);
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter_PF();
				}
				else {
				testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
				HW.location();
				Thread.sleep(3000);
				HW.locationEnter();
				Thread.sleep(3000);
				}
				Thread.sleep(3000);
				HW.justification();
				testContextSetup.pageObjectManager.driver.switchTo().parentFrame();
				HW.create();
				Thread.sleep(5000);
				HW.ITNavigation();
				HW.WindowHandles();
				System.out.println(testContextSetup.pageObjectManager.driver.getCurrentUrl());
				HW.CommonWorkflow_Simple_Service_Requests();
				break;
			}
		}
	}
	@Then("Hardware Services Testing is Completed")
	public void completed() {
		System.out.println("Testing is completed");
	}
}
