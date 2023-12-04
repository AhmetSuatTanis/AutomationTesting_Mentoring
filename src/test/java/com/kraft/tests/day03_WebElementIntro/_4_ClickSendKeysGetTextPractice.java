package com.kraft.tests.day03_WebElementIntro;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_ClickSendKeysGetTextPractice {

    /**
     * Open chore browser
     * navigate to https://www.amazon.com/
     * write "Java" to the search bar
     * click search button
     * get result for text
     * verify that the text contains "Java"
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchBar = driver.findElement(By.name("field-keywords"));
        searchBar.sendKeys("Java");

        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement searchResult = driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']"));
        String actualText = searchResult.getText();
        String expectedText="Java";

        System.out.println("actualText = " + actualText);


        if (actualText.contains(expectedText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
