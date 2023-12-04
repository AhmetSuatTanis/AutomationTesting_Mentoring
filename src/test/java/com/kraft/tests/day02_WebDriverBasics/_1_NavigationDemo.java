package com.kraft.tests.day02_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_NavigationDemo {

    /**
     * set up a firefox(chrome) driver
     * navigate to https://www.facebook.com/
     * then navigate to https://testrelic.com/
     * then navigate back
     * then navigate forward
     * then refresh page
     * then close driver
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(-2000);
        } catch (Exception e) {
            System.out.println("Hata yakalandı");
            System.out.println("e = " + e);
        }
        driver.navigate().to("https://testrelic.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();

    }
}
