package com.kraft.tests.day15_POM_1;

import com.kraft.tests.TestBase;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.pages.LoginPage;
import org.testng.annotations.Test;

public class _2_PositiveLoginTestWithMethod extends TestBase {
    @Test
    public void test1() {
        driver.get(ConfigurationReader.get("url"));

        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }

    @Test
    public void test2() {
        driver.get(ConfigurationReader.get("url"));

        LoginPage loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("email"),ConfigurationReader.get("password"));
    }

    @Test
    public void test3() {
        driver.get(ConfigurationReader.get("url"));

        LoginPage loginPage=new LoginPage();
        loginPage.login("tester@gmail.com","Ahmet12345");
    }


}
