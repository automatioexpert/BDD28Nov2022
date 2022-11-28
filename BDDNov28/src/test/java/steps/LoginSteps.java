package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates 	to the facebook Website")
	public void user_navigates_to_the_facebook_website() {
	System.out.println("user_navigates_to_the_facebook_website");
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
	System.out.println("user_validates_the_homepage_title");
	
	}

	@Then("user enters the username")
	public void user_enters_the_username() {
		System.out.println("user_enters_the_username: ");
	}

	@Then("user enters the password")
	public void user_enters_the_password() {
		System.out.println("user_enters_the_password: ");
	}

	@Then("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("user_clicks_on_the_signin_button");
	}
}
