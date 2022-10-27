package com.SyntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class (on windows u need .exe

                System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //        //create a WebDriver instance
             WebDriver driver=new ChromeDriver();
             //go to smartbear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the window
        driver.manage().window().maximize();
        //enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click login
        driver.findElement(By.className("button")).click();

        //Make sure that the title is correct i.e.Web Orders - look at the head of the boxy
        String title=driver.getTitle();
      if(title.contains("Web Order")){
          System.out.println("The title is correct: "+title);
      }
      else{
          System.out.println("The title is incorrect:"+title);
      }

    }
}
