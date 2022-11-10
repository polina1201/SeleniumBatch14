package com.SyntaxClass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to https://syntaxprojects.com/javascript-alert-box-demo.php
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //find the button "click me" for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        Thread.sleep(2000);
        //Handling the Alert
        Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();

        //find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.dismiss();

        //find the Prompt alert and send some text, then accept it

        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

        //switch the focus to the alert
        Alert propm1=driver.switchTo().alert();
        propm1.sendKeys("abracadabra");
        propm1.accept();
    }
}