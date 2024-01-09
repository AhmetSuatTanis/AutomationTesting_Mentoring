package com.kraft.tests.day02_WebDriverBasics;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class _4_CallsWebDriverFactory {

    /**
     * set up a chrome driver with WebDriverFactory
     * navigate to https://tr-tr.facebook.com/
     * verify that the url is correct
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://tr-tr.facebook.com/");

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://tr-tr.facebook.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
