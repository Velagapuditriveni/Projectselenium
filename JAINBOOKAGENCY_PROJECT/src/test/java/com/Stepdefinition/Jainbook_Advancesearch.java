package com.Stepdefinition;

import com.pages.Jainbook_Advancesearchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Advancesearch {
	Jainbook_Advancesearchpage sp=new Jainbook_Advancesearchpage();
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() throws Throwable {
		sp.launch("chrome");
		sp.launchpage();
		sp.login();
	}

	@When("^the user clicks advanced search$")
	public void the_user_clicks_advanced_search() throws Throwable {
		sp.search();
		}

	@Then("^the user fills the form$")
	public void the_user_fills_the_form() throws Throwable {
		sp.filldetails();
	}

	@Then("^user clicks the search button then the user gets the searched book$")
	public void user_clicks_the_search_button_then_the_user_gets_the_searched_book() throws Throwable {
		sp.close_search();
	}
}
