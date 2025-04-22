package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc7Page {

    WebDriver driver;

    By action7Element = By.id("action7Element");
    By expectedResult7Element = By.id("expectedResult7Element");

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToInitialPage() {
        driver.get("http://example.com/initialPage");
    }

    public void performAction7() {
        driver.findElement(action7Element).click();
    }

    public boolean verifyExpectedResult7() {
        return driver.findElement(expectedResult7Element).isDisplayed();
    }
}