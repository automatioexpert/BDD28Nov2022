package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStagingSteps {
	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
	System.out.println("user_navigates_to_the_facebook_website");
	
	}
	@Then("user enters {string} username")
	public void user_enters_username(String string) {
		System.out.println("user_enters_username: " + string);
	}

	@Then("user enters {string} password")
	public void user_enters_password(String string) {

		System.out.println("user_enters_password: " + string);

	}

}
