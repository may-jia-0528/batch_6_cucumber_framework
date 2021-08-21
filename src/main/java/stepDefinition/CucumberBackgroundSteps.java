package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberBackgroundSteps {
	

@Given("this is commom step one")
public void this_is_commom_step_one() {
    System.out.println("=------- commom step one -------");}

@When("this is commom step two")
public void this_is_commom_step_two() {
   System.out.println("----------commom step two----------");
}

@Then("this is commom step three")
public void this_is_commom_step_three() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("steo one")
public void steo_one() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("step two")
public void step_two() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
