package paymentsTest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "src/test/java/paymentsTest/step_definition"
)

public class  FailedTestRunner {
}
