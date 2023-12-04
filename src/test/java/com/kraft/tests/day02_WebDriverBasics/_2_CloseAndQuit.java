package com.kraft.tests.day02_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        driver.close();

        //ikinci kez Chrome tanıtmamıza gerek yoktur
        //WebDriverManager.chromedriver().setup();
        WebDriver driver1= new ChromeDriver();

        driver1.quit();

        driver=new ChromeDriver();
        driver.get("https://testrelic.com/");



    }
}
