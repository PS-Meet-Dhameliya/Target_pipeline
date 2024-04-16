package hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseClass;

public class CucumberHooks {
	
	 	

    @Before
    public void beforeScenario() throws IOException {
    	BaseClass.startDriver();
    }
    
  
    @After
    public void afterScenario() {
        BaseClass.stopDriver();
    }
    
    @AfterStep
    public void takeScrenshot(Scenario scenario) {
    	
    	WebDriver driver = BaseClass.getDriver();
    	
    	final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	scenario.attach(screenshot, "image/png", "image");
    }

}
