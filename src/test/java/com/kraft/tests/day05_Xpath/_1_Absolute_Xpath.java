package com.kraft.tests.day05_Xpath;

import com.kraft.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_Absolute_Xpath {

    /**
     * open a chrome browser and navigate to "https://demoqa.com/automation-practice-form"
     * locate current address input area with absolute xPath
     * send "Manheim/Kolonya" to the address box area
     * then take the value of address box area
     * close driver
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        WebElement currentAddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[9]/div[2]/textarea"));
        currentAddress.sendKeys("Manheim/Kolonya");
        System.out.println("currentAddress.getAttribute(\"value\") = " + currentAddress.getAttribute("value"));

        Thread.sleep(2000);
        driver.quit();

    }
}
/**
 * absolute xPath HTML kodunun en başından (root) başlayarak adım adım hedeflenen web elemente gidilerek
 * istenilen web elementin locate edilmesini sağlar.
 * Bütün HTML'yi adım adım izleyerek gittiği için değişimlere karşı çok hassastır. ve en ufak bir kod değişikliğinde
 * zincir şeklindeki path (yol) bozulacağından KESİNLİKLE tercih edilmemelidir.
 * Dev Tool'da elementin üstüne sağ click-copy-copy full xPath ile kısa yoldan elede edilebilir.
 */