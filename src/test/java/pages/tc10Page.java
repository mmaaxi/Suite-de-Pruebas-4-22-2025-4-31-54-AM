package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc10Page {
    WebDriver driver = DriverFactory.getDriver();

    private By action10Button = By.id("action10Button");
    private By outcome10Message = By.id("outcome10Message");

    public void navigateToInitialPage() {
        driver.get("http://example.com/initialPage");
    }

    public void performAction10() {
        WebElement actionButton = driver.findElement(action10Button);
        actionButton.click();
    }

    public boolean isOutcome10Displayed() {
        WebElement outcomeMessage = driver.findElement(outcome10Message);
        return outcomeMessage.isDisplayed();
    }
}