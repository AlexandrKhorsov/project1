package paymentsTest.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "pretty", "html:target/cucumber-reports"
        },
        features = "src/test/resources/features",
        glue = "paymentsTest/step_definition",
        dryRun = false,
        tags = "@regression",
        monochrome = true

)

public class CukesRunnerTest {




}
