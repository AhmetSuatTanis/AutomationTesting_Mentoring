package com.kraft.tests.day03_WebElementIntro;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _3_VerifyUsernameIsCorrect {

    /**
     * Task
     * open chrome browser
     * go to "https://demoqa.com/login"
     * enter "test" into the username box
     * VERIFY that "test" is displayed in the username box
     * enter "Test.!123" into the password box
     * click on login button
     * VERIFY that username is "test"
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

        String actualUsername = driver.findElement(By.id("userName-value")).getText();
        System.out.println("actualUsername = " + actualUsername);
        String expectedUsername="test";

        if (actualUsername.equals(expectedUsername)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();

    }
}
