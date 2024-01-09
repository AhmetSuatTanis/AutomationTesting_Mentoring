package com.kraft.tests.day03_WebElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_VerifyUrlNotChanged {

    /**
     * Task
     * open chrome browser
     * go to https://demoqa.com/login
     * click on login button
     * VERIFY that url is not changed
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");

        String expectedUrl ="https://demoqa.com/login";

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
