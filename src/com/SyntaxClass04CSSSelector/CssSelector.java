package com.SyntaxClass04CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojects.com/basic-first-form-demo
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        //get the webElement text box
       // driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("abracadabra");

        //another method of doing the above operation
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("Abracadabra");

        //press the button Show Message
        WebElement button = driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();



    }
}
