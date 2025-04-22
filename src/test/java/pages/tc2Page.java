package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc2Page {

    WebDriver driver;
    
    By accion2Button = By.id("accion2ButtonId");
    By resultadoElement = By.id("resultadoElementId");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion2() {
        driver.findElement(accion2Button).click();
    }

    public String obtenerResultado() {
        return driver.findElement(resultadoElement).getText();
    }
}