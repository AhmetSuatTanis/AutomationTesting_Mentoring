package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashboardPage  extends BasePage{

    @FindBy(xpath = "//h2")
    public WebElement userName;

    public void verifyUserName(String expectedUserName){
       //expectedUserName= ConfigurationReader.get("userName");
        Assert.assertEquals(userName.getText(), expectedUserName);
    }


}
