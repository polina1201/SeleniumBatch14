package com.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to https://syntaxprojects.com/basic-radiobutton-demo.php
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //maximize
        driver.manage().window().maximize();
        // find the radio button
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the list of webElements
        for(WebElement radioBtn:radioBtns){
            //find the desired button
            String option = radioBtn.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                //click on the radio Btn
                radioBtn.click();
            }
        }
    }
}
