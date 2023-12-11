package com.kraft.tests.day04_BasicLocators;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_ByTagName {

    /**
     * open chrome browser and navigate to http://www.eurotech.study/
     * accept cookies if any
     * locate Copyright web element at the footer of the web page by using tag name locator
     * get the text of web element and print it
     * close driver.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        Thread.sleep(2000);

        //accept cookies // lazy way
        driver.findElement(By.id("rcc-confirm-button")).click();

        WebElement footer= driver.findElement(By.tagName("small"));
        String footerText = footer.getText();
        System.out.println("footerText = " + footerText);

        driver.quit();


    }

}
/**
 * 1- dinamik olmazlar..
 * 2- birden fazla olma durumu çok sıktır. eğer bu durumda kullanılırsa selenium ilk web elemente gider ve
 * onunla işlem yapar..
 * 3- unique (eşsiz) olup olmadığı dev tools arama (ctrl+f ile açılan yerde) bölümünde başına // işareti
 * konularak kontrol edilebilir..By.tagName("tagname") ile kullanılırken // işareti konulmadan kullanılır..
 * 4- index ile kullanılmaz..
 */
