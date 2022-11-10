package com.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        //seting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com/");
        //maximize
        driver.manage().window().maximize();
        //find the button "create account" and click on it

        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
       createAccount.click();
       //sleep for 3 sec to wait for the window to open up
        Thread.sleep(3000);

        //Select the date from the drop-down
        //Approach to use the select

        //1. Find the webElement that contains the select Tag ---in the Ctrl+F field type   //select[@id='day']
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

        //2. use Select class Select sel=new Select(webElement);
        Select sel=new Select(day);

        //We have now three methods
        //1. Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        //2. Select by visible text (we look for white text)
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        //3. Select by value
        sel.selectByValue("16");
        //************************************

        //1. find the webElement
        //2. use the select class to initiate an instance
            //1. find the WebElement
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

        //2. use the select class to initiate an instance
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Aug");

        //print all the available months is the console
        //gets you all the available options in the dropDown
        List<WebElement> options = selectMonth.getOptions();

        //traverse through the loop and print each webElement
        for (int i = 0; i <options.size(); i++) {
            String months = options.get(i).getText();
            System.out.println(months);

        }
    }
}
