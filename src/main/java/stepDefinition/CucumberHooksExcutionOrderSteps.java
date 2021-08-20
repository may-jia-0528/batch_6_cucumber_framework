package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooksExcutionOrderSteps {

	@Given("first execution order step")
	public void first_execution_order_step() {
		System.out.println("first execution order step");
	}

	@When("second execution order step")
	public void second_execution_order_step() {
		System.out.println("second execution order step");
	}

	@Then("third execution order step")
	public void third_execution_order_step() {
	System.out.println("third execution order step");
	}
}
