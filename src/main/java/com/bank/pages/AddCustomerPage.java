package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility
{
    By enterFirstName = By.cssSelector("input[placeholder='First Name']");
    By lastNameField = By.cssSelector("input[placeholder='Last Name']");
    By postCode = By.cssSelector("input[placeholder='Post Code']");
    By clickOnAddCustome = By.cssSelector("button[type='submit']");

    //enter FirstName
    public void enterFirstName(String firstName)
    {
        sendTextToElement(enterFirstName,firstName);
    }

    //enter LastName
    public void lastName(String lastName)
    {
        sendTextToElement(lastNameField,lastName);
    }

    //enter PostCode
    public void postCode(String pCode)
    {
        sendTextToElement(postCode,pCode);
    }

    //click On "Add Customer" Button
    public void clickOnAddCustomerButton()
    {
        clickOnElement(clickOnAddCustome);
    }







}
