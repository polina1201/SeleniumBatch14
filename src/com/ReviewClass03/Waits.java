package com.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

//        click on the start button
                WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

//        get the text out of the element
        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println( textElement.getText());



//               explicit wait until the webElement is displayed
//                explicit wait until the webElement is clickable
//                explicit wsit until the webElement is selected
    }
}