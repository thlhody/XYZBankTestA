package helperMethods;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import propertyUtility.PropertyUtility;

import java.time.Duration;

public class AlertMethods {
    private WebDriver webDriver;

    public AlertMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void copyAlertMesage() {
        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        String accountInfo = alertText.split(":")[1].trim();
    }


    public void acceptAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
