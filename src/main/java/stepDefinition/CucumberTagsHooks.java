package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTagsHooks {
	@Given("first tagged hooks step")
	public void first_tagged_hooks_step() {
	  System.out.println("first tagged hooks step"); 
	}

	@When("second tagged hooks step")
	public void second_tagged_hooks_step() {
		 System.out.println("second tagged hooks step"); 
	}

	@Then("Third tagged hooks step")
	public void third_tagged_hooks_step() {
		 System.out.println("Third tagged hooks step");    
	}
}
