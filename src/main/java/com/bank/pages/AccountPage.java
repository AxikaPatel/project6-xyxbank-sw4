package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility
{

    By clickOnDeposit = By.xpath("//button[@ng-click='deposit()']");
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    By clickOnDepositButton = By.xpath("//button[@type='submit']");
    By clickOnWithdrawl = By.xpath("//button[@ng-click='withdrawl()']");
    By enterAmout50 = By.xpath("//input[@placeholder='amount']");
    By getClickOnWithdrawlButton = By.xpath("//button[@type='submit']");

    //click on "Deposit" Tab
    public void setClickOnDeposit()
    {
        clickOnElement(clickOnDeposit);
    }

    //Enter amount 100
    public void setEnterAmountDeposit()
    {
        sendTextToElement(enterAmount,"100");

    }

    //click on "Deposit" Button
    public void clickONDepositButton()
    {
        clickOnElement(clickOnDepositButton);
    }

    //click on "Withdrawl" Tab
    public void clickOnWithrowalTab()
    {
        clickOnElement(clickOnWithdrawl);
    }

    //Enter amount 50
    public void enterAmountWithowal()
    {
        sendTextToElement(enterAmout50,"50");
    }

    //click on "Withdrawl" Button
    public void  clickOnWithrowalButton()
    {
        clickOnElement(getClickOnWithdrawlButton);
    }




}
