package com.kraft.tests.day05_Xpath;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_RelativeXpath {
    /**
     * task
     * navigate to https://demoqa.com/automation-practice-form
     * locate first name input box with xPath (parent-child relations)
     * send "Ayşegül" to the input box
     * locate sports checkbox with xPath (parent-child relations)
     * click to the checkbox
     * locate Student Registration Form element by xPath (parent-child relations)
     * get the text of web element and print it
     * close the driver
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(2000);

        WebElement nameInputBox = driver.findElement(By.xpath("//h5/following-sibling::form/descendant::input[@type='text']"));
        nameInputBox.sendKeys("Ayşegül");

        Thread.sleep(2000);

        WebElement sportsCheckBox = driver.findElement(By.xpath("//div[@id='stateCity-wrapper']/preceding::div[@id='hobbiesWrapper']/descendant::div[3]"));
        sportsCheckBox.click();

        WebElement studentRegistrationFormTitleText = driver.findElement(By.xpath("//div[@class='main-header']/ancestor::div/descendant::div[@class='row']/descendant::div/descendant::div[@class='practice-form-wrapper']/h5"));
        System.out.println("studentRegistrationFormTitleText.getText() = " + studentRegistrationFormTitleText.getText());

        Thread.sleep(2000);
        driver.quit();


    }
}
