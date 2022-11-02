package com.ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance
        WebDriver driver = new ChromeDriver();
        //open the facebook
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //click on Create New Account
        //a[text()='Create new account'] in find field in inspect of website
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //sleep time for the new window to load
        Thread.sleep(3000);
    //send the first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Polina");
//send the last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Melvin");
//close the window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yA/r/vF9DX0rAdyp.gif")).click();





        //before closing wait for some time/sleep
        Thread.sleep(3000);
        //quit the browser
        driver.quit();
    }
}
