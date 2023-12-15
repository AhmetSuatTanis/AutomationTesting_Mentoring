package com.kraft.tests.day12_Waits;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _1_Waits {

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
        /**
         * navigate to https://the-internet.herokuapp.com/dynamic_loading/2
         * click start button
         * verify that "Hello World!" is visible
         */
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        //implicity wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        WebElement helloText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        Assert.assertTrue(helloText.isDisplayed());

    }

    @Test
    public void test2() throws InterruptedException {
        /**
         * navigate to https://the-internet.herokuapp.com/dynamic_loading/1
         * click start button
         * verify that "Hello World!" is visible
         */
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        WebElement helloText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        WebDriverWait wait=new WebDriverWait(driver,15);

        WebElement visibleHello = wait.until(ExpectedConditions.visibilityOf(helloText));

        Assert.assertTrue(visibleHello.isDisplayed());
        Assert.assertTrue(helloText.isDisplayed());

    }

    @Test
    public void test3() throws InterruptedException {
        /**
         * navigate to https://the-internet.herokuapp.com/dynamic_loading/2
         * click start button
         * verify that "Hello World!" is visible
         */
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        //implicity wait
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        //WebElement helloText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        WebDriverWait wait=new WebDriverWait(driver,15);

        WebElement hello = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));

        Assert.assertTrue(hello.isDisplayed());

    }

    @Test
    public void wait_Task() {
        /**
         * Wait Task
         * navigate to https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html
         * locate all buttons to a web element list (start, one, two, three) (findElements)
         * Let's click the buttons respectively
         * after the click to  the last button : "All Buttons Clicked" message should be seen at the page.
         * Note: Do not use Thread.sleep(), just use dynamic waits
         *
         *  https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html sayfasına gidelim
         *  bütün butonları bir list'e alalım (start, one, two, three) (findElements)
         *  butonlara sırasıyla tıklayalım
         *  son butona tıklandıktan sonra "All Buttons Clicked" mesajının ekrana geldiğini text ile doğrulayalım.
         *  Not: Thread.sleep() metodunu kullanmayalım sadece dinamik yani akıllı wait kullanalım...
         */




    }
}






























