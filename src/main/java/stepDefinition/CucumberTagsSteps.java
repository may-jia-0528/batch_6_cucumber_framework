package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTagsSteps {

	
	@Given("This is step on")
	public void this_is_step_on() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is step one");
	}

	@When("this is step two")
	public void this_is_step_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is step two");	}

	@Then("this is step three")
	public void this_is_step_three() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is step three");	}

}
