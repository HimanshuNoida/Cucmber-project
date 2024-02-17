package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.objects.CarBase;
import utils.SeleniumDriver;

public class BasePage {

	public static WebDriver driver;
	public static CarBase carBase;
	private WebElement mousehoverElement;


	public BasePage() {

		driver = SeleniumDriver.getDriver();
		carBase=new CarBase();
	}

	public void mouseHover(String locator) {
		if (locator.endsWith("_XPATH"))
			mousehoverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));

		else if (locator.endsWith("_ID"))
			mousehoverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));

		else if (locator.endsWith("_CSS"))
			mousehoverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));

		new Actions(driver).moveToElement(mousehoverElement).perform();
	}

	public void click(String locator) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();

		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();

		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();

		}
	}

	public boolean IsElement(String locator) {
		try {
			if (locator.endsWith("_XPATH")) {
				driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();

			} else if (locator.endsWith("_ID")) {
				driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();

			} else if (locator.endsWith("_CSS")) {
				driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();

			}
			return true;
		} catch (Throwable e) {
			return false;
		}
	}

	public void type(String locator, String value) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
			;

		}

	}

	public static String getText(String locator) {
		if (locator.endsWith("_XPATH")) {
			locator = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).getText();

		} else if (locator.endsWith("_ID")) {
			locator = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).getText();

		} else if (locator.endsWith("_CSS")) {
			locator = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).getText();
			;

		}
		return locator;
	}
}
