package org.stepdefinition;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;

public class HooksClass extends BaseClass {
	
	@io.cucumber.java.Before
	public void openBrowser() {
		chromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");

	}
	
	@io.cucumber.java.After
	public void browserClose(Scenario s) throws IOException {
		 
//		if (s.isFailed()) {
//			String name = s.getName();
//			String replace = name.replace(" ", "_");
//			
//			takeScreenshot(replace);
//		}
		//closeBrowser();
		
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}

	}

}
