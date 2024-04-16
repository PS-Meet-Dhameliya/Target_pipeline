package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumMethods;

public class LeaveListPageObjects extends SeleniumMethods {

	public LeaveListPageObjects(WebDriver driver) {

		super(driver);

	}

	private By listleaveTab = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[3]");
	private By selectFromDate = By.xpath("(//div[@class='oxd-date-input'])[1]//input");
	private By selectToDate = By.xpath("(//div[@class='oxd-date-input'])[2]//input");

	private By selectLeaveStatusDropdown = By
			.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");

	private By selectStatus = By.xpath("//div[@role='listbox']//div[5]//span");
	private By selectLeaveType = By.xpath("//div[@role='listbox']//div[5]/span");
	private By selectTypeDropdown = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
	private By searchName = By.xpath("//input[@placeholder='Type for hints...']");

	private By selectName = By.xpath("//div[@role='listbox']//div[1]//span[1]");

	private By selectSubunitDropdown = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
	private By selectSubunit = By.xpath("//div[@loading='false']//div[5]//span");

	private By checkPastEmp = By.xpath("//div[@class='oxd-switch-wrapper']//label//span	");
	private By clickOnSearch = By.xpath("//button[@type='submit']");
	public By Successtext=By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

	public void click_List_Leave_Tab() {
		clickOn(listleaveTab);

	}

	public void enter_Data(String fromdate, String todate) {
		clearOn(selectFromDate);
		sendKeys(selectFromDate, fromdate);

		clearOn(selectToDate);
		sendKeys(selectToDate, todate);
		

	}
	
	

	

	public void select_status() {

		clickOn(selectLeaveStatusDropdown);
		clickOn(selectStatus);
		clickOn(selectTypeDropdown);
		clickOn(selectLeaveType);

	}

	public void enter_name(String employeeName) throws InterruptedException {

		sendKeys(searchName, employeeName);
		Thread.sleep(3000);
		sendKeys(searchName, Keys.ARROW_DOWN);
		sendKeys(searchName, Keys.ENTER);
		
	}

	

	public void select_Sub_Unit() {

		clickOn(selectSubunitDropdown);
		clickOn(selectSubunit);
	}

	public void click_Search() {
		clickOn(clickOnSearch);
		getText(Successtext);
	}

	public void check_PastEmp() {
		clickOn(checkPastEmp);
	}
}
