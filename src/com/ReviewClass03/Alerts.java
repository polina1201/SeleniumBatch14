package com.ReviewClass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");

        //Click on the button
        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        //alert interface
        Alert Alert1 = driver.switchTo().alert();
        Alert1.accept();

        //     alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

//   reusing the alert already declared
        Alert1.sendKeys("Polina");
        Alert1.accept();
    }
}
