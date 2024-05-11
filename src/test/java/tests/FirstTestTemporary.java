package tests;

import objectData.AddCustomerObject;
import org.testng.annotations.Test;
import pages.*;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

public class FirstTestTemporary extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToManagerPage();

        BankManagerPage bankManagerPage = new BankManagerPage(getWebDriver();

        bankManagerPage.navigateToAddCustomerPage();

        PropertyUtility propertyUtility = new PropertyUtility("AddCustomerDataA");
        AddCustomerObject addCustomerObject = new AddCustomerObject(propertyUtility.getAllData());
        AddCustomerPage addCustomerPageA = new AddCustomerPage(getWebDriver());



    }
}
