package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility
{
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    //click on "Customer Login" Tab
    public void clickOnCustomerLoginTab()
    {
        clickOnElement(customerLogin);
    }





}
