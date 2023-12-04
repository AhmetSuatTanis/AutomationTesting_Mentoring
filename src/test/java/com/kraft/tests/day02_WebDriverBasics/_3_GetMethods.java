package com.kraft.tests.day02_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_GetMethods {

    /**
     * set up a chrome driver
     * navigate to https://www.hepsiburada.com/
     * get title and get url get page source code
     * verify that title, url and Page source codes  contain "hepsiburada"
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.manage().window().setPosition(new Point(-1930,0));
        driver.manage().window().maximize();

        driver.get("https://www.hepsiburada.com/");

        String actualTitle=driver.getTitle();  // sayfanın başlığını alır

        String actualUrl= driver.getCurrentUrl(); // selenium'un üzrinde bulunduğu sayfanın urlsini alır

        String actualSourceCode = driver.getPageSource();

        //if (actualTitle.toLowerCase())




    }

}
