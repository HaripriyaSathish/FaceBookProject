package org.stepdefinition;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class PositiveNegative extends BaseClass {
	PojoClass p;
	@Given("To launch browser and maximize")
	public void to_launch_browser_and_maximize() {
	    
		chromeBrowser();
		maxWindow();
	}
	@When("To launch url of the application")
	public void to_launch_url_of_the_application() {
	   
		launchUrl("https://www.facebook.com/");
	}
	@When("To pass positive and negative {string} data to email field")
	public void to_pass_positive_and_negative_data_to_email_field(String email) {
		 p = new PojoClass();
		 fillText(p.getTxtEmail(), email);
		
	}
	@When("To pass positive and negative {string} to password field")
	public void to_pass_positive_and_negative_to_password_field(String pass) {
		
		fillText(p.getTxtPass(), pass);
		
	}
	@When("To click login button")
	public void to_click_login_button() {
	    
		p.getBtnLog().click();
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
		 String actualUrl = pageUrl();
		  System.out.println(actualUrl);
		  Assert.assertTrue(actualUrl.contains("privacy"));
	}


}
