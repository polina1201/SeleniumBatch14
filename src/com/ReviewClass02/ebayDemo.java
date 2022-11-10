package com.ReviewClass02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayDemo {
    public static void main(String[] args) {

        //seting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to ebay
        driver.get("https://www.ebay.com/");
        //maximize
        driver.manage().window().maximize();
        //find the button "create account" and click on it

        //select from the drop-down

    }
}
