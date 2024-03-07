package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeaveListPageObjects;
import utilities.BaseClass;

public class LeaveListPageSteps {
	WebDriver driver;
	Properties prop;

	public LeaveListPageSteps() {

		this.driver = BaseClass.getDriver();
		this.prop = BaseClass.getProperties();
//		this.logger=BaseClass.getLogger();
	}

	LeaveListPageObjects leaveListPageObjects;

	@When("I fill out the Leave list form with valid data")
	public void fillOutLeaveListForm() throws InterruptedException {
		leaveListPageObjects = new LeaveListPageObjects(driver);
		leaveListPageObjects.click_List_Leave_Tab();
		leaveListPageObjects.enter_Data(prop.getProperty("fromdate"), prop.getProperty("todate"));
		leaveListPageObjects.select_status();
		leaveListPageObjects.enter_name(prop.getProperty("employeeName"));
		
		leaveListPageObjects.select_Sub_Unit();
		leaveListPageObjects.check_PastEmp();
		

	}

	@When("I Click on Search button")
	public void clickSearchButton() {
		leaveListPageObjects.click_Search();
	}

	@Then("I should see the leave list records")
	public void verifyLeaveListRecords() {
		String actualErrorMessage =
	  			  leaveListPageObjects.getText(leaveListPageObjects.Successtext);
	  			  assertEquals("No Records Found", actualErrorMessage);
		
	}
	
	 @When("I fill out the Leave list form and not entering EmployeeName")
	    public void fillOutLeaveListFormWithoutEmployeeName() {
		 leaveListPageObjects = new LeaveListPageObjects(driver);
			leaveListPageObjects.click_List_Leave_Tab();
			leaveListPageObjects.enter_Data(prop.getProperty("fromdate"), prop.getProperty("todate"));
			leaveListPageObjects.select_status();
			leaveListPageObjects.select_Sub_Unit();
			leaveListPageObjects.check_PastEmp();
	    }

	 

	 @When("I hit  on Search button")
	 public void i_hit_on_search_button() {
		 leaveListPageObjects.click_Search();
	 }

	 	
	    @Then("I should see the leave list records with out enter name")
	    public void verifyLeaveListRecordsWithoutEnteringName() {
	    	String actualErrorMessage =
		  			  leaveListPageObjects.getText(leaveListPageObjects.Successtext);
		  			  assertEquals("No Records Found", actualErrorMessage);
			
	    }

}
