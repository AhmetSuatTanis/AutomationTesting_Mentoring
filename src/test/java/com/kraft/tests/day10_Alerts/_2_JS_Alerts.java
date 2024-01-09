package com.kraft.tests.day10_Alerts;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _2_JS_Alerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        /**   CLASS TASK
         * navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
         * click alert box
         * then take message on the js popup and print it
         * accept alert
         *
         * click show confirm box
         * then take message on the js popup and print it
         * dismiss alert
         * verify that you clicked cancel button (Alınan mesajın Cancel içerdiğini doğrula)
         *
         * click show prompt box
         * then take message on the js popup and print it
         * send Ahmet to the popup box
         * accept alert
         * verify that Ahmet is sent to the box.
         *
         * NOT: tüm taskı tek test metodunda yapabilirsiniz..
         */

        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        Thread.sleep(2000);

        WebElement alertBtn = driver.findElement(By.id("alertexamples"));
        alertBtn.click();

        Alert alert=driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        Thread.sleep(2000);
        alert.accept();

        WebElement confirmBtn = driver.findElement(By.id("confirmexample"));
        confirmBtn.click();
        Thread.sleep(2000);
        System.out.println("alert.getText() = " + alert.getText());
        alert.dismiss();


//        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//        Thread.sleep(2000);
//
//        WebElement firstAlert = driver.findElement(By.id("alertexamples"));
//        firstAlert.click();
//
//        Alert alert = driver.switchTo().alert();
//        System.out.println("alert.getText() = " + alert.getText());
//        alert.accept();
//        Thread.sleep(2000);
//
//        WebElement secondAlert = driver.findElement(By.cssSelector("#confirmexample"));
//        secondAlert.click();
//        System.out.println("alert.getText() = " + alert.getText());
//        alert.dismiss();
//
//        WebElement message = driver.findElement(By.id("confirmexplanation"));
//        Assert.assertTrue(message.getText().contains("Cancel"));
//
//        WebElement thirdAlert = driver.findElement(By.id("promptexample"));
//        thirdAlert.click();
//        System.out.println("alert.getText() = " + alert.getText());
//
//        alert.sendKeys("Ahmet");
//        alert.accept();
//
//        WebElement promptReturnExplanation = driver.findElement(By.id("promptreturn"));
//        Assert.assertTrue(promptReturnExplanation.getText().contains("Ahmet"));
    }

}
