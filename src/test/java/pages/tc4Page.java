package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class tc4Page {

    private WebDriver driver;
    private By action4Element = By.id("ACTION_4_ELEMENT_ID");
    private By result4Element = By.id("RESULT_4_ELEMENT_ID");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction4() {
        driver.findElement(action4Element).click();
    }

    public void verifyExpectedResult4() {
        String resultText = driver.findElement(result4Element).getText();
        if (!resultText.equals("EXPECTED_RESULT_4")) {
            throw new AssertionError("Expected " + "EXPECTED_RESULT_4" + " but found " + resultText);
        }
    }
}