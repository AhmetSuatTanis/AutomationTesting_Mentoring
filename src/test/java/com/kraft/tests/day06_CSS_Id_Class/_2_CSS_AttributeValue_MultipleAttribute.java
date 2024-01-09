package com.kraft.tests.day06_CSS_Id_Class;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_CSS_AttributeValue_MultipleAttribute {
    /**
     *  * navigate to http://www.eurotech.study/
     *  * click cookies button with one css attribute value
     *  * take DevEx text and print with css multiple attribute value (and)
     *  * take main text and print with css multiple attribute value (or)
     *  * close driver
     *  * --------------------
     *  * [attribute='value']
     *  * tagName[attribute='value']
     *  * ----------------------
     *  * birden çok attribute ile css'de locate etme:
     *  * [attribute1='value1'][attribute2='value2'] (and)
     *  * tagName[attribute1='value1'][attribute2='value2'] (and)
     *  *
     *  * [attribute1='value1'],[attribute2='value2'] (or)
     *  * tagName[attribute1='value1'],[attribute2='value2'] (or)
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");
        Thread.sleep(2000);

        //cookies accept button
        driver.findElement(By.cssSelector("button[id='rcc-confirm-button']")).click();

        //devEX element
        WebElement devEx = driver.findElement(By.cssSelector("h1[class=\"x-large\"][id=\"landingpage-innercontainer-h1\"]"));
        System.out.println("devEx.getText() = " + devEx.getText());

        //main paragraph
        WebElement mainParagraph = driver.findElement(By.cssSelector("[class='lead'],[id='landingpage-innercontainer-p']"));
        System.out.println("mainParagraph.getText() = " + mainParagraph.getText());

        Thread.sleep(2000);
        driver.close();

    }
}



