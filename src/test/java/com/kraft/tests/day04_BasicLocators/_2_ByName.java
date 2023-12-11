package com.kraft.tests.day04_BasicLocators;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_ByName {
    /**
     * open chrome browser and navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html
     * locate username input box by using name locator
     * send a random name to the box
     * clear the box
     * send another name to the box
     * get the second name which sent to the box and assign it to a string variable
     * print the second name
     * make verification
     * close driver.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        Thread.sleep(2000);
        username.sendKeys("Ahmet Suat");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(1000);
        username.sendKeys("Mahmut Tuncer");
        Thread.sleep(1000);

        String actualUsernameText = username.getAttribute("value");
        System.out.println("actualUsernameText = " + actualUsernameText);

        driver.quit();


    }
}
/**
 * 1. name'ler id.ler gibi dinamik olmazlar..
 * 2. ancak birden fazla web elementin name attribute değeri aynı olabilir. Bu durumda locate işleminde kullanılmaları halinde
 * selenium her zaman ilkine gider ve o web element ile işlem yapar..
 */
