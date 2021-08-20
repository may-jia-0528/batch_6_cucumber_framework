package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberBackgroundSteps {
	@Given("this is common step one")
	public void this_is_common_step_one() {
		System.out.println("this is common step one");
	}

	@When("this is common step two")
	public void this_is_common_step_two() {
		System.out.println("this is common step two");
	}

	@Then("this is common step third")
	public void this_is_common_step_third() {
		System.out.println("this is common step third");
	}

	@When("step one")
	public void step_one() {
		System.out.println("step one");

	}

	@Then("step two")
	public void step_two() {
		System.out.println("step two");

	}
}
