package pages;

import org.openqa.selenium.WebDriver;

public class tc1Page {

    private WebDriver driver;

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction1() {
        // Implementación de la acción 1
    }

    public boolean isExpectedResult1() {
        // Verificar si se obtiene el resultado esperado 1
        return true; // Cambiar a la lógica real de verificación
    }
}