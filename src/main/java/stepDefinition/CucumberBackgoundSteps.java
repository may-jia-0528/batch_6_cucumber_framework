package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberBackgoundSteps {

	@Given("this is common step one")
	public void this_is_common_step_one() {
	    System.out.println("----------------- COMMON STEP ONE ----------------------");
	}

	@When("this is common step two")
	public void this_is_common_step_two() {
	    System.out.println("----------------- COMMON STEP TWO ----------------------");

	}

	@Then("this is common step three")
	public void this_is_common_step_three() {
	    System.out.println("----------------- COMMON STEP THREE ----------------------");

	}

	@When("step one")
	public void step_one() {
	   System.out.println("THIS IS STEP ONE");
	}

	@Then("step two")
	public void step_two() {
	   System.out.println("THIS IS STEP TWO");
	}
	
}
