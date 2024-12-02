package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Forms_Hardware_pageObjects {
	public WebDriver driver;
	public Forms_Hardware_pageObjects(WebDriver driver) {
		this.driver=driver;
	}
	By Location_IT=By.xpath("//*[@id='cd-2']");
	By IT_Type=By.xpath("//*[@id='cd-1']");
	By Activity_IT=By.xpath("//*[@id='cd-5']");
	By Type_Enter=By.xpath("//*[@id='react-select-3-input']");
	By Activity_Enter=By.xpath("//*[@id='react-select-4-input']");
	By Location=By.xpath("//*[@id='cd-2']/div/div[1]");
	By LocationDocscanner=By.xpath("//*[@id='cd-4']/div/div[1]");
	By LocationEnter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By Justification=By.xpath("//*[@name='proforma-q3t']");
	By Justification_DocScanner=By.xpath("//*[@id='proforma-edit-11']/div/div[2]/div/div[2]/div/div/textarea");
	By create=By.xpath("//*[@id='rw_popup_dialog']/div[1]/div[3]/button[2]");
	By ITNavigation=By.xpath("//*[@id='rw_request_header']/h1/a");
	By EditIssue=By.xpath("//*[@id='edit-issue']/span[2]");
	By ChangeAssignmentGroup=By.xpath("//*[@id='customfield_11333-field']");
	By Update=By.xpath("//*[@id='accxiaedit-issue-submit']");
	By AssignToMe=By.xpath("//*[@id='assign-to-me-trigger']");
	By transitionButton=By.xpath("//*[@id='opsbar-transitions_more']/span");
	By WIP_1=By.xpath("//*[@id='action_id_31']/a/div/div[3]/span");
	By WIP_IT_1=By.xpath("//*[@id='action_id_61']/a/div/div[3]/span");
	By WIP_Doc_2=By.xpath("//*[@id='action_id_101']/a/div/div[3]/span");
	By CloseButton_Doc=By.xpath("//*[@id='action_id_71']");
	By onHold=By.xpath("//*[@id='action_id_71']/a/div/div[1]");
	By onHold_IT=By.xpath("//*[@id='action_id_51']/a/div/div[1]");
	By onHoldIT=By.xpath("//*[@id='action_id_61']/a/div/div[1]");
	By subState=By.xpath("//*[@id='customfield_12711']");
	By onHoldComments=By.xpath("//*[@class='tox-edit-area__iframe']");
	By onHoldCommentsEnter=By.xpath("//*[@id='tinymce']");
	By onHoldSubmit=By.xpath("//*[@id='accxiaissue-workflow-transition-submit']");
	By WIP_2=By.xpath("//*[@id='action_id_81']/a/div/div[1]");
	By WIP_IT_2=By.xpath("//*[@id=\"action_id_101\"]/a");
	By WIP_3=By.xpath("//*[@id='action_id_11']/a/div/div[1]");
	By WIP_4=By.xpath("//*[@id='action_id_71']/a/div/div[1]");
	By CloseButton=By.xpath("//*[@id='action_id_91']/a/div/div[1]");
	By CloseButton_IT=By.xpath("//*[@id='action_id_21']/a/div/div[1]");
	By CloseNotes=By.xpath("//*[@id='customfield_11321']");
	By CloseButtonTransition=By.xpath("//*[@id='accxiaissue-workflow-transition-submit']");
	By Pfilter=By.xpath("//*[@id='cd-7']/div/div[1]");
	By Pfilterenter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By MonitorModel=By.xpath("//*[@id='lt-8']");
	By LocationEnter_PF=By.xpath("//*[@id='cd-2']/div/div/div[2]/div/input");
	By MouseClick=By.xpath("//*[@id='cd-1']/div/div[1]");
	By ChargerClick=By.xpath("//*[@id='cd-5']/div/div[1]");
	By HeadsetClick=By.xpath("//*[@id='cd-1']/div/div[1]");
	By KeyboardClick=By.xpath("//*[@id='cd-1']/div/div[1]");
	By MouseEnter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By ChargerEnter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By KeyboardEnter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By HeadsetEnter=By.xpath("//*[@class='css-1g6gooi']/div/input");
	By Justification_Mouse=By.xpath("//*[@id='proforma-edit-14']/div/div[2]/div/div[3]/div/div/textarea");
	By DSEnter=By.xpath("//*[@id='lt-6']");
	By CloseButton_IT_1=By.xpath("//*[@id=\"action_id_71\"]/a");
	//*[@id="action_id_71"]/a
	
	
	public void Refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	public void Activity() {
		driver.findElement(Activity_IT).click();
	}
	
	public void Activity_Enter() {
		driver.findElement(Activity_Enter).sendKeys("Other",Keys.ENTER);
	}
	
	public void IT_Type_Enter() {
		driver.findElement(Type_Enter).sendKeys("IPhone",Keys.ENTER);
	}
	
	public void Location_IT() {
		driver.findElement(Location_IT).click();
	}
	public void HardwareIT_IT_Type() {
		driver.findElement(IT_Type).click();
	}
	public void Charger_Enter() throws InterruptedException {
		driver.findElement(ChargerEnter).sendKeys("Apple",Keys.ENTER);
	}
	
	public void ChargerClick() throws InterruptedException {
		driver.findElement(ChargerClick).click();
	}
	
	public void DS_Enter() throws InterruptedException {
		driver.findElement(DSEnter).sendKeys("Testing ticket please ignore",Keys.ENTER);
	}
	
	public void hsClick() throws InterruptedException {
		driver.findElement(HeadsetClick).click();
	}
	
	public void hs_Enter() throws InterruptedException {
		driver.findElement(HeadsetEnter).sendKeys("Wired",Keys.ENTER);
	}
	
	public void keyboardClick() throws InterruptedException {
		driver.findElement(KeyboardClick).click();
	}
	
	public void Keboard_Enter() throws InterruptedException {
		driver.findElement(KeyboardEnter).sendKeys("Normal",Keys.ENTER);
	}
	public void mouseClick() throws InterruptedException {
		driver.findElement(MouseClick).click();
	}
	
	public void Mouse_Enter() throws InterruptedException {
		driver.findElement(MouseEnter).sendKeys("Normal",Keys.ENTER);
	}
	
	public void locationEnter_PF() throws InterruptedException {
		driver.findElement(LocationEnter_PF).sendKeys("Hyderabad, Telangana",Keys.ENTER);
	}
	
	public void location() {
		driver.findElement(Location).click();
	}

	public void monitorModel() {
		driver.findElement(MonitorModel).sendKeys("Testing ticket Please Ignore");
	}
	
	public void privacyfilter() {
		driver.findElement(Pfilter).click();
	}

	public void PrivacyFilterEnter() {
		driver.findElement(Pfilterenter).sendKeys("Laptop Screen");
		driver.findElement(Pfilterenter).sendKeys(Keys.ENTER);
	}
	public void location_DocScanner() {
		driver.findElement(LocationDocscanner).click();
	}
	public void locationEnter() {
		driver.findElement(LocationEnter).sendKeys("Hyderabad, Telangana");
		driver.findElement(LocationEnter).sendKeys(Keys.ENTER);
	}
	public void justification() {
		driver.findElement(Justification).sendKeys("Test Ticket Please Ignore");
	}
	public void justification_Doc() {
		driver.findElement(Justification_DocScanner).sendKeys("Test Ticket Please Ignore");
	}
	public void create() {
		driver.findElement(create).click();
	}
	public void ITNavigation() {
		driver.findElement(ITNavigation).click();
	}
	
	public void EditIssue() {
		driver.findElement(EditIssue).click();
	}
	public void moduleSelection() throws InterruptedException {
		String[] ModuleSelection= {"Hardware Services"};
		List<WebElement> ModuleList=driver.findElements(By.cssSelector(".rw_request_type_card_name"));
		for(int i=0;i<ModuleList.size();i++) {
			String Modulename= ModuleList.get(i).getText();
			List<String> RequiredModule = Arrays.asList(ModuleSelection);
			if(RequiredModule.contains(Modulename)) {
				driver.findElements(By.cssSelector(".rw_request_type_card_description")).get(i).click();
			}
		}
		Thread.sleep(10000);
	}
	public void WindowHandles() {
		String parent=driver.getWindowHandle();
		Set<String> AllWindows=driver.getWindowHandles();
		Iterator<String> I1= AllWindows.iterator();
		while(I1.hasNext()) {
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}
	}
	public void CommonWorkflow_Simple_Service_Requests() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(EditIssue).click();
		Thread.sleep(4000);
		driver.findElement(ChangeAssignmentGroup).click();
		Thread.sleep(4000);
		driver.findElement(ChangeAssignmentGroup).sendKeys("TestAssignmentGroupJIRA");
		Thread.sleep(4000);
		driver.findElement(ChangeAssignmentGroup).sendKeys(Keys.ENTER);
		WebElement EstimateSize=driver.findElement(By.id("customfield_19701"));
		Select objSelect =new Select(EstimateSize);
		objSelect.selectByVisibleText("MICRO < 30 min");
		driver.findElement(Update).click();
		Thread.sleep(4000);
		driver.findElement(EditIssue).click();
		Thread.sleep(4000);
		driver.findElement(AssignToMe).click();
		Thread.sleep(4000);
		driver.findElement(Update).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(WIP_1).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(onHold).click();
		Thread.sleep(4000);
		Select Substate= new Select(driver.findElement(subState));
		Substate.selectByVisibleText("Awaiting approval");
		driver.switchTo().frame(driver.findElement(onHoldComments));
		driver.findElement(onHoldCommentsEnter).click();
		Thread.sleep(4000);
		driver.findElement(onHoldCommentsEnter).sendKeys("Test Ticket Please Ignore");
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		driver.findElement(onHoldSubmit).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(WIP_2).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(CloseButton).click();
		Thread.sleep(4000);
		Select closecode =new Select(driver.findElement(By.id("customfield_11320")));
		closecode.selectByVisibleText("Transferred");
		Thread.sleep(4000);
		driver.findElement(CloseNotes).sendKeys("Testing Ticket Please Ignore");
		Thread.sleep(4000);
		WebElement ActualSize=driver.findElement(By.id("customfield_19700"));
		Select actualsize =new Select(ActualSize);
		actualsize.selectByVisibleText("MICRO < 30 min");
		Thread.sleep(4000);
		driver.findElement(CloseButtonTransition).click();
	}
	
	public void CommonWorkflow_IT_Service_Requests() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(EditIssue).click();
		Thread.sleep(2000);
		driver.findElement(ChangeAssignmentGroup).click();
		Thread.sleep(3000);
		driver.findElement(ChangeAssignmentGroup).sendKeys("TestAssignmentGroupJIRA");
		Thread.sleep(3000);
		driver.findElement(ChangeAssignmentGroup).sendKeys(Keys.ENTER);
		WebElement EstimateSize=driver.findElement(By.id("customfield_19701"));
		Select objSelect =new Select(EstimateSize);
		objSelect.selectByVisibleText("MICRO < 30 min");
		driver.findElement(Update).click();
		Thread.sleep(4000);
		driver.findElement(EditIssue).click();
		Thread.sleep(4000);
		driver.findElement(AssignToMe).click();
		Thread.sleep(4000);
		driver.findElement(Update).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(WIP_IT_1).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(onHold_IT).click();
		Thread.sleep(3000);
		Select Substate= new Select(driver.findElement(subState));
		Substate.selectByVisibleText("Awaiting approval");
		driver.switchTo().frame(driver.findElement(onHoldComments));
		driver.findElement(onHoldCommentsEnter).click();
		Thread.sleep(3000);
		driver.findElement(onHoldCommentsEnter).sendKeys("Test Ticket Please Ignore");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(onHoldSubmit).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(WIP_IT_2).click();
		Thread.sleep(4000);
		driver.findElement(transitionButton).click();
		Thread.sleep(4000);
		driver.findElement(CloseButton_IT_1).click();
		Thread.sleep(4000);
		Select closecode =new Select(driver.findElement(By.id("customfield_11320")));
		closecode.selectByVisibleText("Transferred");
		Thread.sleep(4000);
		driver.findElement(CloseNotes).sendKeys("Testing Ticket Please Ignore");
		Thread.sleep(4000);
		WebElement ActualSize=driver.findElement(By.id("customfield_19700"));
		Select actualsize =new Select(ActualSize);
		actualsize.selectByVisibleText("MICRO < 30 min");
		Thread.sleep(4000);
		driver.findElement(CloseButtonTransition).click();
	}
	
	public void ApprovalFlow() throws InterruptedException {
	String ManagerApproval=driver.findElement(By.xpath("//*[@class='vszM_mQtpD']")).getText();
	String TicketURL_Mg=driver.getCurrentUrl();
	driver.findElement(By.xpath("//*[@id='admin_menu']")).click();
	driver.findElement(By.xpath("//*[@id='scriptrunner_section']")).click();
	driver.findElement(By.xpath("//*[@id='main-navigation-tabs-2']/span")).click();
	driver.findElement(By.xpath("//*[@id='searchResults']/div[18]/a/div/span[1]/span/span")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='main-navigation-tabs-2-tab']/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(ManagerApproval);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='main-navigation-tabs-2-tab']/div/div/div/div/form/div[3]/div/button[1]/span")).click();
	Thread.sleep(4000);
	driver.get(TicketURL_Mg);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='com.atlassian.servicedesk.approvals-plugin:approve-approval']/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='admin_menu']")).click();
	driver.findElement(By.xpath("//*[@id='scriptrunner_section']")).click();
	driver.findElement(By.xpath("//*[@id='sr-exit-switch-user']/a")).click();
	Thread.sleep(3000);
	driver.get(TicketURL_Mg);
	Thread.sleep(3000);
	String ITApproval=driver.findElement(By.xpath("//*[@id='approvals-pending-web-panel-root']/div/ul/li/dl/dd/ul/li[1]/span/span[2]/span")).getText();
	String TicketURL_IT=driver.getCurrentUrl();
	driver.findElement(By.xpath("//*[@id='admin_menu']")).click();
	driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(ITApproval);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
	Thread.sleep(4000);
	driver.get(TicketURL_IT);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
	Thread.sleep(8000);
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id='header-details-user-fullname']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
	Thread.sleep(3000);
	driver.get(TicketURL_IT);
	driver.navigate().refresh();
}
	
}
