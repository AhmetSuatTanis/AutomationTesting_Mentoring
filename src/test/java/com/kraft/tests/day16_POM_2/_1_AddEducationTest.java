package com.kraft.tests.day16_POM_2;

import com.kraft.Utilities.BrowserUtils;
import com.kraft.Utilities.ConfigurationReader;
import com.kraft.pages.AddEducationPage;
import com.kraft.pages.DashboardPage;
import com.kraft.pages.LoginPage;
import com.kraft.pages.UserProfilePage;
import com.kraft.tests.TestBase;
import org.apache.hc.core5.http.nio.AsyncServerRequestHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.ConfigurationGroupMethods;

public class _1_AddEducationTest extends TestBase {

    LoginPage loginPage;

    DashboardPage dashboardPage;

    UserProfilePage userProfilePage;

    AddEducationPage addEducationPage;

    @Test
    public  void addEducationTest(){
        /**
         1-open chrome browser
         2-navigate to https://www.krafttechexlab.com/login by using configuration.properties
         3-login with parameterized/non-parameterized method
         4-Assert successful login with user name
         5-Navigate to My Profile with related method
         6-Verify that User Profile page is displayed
         7-Navigate to Add Education tab with related method
         8-Verify that add education page is displayed
         9-Fill the form with parameterized method (use actions class)
         10-Verify that added education record can be seen at user profile page... (assert with school name)
         11-Delete last added education record

         important note: every student should use own credentials, otherwise the test case will fail....
         */
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        userProfilePage=new UserProfilePage();
        addEducationPage=new AddEducationPage();

        driver.get(ConfigurationReader.get("url"));

        loginPage.login();

        dashboardPage.verifyUserName(ConfigurationReader.get("userName"));
        dashboardPage.navigateTabAndModule(ConfigurationReader.get("userName"),"My Profile");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(userProfilePage.userProfilePageTitle)).isDisplayed());

        userProfilePage.navigateUserProfileTabs("Add Education");

        Assert.assertTrue(BrowserUtils.waitForVisibility(addEducationPage.addEducationBtn,5).isDisplayed());


        //OKUL BİLGİSİ EKLEME VE EKLENDİĞİNİN DOĞRULANMASI
//        addEducationPage.fillingAddEducationFrom("KATU","Bachelor","Public Finance","11122012"
//        ,"10102016","Easy Program");

//        String actualRecord = userProfilePage.addedLastEducationRecordName("KATU");
//        String expectedRecord="KATU";
//
//        Assert.assertEquals(actualRecord,expectedRecord);

        //OKUL BİLGİSİ SİLME
        userProfilePage.deleteLastAddedEducationRecord("ITU");

    }

}





















































