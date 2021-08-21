package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/TestCucumberbackground.feature",
glue = "stepDefinition", monochrome = true,
plugin = {"pretty", "html:reports/cucumber-report.html" })
public class TestRunner {
}

