package com.kraft.tests.day05_Xpath;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_RelativeXpath {

    /**
     * open chrome
     * navigate to https://www.amazon.com.tr/
     * accept cookies if any (use xPath formula with known attribute value)
     * locate search bar with xPath formula with known attribute value
     * send "Selenium" word to the search bar
     * locate search button with xPath formula with known attribute value
     * click search button
     * Get the search result by the formula of the text feature of Xpath (two ways)
     * get the text of web element and print it.
     * close driver.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(2000);

        WebElement cerezAccept = driver.findElement(By.xpath("//input[@value='all']"));
        cerezAccept.click();

        Thread.sleep(2000);

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Git']"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement result = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        System.out.println("result.getText() = " + result.getText());

        WebElement result2 = driver.findElement(By.xpath("//span[text()='\"Selenium\"']"));
        System.out.println("result2.getText() = " + result2.getText());

        Thread.sleep(2000);
        driver.quit();




    }
}


