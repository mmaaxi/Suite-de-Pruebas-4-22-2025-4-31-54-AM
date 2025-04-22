package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc8Page;

public class tc8Steps {
    WebDriver driver = new ChromeDriver();
    tc8Page actionPage = new tc8Page(driver);

    @Given("the application is open")
    public void the_application_is_open() {
        actionPage.openApplication();
    }

    @When("I perform action 8")
    public void i_perform_action_8() {
        actionPage.performAction8();
    }

    @Then("I should see resultado esperado 8")
    public void i_should_see_resultado_esperado_8() {
        assertTrue(actionPage.isResultadoEsperado8Displayed());
        driver.quit();
    }
}