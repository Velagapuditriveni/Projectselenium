package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Login {
	Jainbook_Loginpage lpage=new Jainbook_Loginpage();
@Given("^the user launch the chrome application$")
public void the_user_launch_the_chrome_application()  
{ 
	lpage.launch("chrome");
	
}

@When("^the user open the jainbookagency Home page$")
public void the_user_open_the_jainbookagency_Home_page() throws InterruptedException, IOException  {
	 lpage.LoginPage();
	
}
@Then("^the user login using username and password$")
public void the_user_login_using_username_and_password() throws IOException, InterruptedException  
{ for(int i=1;i<=3;i++)

{
	lpage.LoginDetails(i);
	lpage.submit();
	
	if (i<=2)
	{
    lpage.launch("chrome");
    lpage.LoginPage();
	}
}
}
@Then("^click on the login button user nagivate to the next page$")
public void click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
	 lpage.submit();
}


}
