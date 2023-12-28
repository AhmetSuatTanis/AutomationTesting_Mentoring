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

public class _1_CheckBoxes {


    /**
     * Açıklamalar   :
     * isSelected()  ----> bir elementin seçili olup olmadığını verir  :  true/false
     * isDisplayed()  ----> bir elementin görünür olup olmadığını verir  :  true/false
     * isEnabled()  ----> bir element ile etkileşime (click, sendKeys vb.) geçilip geçilemeyeceğini verir  :  true/false
     * isEnabled() durumunun tersi disabled ile ifade edilir  ama isDisable() metodu yoktur...
     */

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
    public void checkBoxTest() throws InterruptedException {
        /**
         * navigate to http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
         * locate option 3 element
         * verify that the element is selected
         * click the element
         * verify that the element is NOT selected
         *
         * locate option 2
         * verify that the element is NOT selected
         * click the element
         * verify that the element is selected
         */

        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement option3 = driver.findElement(By.xpath("//label/input[@value='option-3']"));
        Assert.assertTrue(option3.isSelected());
        option3.click();
        Thread.sleep(1000);
        Assert.assertFalse(option3.isSelected());

        WebElement option2 = driver.findElement(By.xpath("//label/input[@value='option-2']"));
        Assert.assertFalse(option2.isSelected());
        option2.click();
        Thread.sleep(1000);
        Assert.assertTrue(option2.isSelected());


//        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//
//        WebElement option3 = driver.findElement(By.cssSelector("[value='option-3']"));
//
//        assertTrue(option3.isSelected());
//
//        option3.click();
//        assertFalse(option3.isSelected());
//
//        WebElement option2 = driver.findElement(By.cssSelector("[value='option-2']"));
//
//        assertFalse(option2.isSelected());
//
//        option2.click();
//
//        assertTrue(option2.isSelected());

    }

    @Test
    public void checkBoxTask() throws InterruptedException {
        /**
         * go to https://the-internet.herokuapp.com/checkboxes
         * locate both checkBoxes web elements
         * verify that checkbox 1 is NOT selected
         * verify that checkbox 2 is selected
         * click check box 1 and check box 2
         * verify that checkbox 1 is selected
         * verify that checkbox 2 is NOT selected
         */

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        //seçili olmadığı için assertFalse kullanırız
        Assert.assertFalse(checkBox1.isSelected());

        //checkbox2 nin seçili olduğunu verify(doğrulama) yaptık.
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Assert.assertTrue(checkBox2.isSelected());

        Thread.sleep(2000);
        checkBox1.click();
        Thread.sleep(1000);
        checkBox2.click();

        //checkboxların seçim tercihi tersine döndüğü için onları tekrar verify yaparız
        //ilk box artık seçili
        Assert.assertTrue(checkBox1.isSelected());
        //ikinci box artık seçili değil
        Assert.assertFalse(checkBox2.isSelected());

    }


}
