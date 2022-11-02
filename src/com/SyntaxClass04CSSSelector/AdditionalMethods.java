package com.SyntaxClass04CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojects.com/basic-radiobutton-demo.php
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the webElement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from the btn webElement
        String text = btn.getText();
        //Print it on console
        System.out.println(text);

        //get the value of the attribute id from this webElement
        String idvalue = btn.getAttribute("id");
        //print it on the console
        System.out.println(idvalue);

    }
}
