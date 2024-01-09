package com.kraft.tests.day20_miscellaneous;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _2_SoftAssertion {

    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test1(){
        softAssert.assertTrue(11>3);
        softAssert.assertFalse(11>3);
        softAssert.assertEquals("A","A");
        softAssert.assertEquals("A","N");
        softAssert.assertAll("Demo assertion");
    }

}
