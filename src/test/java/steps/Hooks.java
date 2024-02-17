package steps;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hooks {

	public WebDriver driver;

	@Before
	public void Setup() {
		SeleniumDriver.setUp();
	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");

		}
			
			SeleniumDriver.tearDown();

		}
	}

