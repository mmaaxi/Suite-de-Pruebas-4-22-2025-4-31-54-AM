package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc5Page {
    WebDriver driver;

    @FindBy(id = "botonAccion5")
    WebElement botonAccion5;

    @FindBy(id = "resultado5")
    WebElement resultado5;

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion5() {
        botonAccion5.click();
    }

    public boolean isResultadoEsperado5Visible() {
        return resultado5.isDisplayed();
    }
}