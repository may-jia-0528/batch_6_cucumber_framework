package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CucumberHooksSteps {
	

@Given("this is the step one of hooks")
public void this_is_the_step_one_of_hooks() {
    System.out.println("this is the step one of hooks");
}

@Given("this is the step two of hooks")
public void this_is_the_step_two_of_hooks() {
   System.out.println("this is the step two of hooks");
   }

@When("this is the step three of hooks")
public void this_is_the_step_three_of_hooks() {
  System.out.println("this is the step three of hooks");
}


}
