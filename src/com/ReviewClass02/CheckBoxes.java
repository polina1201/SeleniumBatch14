package com.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to https://www.ironspider.ca/forms/checkradio.htm
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //maximize
        driver.manage().window().maximize();
        //find the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

        //what does this list contain?  --->it contains all the 6 WebElements

        for (WebElement checkBx:checkboxes){
            String color = checkBx.getAttribute("value");

            if (color.equalsIgnoreCase("orange")){
                checkBx.click();
                break;
            }
        }
    }
}
