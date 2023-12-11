package com.kraft.tests.day04_BasicLocators;

import com.github.javafaker.Faker;
import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_2 {

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

        WebElement cokies = driver.findElement(By.id("accept-cookie-notification"));
        cokies.click();

        Thread.sleep(1000);

        Faker faker=new Faker();
        String fullName=faker.name().fullName();
        String businessEmail=faker.internet().emailAddress();
        String password=faker.internet().password(8,16,true,true,true);

        Thread.sleep(1000);

        WebElement nameInputBox = driver.findElement(By.id("user_full_name"));
        nameInputBox.sendKeys(fullName);
        Thread.sleep(1000);


        WebElement emailInputBox = driver.findElement(By.id("user_email_login"));
        emailInputBox.sendKeys(businessEmail);

        WebElement passwordInputBox = driver.findElement(By.id("user_password"));
        passwordInputBox.sendKeys(password);

        WebElement termOfService = driver.findElement(By.name("terms_and_conditions"));
        termOfService.click();

        Thread.sleep(2000);
        driver.quit();




    }
}
