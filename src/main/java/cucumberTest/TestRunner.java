package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"}, tags = "@positive or @negitive" )
public class TestRunner {

}
