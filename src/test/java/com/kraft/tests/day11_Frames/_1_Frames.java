package com.kraft.tests.day11_Frames;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _1_Frames {
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
         * navigate to https://testpages.herokuapp.com/styled/iframes-test.html
         * switch to first frame by id
         * take the "iFrame" heading and print it
         * return to main html
         * switch to second frame by web element
         * take the "Nested Page Example" heading and print it
         */

        driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");

        driver.switchTo().frame("thedynamichtml");
        WebElement iFrame = driver.findElement(By.xpath("//h1[text()='iFrame']"));
        System.out.println("iFrame.getText() = " + iFrame.getText());

        driver.switchTo().parentFrame();

        WebElement secondFrame = driver.findElement(By.xpath("//iframe[@id='theheaderhtml']"));
        driver.switchTo().frame(secondFrame);

        WebElement nestedPageText = driver.findElement(By.xpath("//h1[text()='Nested Page Example']"));
        System.out.println("nestedPageText.getText() = " + nestedPageText.getText());

//        driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");
//        driver.switchTo().frame("thedynamichtml");
//
//        WebElement titleFrame = driver.findElement(By.tagName("h1"));
//        String actualTitle = titleFrame.getText();
//        String expectedTitle="iFrame";
//
//        Assert.assertEquals(actualTitle,expectedTitle);
//
//        driver.switchTo().defaultContent();
//        //driver.switchTo().parentFrame();
//
//        WebElement secondFrame = driver.findElement(By.cssSelector("header-iframe>iframe"));
//        driver.switchTo().frame(secondFrame);
//
//        titleFrame= driver.findElement(By.tagName("h1"));
//        actualTitle=titleFrame.getText();
//        expectedTitle="Nested Page Example";
//
//        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void test2() {
        /**
         * navigate to https://demoqa.com/nestedframes
         * switch to parent frame by id
         * take the "Parent frame" heading and print it
         * switch to child frame by index
         * take the "Child frame" heading and print it
         * switch to main frame related method
         * take the "Nested Frames" heading and print it
         */


        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");
        WebElement parentFrame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        System.out.println("parentFrame.getText() = " + parentFrame.getText());

        driver.switchTo().frame(0);
        WebElement childFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println("childFrame.getText() = " + childFrame.getText());

        driver.switchTo().defaultContent();
        WebElement nestedFrame = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
        System.out.println("nestedFrame.getText() = " + nestedFrame.getText());


//        driver.get("https://demoqa.com/nestedframes");
//
//        driver.switchTo().frame("frame1");
//
//        WebElement parentFrame = driver.findElement(By.tagName("body"));
//        System.out.println("parentFrame.getText() = " + parentFrame.getText());
//
//        driver.switchTo().frame(0);
//        WebElement childFrame = driver.findElement(By.tagName("p"));
//        System.out.println("childFrame.getText() = " + childFrame.getText());
//
//        driver.switchTo().defaultContent();
//
//        WebElement mainTitle = driver.findElement(By.cssSelector(".main-header"));
//        System.out.println("mainTitle.getText() = " + mainTitle.getText());

    }
}
