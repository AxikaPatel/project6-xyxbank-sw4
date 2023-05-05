package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerPage extends Utility
{
    By clickOnBankManagerTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    //click On "Bank Manager Login" Tab
    public void clickOnBankManagerLoginTab()
    {
        clickOnElement(clickOnBankManagerTab);
    }

}
