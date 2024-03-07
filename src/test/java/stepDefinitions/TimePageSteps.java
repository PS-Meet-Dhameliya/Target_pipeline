package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LeaveListPageObjects;
import pageObjects.TimePageObjects;
import utilities.BaseClass;

public class TimePageSteps {
	
	WebDriver driver;
	Properties prop;

	public TimePageSteps() {

		this.driver = BaseClass.getDriver();
		this.prop = BaseClass.getProperties();

	}

	TimePageObjects timePageObjects;
	
	 @Given("user is on Timesheet page")
	    public void userIsOnTimesheetPage() {
		 timePageObjects = new TimePageObjects(driver);
		 timePageObjects.click_TimeTab();
		 timePageObjects.goto_Employee_Timesheet(1);
	    }

	    @When("user enter  employee name")
	    public void userEntersEmployeeName() throws InterruptedException {
	    	timePageObjects.enter_name(prop.getProperty("employeeName"));
	    }

	    @And("click on view")
	    public void clicksOnView() {
	    	timePageObjects.click_View();
	    }

	    @Then("user should see the timesheet records of employee")
	    public void userShouldSeeTimesheetRecords() {
	    	System.out.println();
	    }
	    
	    @Given("user is on Reports page")
	    public void userIsOnReportsPage() {
	    	timePageObjects.goto_Reports(0);
	    }

	    @When("User enter Project name and project data range")
	    public void userEnterProjectNameAndDataRange() throws InterruptedException {
	    	timePageObjects.enter_Project_name(prop.getProperty("ProjectName"));
	    	timePageObjects.enter_Date(prop.getProperty("fromdate"), prop.getProperty("todate"));
	    }

	    @When("click on view button")
	    public void clickOnViewButton() {
	    	timePageObjects.click_View();
	    }

	    @Then("user should see the projects reports")
	    public void userShouldSeeReports() {
	    	System.out.println();
	    }
	    
	    @Given("user is on the Reports page")
	    public void userIsOnReportsPage1() {
	    	timePageObjects.goto_Reports(1);
	    	
	    	
	    }

	    @When("User enter Employee name and Project name and project data range")
	    public void userEnterEmployeeAndProjectNameAndDataRange() throws InterruptedException {
	    	timePageObjects.enter_Employeename(prop.getProperty("employeeName"));
	    	timePageObjects.enter_Projectname_EMPrecords(prop.getProperty("ProjectName"));
	    	timePageObjects.enter_Date(prop.getProperty("fromdate"), prop.getProperty("todate"));
	    	
	    }

	    @When("click on  the view button")
	    public void clickOnViewButton1() {
	    	timePageObjects.click_View();
	    }

	    @Then("user should see the employee reports")
	    public void userShouldSeeEmployeeReports() {
	    	String actualErrorMessage =
	  			  timePageObjects.getText(timePageObjects.Successtext);
	  			  assertEquals("No Records Found", actualErrorMessage);
	    	
	    }
	    
	    @Given("user is on project info page")
	    public void userIsOnProjectInfoPage() {
	    	timePageObjects.goto_Projectinfo(0);
	    }

	    @When("user click on edit icon in found records")
	    public void userClickOnEditIcon() throws InterruptedException {
	    	timePageObjects.click_Edit_Icon();
	    }

	    @When("edit customer name and description")
	    public void editCustomerNameAndDescription() throws InterruptedException {
	    	timePageObjects.enter_Data(prop.getProperty("CustomerName"), prop.getProperty("Description"));
	    }

	    @When("click on save")
	    public void clickOnSave() {
	    	timePageObjects.click_View();
	    }

	    @Then("user should see the successful message")
	    public void userShouldSeeSuccessfulMessage() {
	    	System.out.println();
	    }

}
