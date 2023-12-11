package com.kraft.tests.day02_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_A_UsingChromiumChrome {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","C:\\Users\\AHMET\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.google.com.tr");




    }
}
