package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc6Page {
    WebDriver driver;

    // Localizadores
    By accion6Button = By.id("accion6Button");
    By resultado6Label = By.id("resultado6Label");

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    // Método para realizar la acción 6
    public void realizarAccion6() {
        driver.findElement(accion6Button).click();
    }

    // Método para verificar el resultado esperado 6
    public boolean verificarResultado6() {
        String resultadoTexto = driver.findElement(resultado6Label).getText();
        return resultadoTexto.equals("Resultado esperado 6");
    }
}