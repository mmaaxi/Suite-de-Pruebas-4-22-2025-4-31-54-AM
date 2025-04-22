package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc6Page;

public class tc6Steps {
    WebDriver driver;
    tc6Page page;

    @Given("el usuario está en la página inicial")
    public void usuarioEnPaginaInicial() {
        driver = new ChromeDriver();
        page = new tc6Page(driver);
        driver.get("http://url_de_la_pagina_inicial.com");
    }

    @When("el usuario realiza la acción 6")
    public void usuarioRealizaAccion6() {
        page.realizarAccion6();
    }

    @Then("el resultado esperado es el resultado esperado 6")
    public void resultadoEsperadoEs() {
        boolean resultado = page.verificarResultado6();
        assert resultado : "El resultado esperado no coincide con el resultado obtenido.";
        driver.quit();
    }
}