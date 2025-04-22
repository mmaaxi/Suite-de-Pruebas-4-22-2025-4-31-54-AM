package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc3Page;

import static org.junit.Assert.assertTrue;

public class tc3Steps {

    WebDriver driver;
    tc3Page page;

    public tc3Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc3Page.class);
    }

    @When("se realiza la acción 3")
    public void seRealizaLaAccion3() {
        page.realizarAccion3();
    }

    @Then("se obtiene el resultado esperado 3")
    public void seObtieneElResultadoEsperado3() {
        assertTrue(page.verificarResultadoEsperado3());
    }
}