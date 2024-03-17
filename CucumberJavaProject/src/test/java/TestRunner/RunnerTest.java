package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Scenario1.feature"},
		glue = {"StepDefinitions", "AppHooks"},
				plugin = {"pretty"}	
		)

public class RunnerTest {

}
