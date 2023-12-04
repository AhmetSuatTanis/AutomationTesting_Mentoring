package com.kraft.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_WindowMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/tr/index");

//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();

        Point position = driver.manage().window().getPosition();
        System.out.println(position);

        //açılacak ekran ana ekran değilde 2. ekran oluırsa ona göre değer giriyoruz.
        //öreneğin benim ikinci ekran solda olduğu için -1920-10= -1930 yazdımki ikinci ekranın en solunda açılsın diye
        driver.manage().window().setPosition(new Point(-1930,0));

        // pencerenin size'ı ile oynamak istersek bunu yapıyoruz
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        //pencerenin size'ı nı değiştiriyoruz
        driver.manage().window().setSize(new Dimension(1250,999));

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

        System.out.println("width = " + width);
        System.out.println("height = " + height);

        driver.manage().window().maximize();

    }
}
