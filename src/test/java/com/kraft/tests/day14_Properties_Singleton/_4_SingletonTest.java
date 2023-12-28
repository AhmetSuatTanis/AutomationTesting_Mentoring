package com.kraft.tests.day14_Properties_Singleton;

import com.kraft.Utilities.Driver;
import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class _4_SingletonTest {
    @Test
    public void test1() {
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https:/www.amazon.com.tr");

        WebDriver driver=Driver.get();
        driver.get("https:/www.amazon.com.tr");
    }

    @Test
    public void test2() {
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https:/www.google.com.tr");
        WebDriver driver=Driver.get();
        driver.get("https:/www.google.com.tr");
    }

    @Test
    public void test3() {
        WebDriver driver=Driver.get();
        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
    }
}
