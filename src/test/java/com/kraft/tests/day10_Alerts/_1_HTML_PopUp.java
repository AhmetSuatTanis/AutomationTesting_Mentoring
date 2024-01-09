package com.kraft.tests.day10_Alerts;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _1_HTML_PopUp {

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
        /**  CLASS TASK
         * navigate to https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html
         * click show alert box
         * verify that ok button can be seen on the popup
         * take the text on popup and print it (I am a fake alert box!)
         * then click on ok at the popup
         * verify that ok button cannot be seen
         */

        driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
        Thread.sleep(2000);

        WebElement fakeAlert = driver.findElement(By.id("fakealert"));
        fakeAlert.click();
        Thread.sleep(2000);

        WebElement okBtn = driver.findElement(By.id("dialog-ok"));
        Assert.assertTrue(okBtn.isDisplayed());

        WebElement alertText = driver.findElement(By.cssSelector("h2#dialog-text"));
        System.out.println("alertText.getText() = " + alertText.getText());

        okBtn.click();
        Thread.sleep(1000);

        Assert.assertFalse(okBtn.isDisplayed());


//        driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
//        WebElement fakeAlert = driver.findElement(By.cssSelector("[value=\"Show fake alert box\"]"));
//        fakeAlert.click();
//        Thread.sleep(2000);
//
//        WebElement okButton = driver.findElement(By.cssSelector("#dialog-ok"));
//        Assert.assertTrue(okButton.isDisplayed());
//
//        WebElement text = driver.findElement(By.cssSelector("#dialog-text"));
//        System.out.println("text = " + text);
//
//        okButton.click();
//
//        Assert.assertFalse(okButton.isDisplayed());

    }
}
