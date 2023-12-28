package com.kraft.tests.day15_POM_1;

import com.kraft.Utilities.ConfigurationReader;
import com.kraft.pages.LoginPage;
import com.kraft.tests.TestBase;
import org.testng.annotations.Test;

public class _1_PositiveLoginTest extends TestBase {

    @Test
    public void test1() {
        LoginPage loginPage=new LoginPage();

        driver.get(ConfigurationReader.get("url"));

        loginPage.emailBox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginBtn.click();
    }

    @Test
    public void test2() {
        LoginPage loginPage=new LoginPage();

        driver.get(ConfigurationReader.get("url"));

        loginPage.loginInputs.get(0).sendKeys(ConfigurationReader.get("email"));
        loginPage.loginInputs.get(1).sendKeys(ConfigurationReader.get("password"));
        loginPage.loginInputs.get(2).click();

        loginPage.loginBtn.click();
    }
}
