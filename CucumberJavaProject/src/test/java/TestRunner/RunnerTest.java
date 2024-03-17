package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Scenario1.feature"},
		glue = {"StepDefinitions", "Scenario3_Steps"},
		tags= "@Scenario3"
		)

public class RunnerTest {

}
