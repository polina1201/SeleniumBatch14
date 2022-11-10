package com.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {

        //set up the driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to https://www.ironspider.ca/forms/checkradio.htm
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //maximize
        driver.manage().window().maximize();
        //open the Syntax HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //       When user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
//        send the username
        userName.sendKeys("Admin");

//        Then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");

//        Then user clicks on login Button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        //Then VERIFY that error Invalid Credentials is displayed

        //get the error message from the DOM
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

//        verification

        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("the correct Error message is there --->verified");
        }
        else{

            System.out.println("the correct Error message is not there ");
        }




    }
}
