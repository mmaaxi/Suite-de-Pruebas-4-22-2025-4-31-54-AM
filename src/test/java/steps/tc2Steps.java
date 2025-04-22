package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import pages.tc2Page;

public class tc2Steps {

    WebDriver driver = new ChromeDriver();
    tc2Page page = new tc2Page(driver);

    @Given("el usuario está en la página de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        driver.get("URL_DE_LA_PAGINA_DE_INICIO");
    }

    @When("el usuario realiza acción 2")
    public void elUsuarioRealizaAccion2() {
        page.realizarAccion2();
    }

    @Then("el usuario debería ver el resultado esperado 2")
    public void elUsuarioDeberiaVerElResultadoEsperado2() {
        String resultado = page.obtenerResultado();
        assert resultado.equals("Resultado esperado 2");
    }
}