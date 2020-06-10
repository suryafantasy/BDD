package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.utils.Generalfunctions;
import com.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef extends TestBase{
	Logger log=Logger.getLogger(LoginStepdef.class);
	public LoginStepdef() throws IOException {
		super();
		
	}

	TestBase obj=new TestBase();
	HomePage homepage=new HomePage();
	Generalfunctions general=new Generalfunctions();

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		obj.Initialization();
		log.info("Initialize webdriver");
	}

	@When("^user click on clear cookies button$")
	public void user_click_on_clear_cookies_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.click();
		log.info("Clicking action");
	}
	
	
	@When("^User gives input as$")
	public void user_gives_input_as() throws Throwable {
     homepage.search();
	}


	@Then("^user sort the price details$")
	public void user_sort_the_price_details() throws Throwable {
	    homepage.sorting();
	}
	@When("^user lanches the Url of amkemy trip$")
	public void user_lanches_the_Url_of_amkemy_trip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.Initialization();
	}

	@Then("^User selects the round trip radio button$")
	public void user_selects_the_round_trip_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		general.radiobutton();
	}

	@Then("^user selects from and To locations from the drop down$")
	public void user_selects_from_and_To_locations_from_the_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   general.selectLocation();
	}

}
