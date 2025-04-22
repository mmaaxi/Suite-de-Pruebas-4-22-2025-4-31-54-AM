package steps;

import pages.tc10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc10Steps {
    tc10Page page = new tc10Page();

    @Given("^the user is on the initial page$")
    public void the_user_is_on_initial_page() {
        page.navigateToInitialPage();
    }

    @When("^the user performs action 10$")
    public void the_user_performs_action_10() {
        page.performAction10();
    }

    @Then("^the result should be outcome 10$")
    public void the_result_should_be_outcome_10() {
        assertTrue(page.isOutcome10Displayed());
    }
}