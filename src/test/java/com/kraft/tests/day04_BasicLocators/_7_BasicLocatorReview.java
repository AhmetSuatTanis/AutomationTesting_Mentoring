package com.kraft.tests.day04_BasicLocators;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _7_BasicLocatorReview {

    /**
     * Task
     * open a chrome browser driver and navigate to https://www.demoblaze.com/
     * locate Sign up link by using id and get text of web element then print the text
     * locate previous and next link at the bottom of the page by using name and get text of web element then print the text
     * locate Samsung Galaxy S6 by using tagname and get text of web element then print the text
     * locate Product Store at the left top of the page by using class name and get text of web element then print the text
     * locate Nokia Lumia 1520 by using link text and get text of web element then print the text
     * locate Nexus 6 by using partial link text and get text of web element then print the text
     * close the driver
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/");

        Thread.sleep(1000);

        WebElement signLink = driver.findElement(By.id("signin2"));
        System.out.println("signLink.getText() = " + signLink.getText());

        WebElement previousNext = driver.findElement(By.name("frm"));
        System.out.println("previousNext.getText() = " + previousNext.getText());

        WebElement  samsungS6= driver.findElement(By.tagName("h4"));
        System.out.println("samsungS6.getText() = " + samsungS6.getText());

        WebElement productStore = driver.findElement(By.className("navbar-brand"));
        System.out.println("productStore.getText() = " + productStore.getText());

        Thread.sleep(2000);

        WebElement nokia = driver.findElement(By.linkText("Nokia lumia 1520"));
        System.out.println("nokia.getText() = " + nokia.getText());

        WebElement lumia = driver.findElement(By.partialLinkText("Nexu"));
        System.out.println("lumia.getText() = " + lumia.getText());

        driver.quit();


    }
}
