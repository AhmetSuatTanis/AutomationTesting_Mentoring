package com.kraft.tests.day08_typeOfWebElements;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _4_DisableElements {

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
         * go to https://the-internet.herokuapp.com/dynamic_controls
         * locate disable text bar
         * verify that the element is disabled
         * locate and click the Enable button
         * send "The element is now enabled!!" keys to the bar
         * verify that the element is enabled.
         */

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement disableTextBar = driver.findElement(By.xpath("//input[@type='text']"));

        //text bar'ın disable olup olmadığını kontrol edeceğiz.
        Assert.assertFalse(disableTextBar.isEnabled());
        Thread.sleep(1000);

        // enable button locate edilip tıklanıyor
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        Thread.sleep(4000);

        disableTextBar.sendKeys("The element is now enabled!!");
        Thread.sleep(1000);
        Assert.assertTrue(disableTextBar.isEnabled());

        WebElement enableMessageText = driver.findElement(By.cssSelector("#message"));
        String actualMessageText=enableMessageText.getText();
        System.out.println("actualMessageText = " + actualMessageText);
        String expectedMessageText="It's enabled!";
        System.out.println("expectedMessageText = " + expectedMessageText);

        Assert.assertEquals(actualMessageText,expectedMessageText);

        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();
        Thread.sleep(5000);

        WebElement disabledMessageText = driver.findElement(By.xpath("//p[@id='message']"));
        String actualMessageText1=disabledMessageText.getText();
        System.out.println("actualMessageText1 = " + actualMessageText1);
        String expectedMessageText1="It's disabled!";
        System.out.println("expectedMessageText1 = " + expectedMessageText1);

        Assert.assertEquals(actualMessageText1,expectedMessageText1);


//        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//
//        WebElement textBar = driver.findElement(By.cssSelector("input[type='text']"));
//
//        Assert.assertFalse(textBar.isEnabled());
//
//        WebElement button = driver.findElement(By.cssSelector("#input-example>button"));
//        button.click();
//        Thread.sleep(5000);
//
//        textBar.sendKeys("The element is now enabled!!");
//        Assert.assertTrue(textBar.isEnabled());

    }

    @Test
    public void task() throws InterruptedException {

        /**
         * navigate to https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
         * locate pumpkin element
         * verify that the element is enabled
         * verify that the element is selected
         * verify that the element is displayed
         * locate cabbage element
         * verify that the element is NOT enabled
         * verify that the element is NOT selected
         * verify that the element is displayed
         */

        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(2000);

        WebElement pumpkinElement = driver.findElement(By.xpath("//input[contains(@value , 'pumpkin')]"));

        Assert.assertTrue(pumpkinElement.isEnabled());
        Assert.assertTrue(pumpkinElement.isSelected());
        Assert.assertTrue(pumpkinElement.isDisplayed());

        WebElement cabbageElement = driver.findElement(By.xpath("//input[contains(@value , 'cabbage')]"));
        Assert.assertFalse(cabbageElement.isEnabled());
        Assert.assertFalse(cabbageElement.isSelected());
        Assert.assertTrue(cabbageElement.isDisplayed());



//        WebElement pumpkin = driver.findElement(By.xpath("//input[@value='pumpkin']"));
//
//        Assert.assertTrue(pumpkin.isEnabled());
//        Assert.assertTrue(pumpkin.isSelected());
//        Assert.assertTrue(pumpkin.isDisplayed());
//
//        WebElement cabbage = driver.findElement(By.xpath("//input[@value='cabbage']"));
//
//        Assert.assertFalse(cabbage.isEnabled());
//        Assert.assertFalse(cabbage.isSelected());
//        Assert.assertTrue(cabbage.isDisplayed());
//
//        WebElement selectDropDownMenu = driver.findElement(By.id("fruit-selects"));
//        selectDropDownMenu.click();
//        Thread.sleep(1000);
//
//        WebElement pear = driver.findElement(By.cssSelector("[value=\"pear\"]"));
//        pear.click();
//        System.out.println("selectDropDownMenu.getText() = " + selectDropDownMenu.getText());
    }

}

























