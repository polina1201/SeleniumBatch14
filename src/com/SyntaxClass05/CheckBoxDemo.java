package com.SyntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojects.com/basic-checkbox-demo.php
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //find the checkbox
        WebElement checkBox=driver.findElement(By.id("isAgeSelected"));
        //click on it
        checkBox.click();
    }
}
