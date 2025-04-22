package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc7Page;

import static org.junit.Assert.assertTrue;

public class tc7Steps {

    WebDriver driver = new ChromeDriver();
    tc7Page page = new tc7Page(driver);

    @Given("^I am on the initial page$")
    public void iAmOnTheInitialPage() {
        page.navigateToInitialPage();
    }

    @When("^I perform action 7$")
    public void iPerformAction7() {
        page.performAction7();
    }

    @Then("^I should see the expected result 7$")
    public void iShouldSeeTheExpectedResult7() {
        assertTrue(page.verifyExpectedResult7());
        driver.quit();
    }
}