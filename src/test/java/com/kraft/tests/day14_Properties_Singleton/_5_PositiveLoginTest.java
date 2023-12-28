package com.kraft.tests.day14_Properties_Singleton;

import com.kraft.Utilities.ConfigurationReader;
import com.kraft.Utilities.Driver;
import com.kraft.Utilities.WebDriverFactory;
import com.kraft.tests.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _5_PositiveLoginTest extends TestBase {
//    WebDriver driver;
//    Actions actions;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = Driver.get();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().setPosition(new Point(-1921,0));
//        driver.manage().window().maximize();
//        actions = new Actions(driver);
//    }
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Driver.closeDriver();
//    }
//

    @Test
    public void t_LoginTest() {
        driver.get(ConfigurationReader.get("url"));
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(ConfigurationReader.get("email"));

        WebElement passwordBtn = driver.findElement(By.id("yourPassword"));
        passwordBtn.sendKeys(ConfigurationReader.get("password"));

        WebElement btn = driver.findElement(By.tagName("button"));
        btn.click();
    }


}
