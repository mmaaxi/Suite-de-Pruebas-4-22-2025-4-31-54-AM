package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc1Page;

public class tc1Steps {

    tc1Page page = new tc1Page();

    @Given("que realizo acción 1")
    public void realizo_accion_1() {
        page.performAction1();
    }

    @Then("debería obtener el resultado esperado 1")
    public void deberia_obtener_el_resultado_esperado_1() {
        Assert.assertTrue(page.isExpectedResult1());
    }
}