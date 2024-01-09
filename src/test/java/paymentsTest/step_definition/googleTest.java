package paymentsTest.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import paymentsTest.utilities.Driver;

import java.util.List;

public class googleTest {

    @Given("user on the google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com/");
        Hooks.logger.info("------Launching my browser...");
    }
    @When("User in put {string} into input bar")
    public void userInPutIntoInputBar(String product) {
        Driver.getDriver().findElement(By.id("APjFqb")).clear();
        Driver.getDriver().findElement(By.id("APjFqb")).sendKeys(product+ Keys.ENTER);


    }
    @Then("title should include {string} name")
    public void titleShouldIncludeName(String product) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(product));

    }

    @Then("User should see following links")
    public void userShouldSeeFollowingLinks(List<String> expectedFooterLinks) {
        System.out.println("footerLinks = " + expectedFooterLinks);
        for (WebElement eachLink : Driver.getDriver().findElements(By.className("pHiOh"))) {
            System.out.println("eachLink = " + eachLink.getText());
        }
    }
}
