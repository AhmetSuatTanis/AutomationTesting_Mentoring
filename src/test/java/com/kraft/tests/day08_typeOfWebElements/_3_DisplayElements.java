package com.kraft.tests.day08_typeOfWebElements;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class _3_DisplayElements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        /**
         * navigate to https://the-internet.herokuapp.com/dynamic_loading
         * click the first link (Example 1: Element on page that is hidden)
         * locate start button and "Hello World!" text element
         * verify that Hello World! is NOT displayed
         * click start button
         * wait 5 seconds
         * verify that Hello World! is now displayed
         * take the text of element and print it
         */

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']"));
        firstLink.click();
        Thread.sleep(2000);

        //herllo world text'i için locate yapıyoruz.
        WebElement helloWorldText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        //start button'a basmadan önce hello world text'ini display mi  diye verify yapıyoruz.
        Assert.assertFalse(helloWorldText.isDisplayed());

        //start button'â basıyoruz.
        WebElement startBtn = driver.findElement(By.cssSelector("[id=\"start\"]>button"));
        startBtn.click();
        Thread.sleep(6000);

        //start button a bastıktan sonra aktif hale gelen hello world'ü verify yapıyoruz.
        Assert.assertTrue(helloWorldText.isDisplayed());
        System.out.println("helloWorldText.getText() = " + helloWorldText.getText());

//        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
//
//        WebElement firstLink = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
//        firstLink.click();
//
//        WebElement helloWorld = driver.findElement(By.xpath("//*[text()='Hello World!']"));
//        assertFalse(helloWorld.isDisplayed());
//        System.out.println("helloWorld.getText() = " + helloWorld.getText());
//
//        WebElement start = driver.findElement(By.tagName("button"));
//
//        start.click();
//        Thread.sleep(5000);
//
//        assertTrue(helloWorld.isDisplayed());
//        System.out.println("helloWorld.getText() = " + helloWorld.getText());

    }

    @Test
    public void task() throws InterruptedException {

        /**  Task
         * navigate to https://the-internet.herokuapp.com/dynamic_loading
         * click the second link (Example 2: Element rendered after the fact)
         * click start button
         * verify that hello element is displayed (bu elementin locate işlemi starta clickten sonra yapılmalı)
         * get the element text and print it
         */

        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");
        Thread.sleep(1000);

        WebElement clickBtn = driver.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']"));
        clickBtn.click();
        Thread.sleep(1000);


        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();
        Thread.sleep(5000);

        WebElement helloText = driver.findElement(By.xpath("//div/h4[text()='Hello World!']"));
        Assert.assertTrue(helloText.isDisplayed());
        System.out.println("helloText.getText() = " + helloText.getText());


//        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
//
//        WebElement secondLink = driver.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']"));
//        Thread.sleep(1000);
//        secondLink.click();
//
//        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
//        Thread.sleep(1000);
//        startBtn.click();
//        Thread.sleep(5000);
//
//        WebElement hello = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
//        Assert.assertTrue(hello.isDisplayed());
//        System.out.println("hello.getText() = " + hello.getText());


    }


}
