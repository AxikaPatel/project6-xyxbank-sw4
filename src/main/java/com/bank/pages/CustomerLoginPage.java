package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility
{
    By login = By.xpath("//button[contains(text(),'Login')]");
    By logout = By.xpath("//button[contains(text(),'Logout')]");

    //click on "Login" Button
    public void setLogin()
    {
        clickOnElement(login);
    }

    //click on "Logout"
    public void setLogout()
    {
        clickOnElement(logout);
    }


}
