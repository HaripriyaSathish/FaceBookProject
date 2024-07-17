package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class SignUpFunctionality extends BaseClass{
	WebDriver driver;
	PojoClass p;
	@Given("To launch Browser")
	public void to_launch_browser() {
		chromeBrowser();
		maxWindow();
	   
	}
	@When("To launch url")
	public void to_launch_url() {
	   launchUrl("https://www.facebook.com/");
	}
	@When("To click create new account button")
	public void to_click_create_new_account_button() throws InterruptedException {
		Thread.sleep(3000);
	     p = new PojoClass();
		 btnClick(p.getCreateAcc());
	    
	}
	@When("To pass first name in FirstName field")
	public void to_pass_first_name_in_first_name_field(io.cucumber.datatable.DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l  = d.asList();
	   fillText(p.getfName(),l.get(1));
	}
	@When("To pass last name in LastName field")
	public void to_pass_last_name_in_last_name_field(io.cucumber.datatable.DataTable d) {
		List<List<String>> s= d.asLists();
		   fillText(p.getlName(), s.get(1).get(1));
	}
	@When("To pass email in email or phone number")
	public void to_pass_email_in_email_or_phone_number() throws InterruptedException {
		Thread.sleep(3000);
	    fillText(p.getEmailOrMob(), "priya2303@gmail.com");
	}
	@Then("To valiadate the credential in the chrome browser")
	public void to_valiadate_the_credential_in_the_chrome_browser() {
		 String title = pageTitle();
		 System.out.println(title);
		 Assert.assertTrue(title.contains("sign up"));    
	}

	
	

}
