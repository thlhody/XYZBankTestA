package pages;

import loggerUtility.LoggerUtility;
import objectData.AddCustomerObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertyUtility.PropertyUtility;

import java.util.List;

public class OpenAccountPage extends BasePage {
    public WebDriver webDriver;

    public OpenAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "userSelect")
    private WebElement selectCustomerElement;
    @FindBy(id = "currency")
    private WebElement selectCurrencyElement;
    @FindBy(xpath = "//button[text()='Process']")
    private WebElement clickProcessButton;
    @FindBy(xpath = "//*[@id='userSelect']/option")
    private List<WebElement> findByUserID;

    public void selectCustomer(String value) {
        clickMethods.clickBttNormal(selectCustomerElement);
    }

    public void selectCurrency(String text) {
        clickMethods.clickBttNormal(selectCurrencyElement);

    }

    public void pressProcess() {
        clickMethods.clickBttNormal(clickProcessButton);
        alertMethods.acceptAlert();
    }

}
