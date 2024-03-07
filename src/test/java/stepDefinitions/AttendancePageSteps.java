package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AttendancePageObjects;
import utilities.BaseClass;

public class AttendancePageSteps {
	WebDriver driver;
	Properties prop;

	public AttendancePageSteps() {

		this.driver = BaseClass.getDriver();
		this.prop = BaseClass.getProperties();

	}

	AttendancePageObjects attendancePageObjects;
	
	@Given("^user is on the Attendance page$")
    public void userIsOnAttendancePage() {
    }

    @When("^user enter time and note and click on OUT button$")
    public void userEnterTimeAndNoteAndClickOnOutButton() {
    }

    @When("^user enter IN time and enter IN note and click on IN button$")
    public void userEnterInTimeAndNoteAndClickOnInButton() {
    }

    @Then("^user should be successfully punched out and punched in$")
    public void userShouldBeSuccessfullyPunchedOutAndIn() {
    }

}
