package com.SyntaxClass07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();


        //Task : go to gmail signup and  get the window handle

        //go to google.com/signup
        driver.get("https://accounts.google.com/signup");
        //get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

        //print
        System.out.println("the handle of the curret page is: "+gmailHandle);

    }
}
