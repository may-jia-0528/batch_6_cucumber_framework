package stepDefinition;

import io.cucumber.java.en.Given;

public class TagsTestSteps {
	@Given("positive login scenario")
	public void positive_login_scenario() {
	    System.out.println("positie login scenario");
	}

	@Given("invalid username scenario")
	public void invalid_username_scenario() {
	    System.out.println("invalid username scenario");
	}

	@Given("invalid password scenario")
	public void invalid_password_scenario() {
	   System.out.println("invalid password scenario");
	}

	@Given("invalid username and password scenario")
	public void invalid_username_and_password_scenario() {
	    System.out.println("invalid username and password scenario");
	}
}
