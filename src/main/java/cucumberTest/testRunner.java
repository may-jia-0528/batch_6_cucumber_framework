package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature/upsetTags.feature"}, 
glue = {"stepDefinition/Upset_Tags.java"}, dryRun = true, 
plugin = {"pretty", "html:reports/cucumber-report.html"}, 
tags = "@smokeTest and @group1")
public class testRunner {

}
