package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{

    By addCustomerTab = By.xpath("//button[@class='btn btn-lg tab'][1]");
    By openAccountTab = By.xpath("//div[@class='center']/button[2]");





    public void setAddCustomerTab()
    {
        clickOnElement(addCustomerTab);
    }

    //click On "Open Account" Tab
    public void setOpenAccountTab()
    {
        clickOnElement(openAccountTab);
    }





}
