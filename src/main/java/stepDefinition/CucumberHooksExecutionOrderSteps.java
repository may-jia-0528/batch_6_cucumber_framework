package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooksExecutionOrderSteps {
	
	@Given("first execution order step")
	public void first_execution_order_step() {
	    System.out.println("=======> First execution order step");
	}

	@When("second execution order step")
	public void second_execution_order_step() {
	    System.out.println("=======> Second execution order step");
	}

	@Then("third execution order step")
	public void third_execution_order_step() {
	    System.out.println("=========> Third execution order step");
	}

}