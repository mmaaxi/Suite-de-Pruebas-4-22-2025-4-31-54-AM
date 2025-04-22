package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc5Page;
import static org.junit.Assert.*;

public class tc5Steps {
    WebDriver driver;
    tc5Page page;

    public tc5Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc5Page.class);
    }

    @Given("el usuario está en la página inicial")
    public void el_usuario_está_en_la_página_inicial() {
        driver.get("http://example.com");
    }

    @When("el usuario realiza acción 5")
    public void el_usuario_realiza_acción_5() {
        page.realizarAccion5();
    }

    @Then("el resultado esperado 5 debería ser visible")
    public void el_resultado_esperado_5_debería_ser_visible() {
        assertTrue(page.isResultadoEsperado5Visible());
    }
}