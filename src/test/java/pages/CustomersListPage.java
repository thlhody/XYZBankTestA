package pages;

import loggerUtility.LoggerUtility;
import objectData.AddCustomerObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomersListPage extends BasePage {

    private WebDriver webDriver;

    public CustomersListPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    private WebElement searchCustomerBy;
    @FindBy(css = "button[ng-click='deleteCust(cust)'")
    private WebElement deleteSearchedCustomer;
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> firstNameValue;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> lastNameValue;
    @FindBy(xpath = "//table/tbody/tr/td[3]")
    private List<WebElement> postCodeValue;
    @FindBy(xpath = "//table/tbody/tr/td[4]")
    private List<WebElement> accountsList;
    @FindBy(xpath = "//table/tbody/tr/td[5]")
    private List<WebElement> deleteButton;

    public void searchCustomer(String text) {
        clickMethods.clickBttNormal(searchCustomerBy);
        inputMethods.inputText(searchCustomerBy, text);
        LoggerUtility.infoTest("User enters search Customer by: " + text);
    }

    public void deleteCustomer() {
        clickMethods.clickBttNormal(deleteSearchedCustomer);
    }

}
