package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = ".//features",
    tags = "@login11",
    glue = {"stepDefinitions", "hooks"},
    monochrome = true,
    plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cucumber-results.xml",
        "utilities.ExtentReportListener"
        
    }
)
public class TestngTestRunner extends AbstractTestNGCucumberTests {
}
