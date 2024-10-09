package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { ".//feature/Techlistpractice.feature" }, glue = "stepdefinitions",
		dryRun = false, monochrome = true, plugin = { "pretty", "html:test-output" }

/*
 * features = "src/main/resources/feature", glue =
 * "com/testinium/step_definitions", dryRun = false, tags = "@Smoke"
 */
)
public class Runner {
}
