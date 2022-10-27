package com.SyntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        /*go to FB.com
        * Enter Username
        * Enter password
        * click login
        * set the path to the driver to link it with our class (on windows u need .exe
        *
     */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to fb.com
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //enter the Username in the TextBox
        // 1. locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abracadabra");
//enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("waow12345678");
        //click the login
        driver.findElement(By.name("login")).click();
//for the following task to work, make sure that you  comment (//)the login functionality

        //Task2:
        //Click on forgot password using linkText locator
       // driver.findElement(By.linkText("Forgot password?")).click();


        //for the following task to work, make sure that you  comment (//)the task2 functionality
        //Task3:
        //Click on forgot password using Partial linkText locator
       // driver.findElement(By.partialLinkText("Forgot ")).click();
    }
}
