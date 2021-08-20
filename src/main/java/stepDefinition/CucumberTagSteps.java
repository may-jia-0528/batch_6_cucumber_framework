package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTagSteps {

	@Given("this is step one")
	public void this_is_step_one() {
	  System.out.println("this is step one");
	}
	@When("this is step two")
	public void this_is_step_two() {
	  System.out.println("this is step two");
	}
	@Then("this is step three")
	public void this_is_step_three() {
	  System.out.println("this is step three");
	}
}

