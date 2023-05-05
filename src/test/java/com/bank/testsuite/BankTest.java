package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    BankManagerPage bankManagerPage = new BankManagerPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerPage customerPage = new CustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerPage.clickOnBankManagerLoginTab();
        homePage.setAddCustomerTab();
        addCustomerPage.enterFirstName("Prime");
        addCustomerPage.lastName("Test");
        addCustomerPage.postCode("ha2 8qa");
        addCustomerPage.clickOnAddCustomerButton();


        //verify message "Customer added successfully"

        String expectedMessage = "Customer added successfully with customer id :6";
        String actualMessage = getTextFromAlert();
        Assert.assertEquals(expectedMessage, actualMessage);

        //click on "ok" button on popup.
        alertAccept();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully()
    {
        bankManagerPage.clickOnBankManagerLoginTab();
        homePage.setOpenAccountTab();
        openAccountPage.searchCustomerCreatedFirstTest("Harry Potter");

        openAccountPage.setCurrency();
        openAccountPage.setClickOnProcess();

        String expectedMessage = "Account created successfully with account Number :1016";
        String actualMessage = getTextFromAlert();
        Assert.assertEquals(expectedMessage,actualMessage);
        openAccountPage.alertAccept();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully()
    {
       customerPage.clickOnCustomerLoginTab();
       openAccountPage.searchCustomerCreatedFirstTest("Harry Potter");
       customerLoginPage.setLogin();

       //verify "Logout" Tab displayed.
        String expectedMessage = "Logout";
        System.out.println(expectedMessage);
        String actualTextMessage = getTextFromElement(By.xpath("//button[contains(text(),'Logout')]"));
      // Assert.assertEquals(expectedMessage,actualTextMessage);

        //verify "Your Name" text displayed.
        String expectedMessage1= "Harry Potter";
        String actualText = getTextFromElement(By.xpath("//span[contains(text(),'Harry Potter')]"));
        Assert.assertEquals(expectedMessage1,actualText);
        customerLoginPage.setLogout();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully()
    {
        customerPage.clickOnCustomerLoginTab();
        openAccountPage.searchCustomerCreatedFirstTest("Harry Potter");
        customerLoginPage.setLogin();
        accountPage.setClickOnDeposit();

        accountPage.setEnterAmountDeposit();
        accountPage.clickONDepositButton();
        //verify message "Deposit Successful"
        String expectedMessage2= "Deposit Successful";
        String actualText1 = getTextFromElement(By.xpath("//span[contains(text(),'Deposit Successful')]"));
        Assert.assertEquals(expectedMessage2,actualText1);
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully()
    {
        customerPage.clickOnCustomerLoginTab();
        openAccountPage.searchCustomerCreatedFirstTest("Harry Potter");
        customerLoginPage.setLogin();
        accountPage.clickOnWithrowalTab();
        accountPage.enterAmountWithowal();
        accountPage.clickOnWithrowalButton();
        //verify message "Withrowal Successful"
        String expectedMessage3= "Transaction successful";
        String actualText2 = getTextFromElement(By.xpath("//span[contains(text(),'Transaction successful')]"));
        Assert.assertEquals(expectedMessage3,actualText2);
    }

}
