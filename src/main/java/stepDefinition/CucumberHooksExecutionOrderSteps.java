package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooksExecutionOrderSteps {
	
	@Given("first execuation order step")
	public void first_execuation_order_step() {
	    System.out.println("===========> First Execuation order step <===========");
	}

	@When("second execuation order step")
	public void second_execuation_order_step() {
	    System.out.println("===========> Second Execuation order step <===========");

	}

	@Then("third execution order step")
	public void third_execution_order_step() {
	    System.out.println("===========> Third Execuation order step <===========");

	}

}
