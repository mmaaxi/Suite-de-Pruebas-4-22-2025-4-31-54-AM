package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc4Page;

public class tc4Steps {

    WebDriver driver = new ChromeDriver();
    tc4Page page = new tc4Page(driver);

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        driver.get("URL_OF_THE_INITIAL_PAGE");
    }

    @When("the user performs action 4")
    public void the_user_performs_action_4() {
        page.performAction4();
    }

    @Then("the user should see the expected result for action 4")
    public void the_user_should_see_the_expected_result_for_action_4() {
        page.verifyExpectedResult4();
    }
}