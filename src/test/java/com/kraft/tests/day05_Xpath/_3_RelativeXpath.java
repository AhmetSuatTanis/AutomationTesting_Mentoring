package com.kraft.tests.day05_Xpath;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _3_RelativeXpath {

    /**
     * Task
     * open chrome browser
     * go to http://www.eurotech.study/
     * click I understand button and accept cookies (use xPath-contains text)
     * locate login button (use xPath - known attribute (class) )
     * click login button
     * locate email address input box (use xPath -starts-with (id))
     * send "abc@abc.com" into email address input box
     * locate second login button (use xPath - * -> use star in xPath formula )
     * click Login button
     * close browser.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        Thread.sleep(2000);

        WebElement cookiesAccept = driver.findElement(By.xpath("//button[contains(@id,'confirm')]"));
        cookiesAccept.click();

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//a[@class='btn btn-light']"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement emailInputBox = driver.findElement(By.xpath("//input[starts-with(@id, 'loginpage-in')]"));
        emailInputBox.sendKeys("abc@abc.com");

        Thread.sleep(1000);

        WebElement loginButton2 = driver.findElement(By.xpath("//input[@*='loginpage-form-btn']"));
        loginButton2.click();

        Thread.sleep(2000);
        driver.quit();


    }
}
