package com.kraft.tests.day20_miscellaneous;

import com.kraft.utilities.Driver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _1_RobotClass {

    @Test
    public void robotClassBasicAuthentication() throws AWTException {
        /**
         * navigate to https://the-internet.herokuapp.com/digest_auth
         * Type in username and password by using robot class
         * Click Sign in button
         *
         * Note: 1- use us Q keyboard
         *       2- username: admin and password:admin
         */

        WebDriver driver = Driver.get();

        driver.manage().window().setPosition(new Point(-1920,0));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/digest_auth");

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ACCEPT);
    }

    @Test
    public void robotClassBasicAuthentication2() throws AWTException {
        /**
         *          * navigate to kraft login page
         *          * Press tab with robot class
         *          * Type in user email and password by using robot class (email: Aadmın, password:admın)
         *          * Click Create an account link
         *          * Verify that create an account page is displayed
         */

        WebDriver driver = Driver.get();

        driver.manage().window().setPosition(new Point(-1921,0));
        driver.manage().window().maximize();

        driver.get("https://www.krafttechexlab.com/login");

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);    // BÜYÜK A YAZMAK İÇİN
        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);

        robot.delay(2000);

        driver.quit();
    }

}

















