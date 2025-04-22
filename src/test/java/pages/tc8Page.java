package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc8Page {
    WebDriver driver;
    
    public tc8Page(WebDriver driver){
        this.driver = driver;
    }

    public void openApplication(){
        driver.get("http://example.com");
    }

    public void performAction8(){
        driver.findElement(By.id("action8Button")).click();
    }

    public boolean isResultadoEsperado8Displayed(){
        return driver.findElement(By.id("resultadoEsperado8")).isDisplayed();
    }
}