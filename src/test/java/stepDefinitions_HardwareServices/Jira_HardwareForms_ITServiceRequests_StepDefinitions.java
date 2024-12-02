package stepDefinitions_HardwareServices;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import pageObjects.Forms_Hardware_pageObjects;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class Jira_HardwareForms_ITServiceRequests_StepDefinitions {

	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public Forms_Hardware_pageObjects HW;
	public Jira_HardwareForms_ITServiceRequests_StepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		HW=testContextSetup.pageObjectManager.getHardwareServices();
	}
	@Then("^User completes (.+) functionality Itsr$")
	public void IT_Service_Requests(String Requests) throws InterruptedException {
		Thread.sleep(5000);
		String[] HWCategorySelection= {Requests};
		List<WebElement> HardwareCategories=testContextSetup.pageObjectManager.driver.findElements(By.cssSelector(".rw_request_type_card_name"));
		int count_IT=0;
		for(int i=0;i<HardwareCategories.size();i++) {
			count_IT++;
			System.out.println(HardwareCategories.get(i).getText());
			String Categoryname= HardwareCategories.get(i).getText();
			List<String> RequiredSubcategory = Arrays.asList(HWCategorySelection);
			if(RequiredSubcategory.contains(Categoryname)) {
				testContextSetup.pageObjectManager.driver.findElements(By.cssSelector(".rw_request_type_card_name")).get(i).click();
				Thread.sleep(5000);
				if(count_IT==1) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.Location_IT();
					Thread.sleep(3000);
					HW.locationEnter();
					HW.HardwareIT_IT_Type();
					Thread.sleep(3000);
					HW.IT_Type_Enter();
					HW.Activity();
					Thread.sleep(3000);
					HW.Activity_Enter();
					Thread.sleep(3000);
					HW.justification();
				}
				else if(count_IT==3) {
					testContextSetup.pageObjectManager.driver.switchTo().frame("rw_iframe");
					HW.location();
					Thread.sleep(3000);
					HW.locationEnter();
					HW.justification();
				}
				
				testContextSetup.pageObjectManager.driver.switchTo().parentFrame();
				HW.create();
				Thread.sleep(5000);
				HW.ITNavigation();
				HW.WindowHandles();
				System.out.println(testContextSetup.pageObjectManager.driver.getCurrentUrl());
				HW.Refresh();
				Thread.sleep(3000);
				HW.ApprovalFlow();
				HW.CommonWorkflow_IT_Service_Requests();
				break;
				
			}

		}
	}
}
