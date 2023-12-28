package com.kraft.tests.day08_typeOfWebElements;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class _2_RadioButton {
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
         * navigate to http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
         * locate yellow element
         * verify that the element is NOT selected
         * click the element
         * verify that the element is selected
         *
         * locate blue element
         * verify that the element is displayed
         * click the element
         * verify that the blue element is selected
         * verify that*/

        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement yellow = driver.findElement(By.cssSelector("[value=\"yellow\"]"));

        //yellow seçili değil
        Assert.assertFalse(yellow.isSelected());
        yellow.click();
        Thread.sleep(1500);
        Assert.assertTrue(yellow.isSelected());

        WebElement blue = driver.findElement(By.cssSelector("[value=\"blue\"]"));
        Assert.assertFalse(blue.isSelected());
        blue.click();
        Thread.sleep(1500);
        Assert.assertTrue(blue.isSelected());




//        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//
//        WebElement yellow = driver.findElement(By.cssSelector("[value='yellow']"));
//
//        assertFalse(yellow.isSelected());
//        yellow.click();
//        assertTrue(yellow.isSelected());
//
//        WebElement blue = driver.findElement(By.cssSelector("[value='blue']"));
//        assertTrue(blue.isDisplayed());
//        blue.click();
//        assertTrue(blue.isSelected());

    }

    @Test
    public void task() throws InterruptedException {
        /**
         * https://demoqa.com/automation-practice-form
         * locate female gender element
         * verify that the element is NOT selected
         * verify that the element is displayed
         * click the element
         * verify that the element is selected
         * ipucu: eğer elementten istediğiniz sonucu alamıyorsanız.. aynı yeri gösteren diğer elementleri deneyin....!!!!
         */

        driver.get("https://demoqa.com/automation-practice-form");
        //locate ederken label etiketine kadar locate edince tıklama yapıyor. direkt button'ı locate edince tıklama yapmıyor
        WebElement female = driver.findElement(By.cssSelector(".custom-control.custom-radio.custom-control-inline+div>input+label"));
        Assert.assertFalse(female.isSelected());
        Assert.assertTrue(female.isDisplayed());
        female.click();
        Thread.sleep(1500);

        //bu seferde tıklanan button'ı seçili değil mi diye kontrol ederken label'dan değil direkt buttondan locate ediyoruz.
        WebElement female2 = driver.findElement(By.cssSelector(".custom-control.custom-radio.custom-control-inline+div>input"));
        Assert.assertTrue(female2.isSelected());

    }

}
