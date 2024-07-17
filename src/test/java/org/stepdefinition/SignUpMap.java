package org.stepdefinition;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class SignUpMap extends BaseClass{
	PojoClass p;
	@Given("To launch chrome browser")
	public void to_launch_chrome_browser() {
	       chromeBrowser();
	       maxWindow();
	}
	@When("To launch fb url in chrome")
	public void to_launch_fb_url_in_chrome() {
	       launchUrl("https://www.facebook.com/");
	}
	@When("To click create new acc Button")
	public void to_click_create_new_acc_button() throws InterruptedException {
		   Thread.sleep(3000);
		   p = new PojoClass();
		   btnClick(p.getCreateAcc());
	}
	@When("To pass first name in First text box")
	public void to_pass_first_name_in_first_text_box(io.cucumber.datatable.DataTable d) throws InterruptedException {
		   Thread.sleep(3000);
		   Map<String, String> m = d.asMap(String.class, String.class);
		   fillText(p.getfName(), m.get("Firstname Two"));
	}
	@When("To pass last name in surname text box")
	public void to_pass_last_name_in_surname_text_box(io.cucumber.datatable.DataTable d) {
	       List<Map<String, String>> m = d.asMaps();
		   fillText(p.getlName(), m.get(1).get("Lastname Three"));
	}
	@Then("To validate the browser")
	public void to_validate_the_browser() {
		 String title = pageTitle();
		 System.out.println(title);
		 Assert.assertTrue(title.contains("signin"));
	   
	}

}
