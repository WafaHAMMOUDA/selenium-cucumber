package com.e2eTest.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {
	public class Teardown {
		 /**
		* This method is used to close browser. This method is called after the
		* invocation of each test method in given class.
		*
		* @After Methods annotated with @After execute after every scenario.
		*/
		@After
		public void quitDriver(Scenario scenario) {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) SetUp.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "screenshot");

			}
			SetUp.getDriver().quit();
			SetUp.getLogger().info("Scenario: " + scenario.getName() + "Finished" + scenario.getStatus());

		}

	}
}
