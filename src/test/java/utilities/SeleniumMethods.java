package utilities;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.Locator;

public class SeleniumMethods {

	public StringSelection stringSelection;
	public Clipboard clipboard;
	// Define objects
	private WebDriver driver;
	private WebDriverWait wait;

	// Declare objects
	public SeleniumMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void clearOn(By locarot) {
		WebElement el = driver.findElement(locarot);
		el.clear();
	}

	// Handle click action
	public void clickOn(By locator) {
		WebElement el = driver.findElement(locator);
		el.click();
	}

	// Handle send keys action
	public void sendKeys(By locator, String str) {
		WebElement el = driver.findElement((locator));
		el.clear();
		el.sendKeys(str);
	}
	
	public void sendKeys1(By locator, String str) {
		WebElement el = driver.findElement((locator));
		el.clear();
		el.sendKeys((str != null) ? str : "");
	}
	//handle suggestion name drop down
	public  void sendKeys(By locator, Keys key) {
        WebElement el = driver.findElement(locator);
        el.sendKeys(key);
	}
	
	//clear text
	
	public void clearText(By locator) {
		WebElement el = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.moveToElement(el)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.perform();
	}
	
	//handle normal drop down
	
	public void ListElement(By locator , int index) {
		
		List<WebElement> list = driver.findElements(locator);
		list.get(index).click();
	}

	// Store text from a locator
	public String getText(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}

	public void verifyTitle(String title) {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(title));
	}

	public void mouseHover(By locator) {
		WebElement el = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(el).build().perform();
	}

	public void navigateURL(String url) {
		driver.navigate().to(url);
	}

	// to compare two lists
	public boolean verifyListOptions(By locator, List<String> al) {
		List<WebElement> list = driver.findElements(locator);
		ArrayList<String> arrayList = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			arrayList.add(text);
		}
		Collections.sort(arrayList);
		Collections.sort(al);
		boolean bool = arrayList.equals(al);
		return bool;
	}

	// Wait for element to be visible
	public WebElement waitForElementVisible(By locator, int timeoutInSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Wait for element to be clickable
	public WebElement waitForElementClickable(By locator, int timeoutInSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}