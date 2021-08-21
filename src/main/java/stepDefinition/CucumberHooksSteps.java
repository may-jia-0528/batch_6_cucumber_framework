package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooksSteps {
	
	@Given("this is step one of hooks")
	public void this_is_step_one_of_hooks() {
	   System.out.println("This is step one of hooks");
	}

	@When("this is step two of hooks")
	public void this_is_step_two_of_hooks() {
	    System.out.println("This is step two of hooks");
	}

	@Then("this is step three of hooks")
	public void this_is_step_three_of_hooks() {
	    System.out.println("This is step three of hooks");
	}

}
