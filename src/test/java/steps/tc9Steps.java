package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc9Page;

public class tc9Steps {

    tc9Page page = new tc9Page();

    @When("I perform action 9")
    public void iPerformAction9() {
        page.performAction9();
    }

    @Then("I should see the expected result 9")
    public void iShouldSeeTheExpectedResult9() {
        Assert.assertTrue(page.isExpectedResult9Visible());
    }
}