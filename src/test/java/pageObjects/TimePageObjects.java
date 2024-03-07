package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumMethods;

public class TimePageObjects extends SeleniumMethods {

	public TimePageObjects(WebDriver driver) {

		super(driver);

	}

	// for Time tab
	private By TimeTab = By.xpath("//a[@href='/web/index.php/time/viewTimeModule']");
	// for TimeSheet
	private By Timesheet = By.xpath("//span[contains(text() ,'Timesheets' )]");
	// select from drop down
	private By TimesheetDropdown = By.xpath("//a[@role='menuitem']");
	// enter name
	private By SearchName = By.xpath("//input[@placeholder='Type for hints...']");

	// click on view
	private By ClickView = By.xpath("//button[@type='submit']");
	
	//redirect to reports
	
	private By ClickReports = By.xpath("//span[contains(text() ,'Reports' )]");
	// search project name
	private By searchProjectName = By.xpath("//input[@placeholder='Type for hints...']");
	//enter from date
	private By selectFromDate = By.xpath("(//div[@class='oxd-date-input'])[1]//input");
	//enter to date
	private By selectToDate = By.xpath("(//div[@class='oxd-date-input'])[2]//input");
	
	//enter name in employee records
	private By SearchEmployeeName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	
	//enter project name in employee records
	
	private By SearchProjectEmployeeRecord = By.xpath("(//input[@placeholder='Type for hints...'])[2]");
	
	//redirect to project info
	private By ClickProjectinfo = By.xpath("//span[contains(text() ,'Project Info' )]");
	
	//click on edit icon
	private By ClickEditicon = By.xpath("(//button[@type='button'])[5]");
	
	//enter customer name
	
	private By EnterCustomername = By.xpath("(//div[@class='oxd-form-row'])[1]//div//div//input");
	
	//enter description
	
	private By EnterDescription = By.xpath("//textarea[@placeholder='Type description here']");
	
	
	
	
	public By Successtext=By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
	public void click_TimeTab() {

		clickOn(TimeTab);
	}

	public void goto_Employee_Timesheet(int index) {
		clickOn(Timesheet);
		ListElement(TimesheetDropdown, index);
	}

	public void enter_name(String employeeName) throws InterruptedException {

		sendKeys(SearchName, employeeName);
		Thread.sleep(3000);
		sendKeys(SearchName, Keys.ARROW_DOWN);
		sendKeys(SearchName, Keys.ENTER);

	}
	
	public void click_View() {
		clickOn(ClickView);
		getText(Successtext);
	}
	
	public void goto_Reports(int index) {
		clickOn(ClickReports);
		ListElement(TimesheetDropdown, index);
	}
	
	public void enter_Project_name(String ProjectName) throws InterruptedException {

		sendKeys(searchProjectName, ProjectName);
		Thread.sleep(3000);
		sendKeys(searchProjectName, Keys.ARROW_DOWN);
		sendKeys(searchProjectName, Keys.ENTER);

	}
	
	public void enter_Date(String fromdate , String todate) {
		clearText(selectFromDate);
		sendKeys(selectFromDate, fromdate);
		
		clearText(selectToDate);
		sendKeys(selectToDate, todate);
	}
	
	public void goto_EmployeeReports(int index) {
		clickOn(ClickReports);
		ListElement(TimesheetDropdown, index);
	}
	
	public void enter_Employeename(String employeeName) throws InterruptedException {

		sendKeys(SearchEmployeeName, employeeName);
		Thread.sleep(3000);
		sendKeys(SearchEmployeeName, Keys.ARROW_DOWN);
		sendKeys(SearchEmployeeName, Keys.ENTER);

	}
	
	public void enter_Projectname_EMPrecords(String ProjectName) throws InterruptedException {

		sendKeys(SearchProjectEmployeeRecord, ProjectName);
		Thread.sleep(3000);
		sendKeys(SearchProjectEmployeeRecord, Keys.ARROW_DOWN);
		sendKeys(SearchProjectEmployeeRecord, Keys.ENTER);

	}
	
	
	public void goto_Projectinfo(int index) {
		clickOn(ClickProjectinfo);
		ListElement(TimesheetDropdown, index);
	}
	
	public void click_Edit_Icon() throws InterruptedException {
		Thread.sleep(3000);
		clickOn(ClickEditicon);
	}
	
	public void enter_Data(String CustomerName , String Description) throws InterruptedException {
		Thread.sleep(3000);

		clearText(EnterCustomername);
		Thread.sleep(3000);
		
		sendKeys1(EnterCustomername, CustomerName);
		Thread.sleep(3000);
		clearText(EnterDescription);
		Thread.sleep(3000);
		sendKeys1(EnterDescription, Description);
	}
	

}
