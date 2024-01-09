package com.kraft.tests.day14_Properties_Singleton;

import com.kraft.utilities.ConfigurationReader;

public class _2_SingletonDemo {
    private _2_SingletonDemo() {
    }

    private static String driver;

    public static String getDriver(){
        if (driver==null){
            System.out.println("driver is null, Please assign value");
            driver= ConfigurationReader.get("browser");
        }else {
            System.out.println("driver is full, you can take its value with return");
        }
        return driver;
    }

}
