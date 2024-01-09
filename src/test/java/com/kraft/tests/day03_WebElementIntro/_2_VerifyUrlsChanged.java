package com.kraft.tests.day03_WebElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_VerifyUrlsChanged {

    /**
     * Task
     * open chrome browser
     * go to "https://demoqa.com/login"
     * enter "test" into the username box
     * enter "Test.!123" into the password box
     * click on login button
     * VERIFY that url is changed as "https://demoqa.com/profile"
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("CHROME");

        driver.get("https://demoqa.com/login");

        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("test");

        //lazy way
        driver.findElement(By.id("password")).sendKeys("Test.!123");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);

        String expectedUrl="https://demoqa.com/profile";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();


    }
}
