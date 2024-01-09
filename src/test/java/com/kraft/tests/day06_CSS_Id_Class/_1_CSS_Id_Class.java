package com.kraft.tests.day06_CSS_Id_Class;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_CSS_Id_Class {
    /**
     * navigate to http://www.eurotech.study/
     * click cookies button with css id
     * click Sign Up button css class
     * send "Ahmet" to name box by css id with tag
     * click register button by css class with tag
     * close driver
     *--------------------
     * #id
     * tagName#id
     * -------------------
     * .className
     * tagName.className
     * Note: eğer class name'de boşluk varsa silinip yerine . (nokta) konulur.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        Thread.sleep(2000);

        WebElement cookiesAcceptButton = driver.findElement(By.cssSelector("#rcc-confirm-button"));
        cookiesAcceptButton.click();

        Thread.sleep(2000);

        WebElement signUpButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        signUpButton.click();

        Thread.sleep(2000);

        WebElement nameInputBox = driver.findElement(By.cssSelector("input#signuppage-form-name-input"));
        nameInputBox.sendKeys("Ahmet");

        WebElement registerButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        registerButton.click();

        Thread.sleep(2000);
        driver.quit();



    }
}
