package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberBackgroundSteps {
	
	@Given("this is common step one")
	public void this_is_common_step_one() {
	    System.out.println("------------ Common Step One -------------");
	}

	@When("this is common step two")
	public void this_is_common_step_two() {
	    System.out.println("------------Common Step Two ----------------");
	}

	@Then("this is common step three")
	public void this_is_common_step_three() {
	    System.out.println("------------Common Step Three --------------");
	}

	@When("step one")
	public void step_one() {
	    System.out.println("This is step one");
	}

	@Then("step two")
	public void step_two() {
	  System.out.println("This is step two");
	}

}
