package org.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.*;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	WebDriver driver;
	PojoClass p;
	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window() {
	   chromeBrowser();
	   maxWindow();
	   
	}
	@When("To launch the Facebook application")
	public void to_launch_the_facebook_application() {
	    launchUrl("https://www.facebook.com/");
	}
	@When("To pass the invalid email in email field")
	public void to_pass_the_invalid_email_in_email_field() {
		p = new PojoClass();
	    fillText(p.getTxtEmail(), "priya2303");
	   
	}
	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		fillText(p.getTxtPass(), "9877654");
	}
	@When("To click a login button")
	public void to_click_a_login_button() throws InterruptedException {
		WebElement click = p.getBtnLog();
		btnClick(click);
		threadSleep(3000);
	}
	@Then("To check whether it should navigate to the error page or homepage")
	public void to_check_whether_it_should_navigate_to_the_error_page_or_homepage() {
	  String actualUrl = pageUrl();
	  System.out.println(actualUrl);
	  Assert.assertTrue(actualUrl.contains("privacy"));
	}

}
