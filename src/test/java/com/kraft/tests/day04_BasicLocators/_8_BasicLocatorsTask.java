package com.kraft.tests.day04_BasicLocators;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _8_BasicLocatorsTask {
    /** Class Task
     * go to the url - "https://www.browserstack.com/users/sign_up"
     * maximize the window
     * accept cookies if any ,
     * fill in the blanks with the faker class
     * click "Term of service" checkbox
     * and close the window
     *
     * hint: u can use any locator you want
     *
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.browserstack.com/users/sign_up");

        Thread.sleep(2000);

        //accept cookies
        driver.findElement(By.id("accept-cookie-notification")).click();






    }
}
