package com.SyntaxClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingAdvance {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Task : go to gmail signup and  get the window handle

        //go to google.com/signup
        driver.get("https://accounts.google.com/signup");
        //click on help button
        WebElement helpButn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButn.click();
        //click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        
        //get ALL the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle:allHandles){
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to which the driver has switched
            String title = driver.getTitle();
            //compare if the title is of the Help
            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is: "+title);
                break;
            }
        }

        //find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();


    }

}
