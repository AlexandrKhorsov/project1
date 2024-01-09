package paymentsTest.step_definition;

import io.cucumber.java.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import paymentsTest.utilities.BrowserUtils;
import paymentsTest.utilities.Driver;

public class Hooks {
    public static Logger logger;
    @Before (order = 2)
    public void setUpScenario(){
        logger=Logger.getLogger("GoogleTest-Payments"); // Added logger
        PropertyConfigurator.configure("log4j.properties"); // added logger
        logger.info("------Setting up browser with further details...");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabase(){
        logger.info("----- CONNECTING TO DATABASE ");
    }

    @After(value = "@db", order = 1)
    public void closeDBConnection(){
        logger.info("------Closing browser");
        logger.info("------Take a screenshot");
    }

    @After (order = 2)
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }

    @BeforeStep
    public void runBeforeSteps(){
        logger.info("________________Running Before Each STEP ________________");

    }

    @AfterStep
    public void runsAfterSteps(){
        logger.info("________________Running AFTER Each STEP ________________");
    }
}
