package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTaggedHooks {

@Given("first tagged hooks step")
public void first_tagged_hooks_step() {
    System.out.println("first tagged hooks step");
}

@When("second first tagged hooks step")
public void second_first_tagged_hooks_step() {
    System.out.println("second first tagged hooks step");
}

@Then("thied tagged hooks step")
public void thied_tagged_hooks_step() {
    System.out.println("thied tagged hooks step");
}


}
