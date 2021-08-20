import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
glue = "stepDefinition", monochrome = true,
plugin = {"pretty", "html:reports/cucumber-report.html" }
, tags = "@smokeTest ")
public class TestRunner {
}