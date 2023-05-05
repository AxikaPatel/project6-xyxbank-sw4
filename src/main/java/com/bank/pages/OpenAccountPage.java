package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility
{
    By searchCustomer = By.cssSelector("#userSelect");
    By currency =By.xpath("//select[@id='currency']");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");

    //Search customer that created in first test
    public void searchCustomerCreatedFirstTest(String name)
    {
        selectByVisibleTextFromDropDown(searchCustomer, name);

    }







    public void setCurrency()
    {
        selectByContainsTextFromDropDown(currency,"Pound");
    }

    public void setClickOnProcess()
    {
        clickOnElement(clickOnProcess);
    }

}
