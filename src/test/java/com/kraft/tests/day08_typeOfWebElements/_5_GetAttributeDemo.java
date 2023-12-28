package com.kraft.tests.day08_typeOfWebElements;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _5_GetAttributeDemo {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        /**
         * navigate to https://www.krafttechexlab.com/login
         * locate the form web element
         * use some of GET (getAttribute, getTagName, getLocation, getCssValue) methods with the element
         */

        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(3000);

        //ilk element bizim form elementi olduğu için 9 tane çıkan sonuca rağmen ilk sırada diye direkt adını yazıp kullandık.
        WebElement form = driver.findElement(By.tagName("form"));

        System.out.println("form.getAttribute(\"id\") = " + form.getAttribute("id"));
        System.out.println("form.getAttribute(\"npvalidate\") = " + form.getAttribute("novalidate"));
        System.out.println("form.getAttribute(\"method\") = " + form.getAttribute("method"));
        System.out.println("-------------getText()----------------");


        System.out.println("form.getText() = " + form.getText());

        System.out.println("------------------getAttribute(\"innerHTML\")---------------------");

        System.out.println("form.getAttribute(\"InnerHTML\") = " + form.getAttribute("innerHTML"));

        System.out.println("-------------------getAttribute(\"outerHTML\")---------------------");

        System.out.println("form.getAttribute(\"OuterHTML\") = " + form.getAttribute("outerHTML"));

        System.out.println("-------------------getAttribute(\"tagName\")----------------------");

        System.out.println("form.getAttribute(\"TagName\") = " + form.getAttribute("tagName"));
        System.out.println("form.getTagName() = " + form.getTagName());

        System.out.println("--------------------form.getSize()--------------------");

        System.out.println("form.getSize() = " + form.getSize());

        System.out.println("------------form.getRect().getHeight()-----form.getRect().getWidth()-----------------------");

        System.out.println("form.getRect().getHeight() = " + form.getRect().getHeight());
        System.out.println("form.getRect().getWidth() = " + form.getRect().getWidth());

        System.out.println("--------------------form.getCssValue(\"font\")-----form.getCssValue(\"background\")---------------");

        System.out.println("form.getCssValue(\"form\") = " + form.getCssValue("font"));
        System.out.println("form.getCssValue(\"background\") = " + form.getCssValue("background"));

        System.out.println("--------------------form.getLocation()--------------------");

        System.out.println("form.getLocation() = " + form.getLocation());


//        driver.get("https://www.krafttechexlab.com/login");
//
//        WebElement form = driver.findElement(By.tagName("form"));
//
//        System.out.println("form.getAttribute(\"id\") = " + form.getAttribute("id"));
//
//        System.out.println("form.getAttribute(\"novalidate\") = " + form.getAttribute("novalidate"));
//        System.out.println("form.getAttribute(\"method\") = " + form.getAttribute("method"));
//
//        System.out.println("\"------------------\" = " + "------------------");
//
//        System.out.println("form.getText() = " + form.getText());
//
//        System.out.println("\"------------------\" = " + "------------------");
//
//        System.out.println("form.getAttribute(\"innerHTML\") = " + form.getAttribute("innerHTML"));
//
//        System.out.println("\"------------------\" = " + "------------------");
//
//        System.out.println("form.getAttribute(\"outerHTML\") = " + form.getAttribute("outerHTML"));
//
//        System.out.println("\"------------------\" = " + "------------------");
//
//        System.out.println("form.getAttribute(\"tagName\") = " + form.getAttribute("tagName"));
//        System.out.println("form.getTagName() = " + form.getTagName());
//        System.out.println("form.getSize() = " + form.getSize());
//        System.out.println("form.getRect().getHeight() = " + form.getRect().getHeight());
//        System.out.println("form.getCssValue(\"font\") = " + form.getCssValue("font"));
//        System.out.println("form.getCssValue(\"background\") = " + form.getCssValue("background"));
//        System.out.println("form.getLocation() = " + form.getLocation());


    }

    @Test
    public void task(){
        /**
         * navigate to https://demoqa.com/text-box
         * locate Full Name input box
         * use getAttribute method with the element
         * get type attribute value and print it
         * get autocomplete attribute value and print it
         * get name attribue value and print it (name attribute olmadığı için boş dönecektir. hata vermez..)
         * get innerHTML and print it (altında child veya grandchild element olmadığından boş döner..)
         * get outerHTML (sadece kendi tag bilgilerini döner..)
         * send Ahmet to the box and take the value (eğer bir text box'ına yazı gönderirsek.. bu gönderlen yazıyı
         * getAttribute("value") metodu ile alabiliriz..)
         * NOT: getAttribute metodu ile bir web elementin texti alınamaz.. onun için getText() metodu kullanılır..
         */

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        System.out.println("fullName.getAttribute(\"type\") = " + fullName.getAttribute("type"));


    }

}
