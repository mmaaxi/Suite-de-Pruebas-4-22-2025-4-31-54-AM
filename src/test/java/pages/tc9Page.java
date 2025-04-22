package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc9Page {

    WebDriver driver;
    WebDriverWait wait;

    // Locators for elements
    By action9Element = By.id("perform-action-9");
    By result9Element = By.id("result-expected-9");

    public tc9Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void performAction9() {
        WebElement actionElement = wait.until(ExpectedConditions.elementToBeClickable(action9Element));
        actionElement.click();
    }

    public boolean isExpectedResult9Visible() {
        WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(result9Element));
        return resultElement.isDisplayed();
    }
}