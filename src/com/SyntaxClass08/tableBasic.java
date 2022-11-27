package com.SyntaxClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasic {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to the website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //print the whole table on the console

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
       System.out.println(textAllTable);

        //print all the rows in the table

       // List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        //for(WebElement row:rows){
        //String rowText=row.getText();
        // System.out.println(rowText);System.out.println("-----------");
        //modified task: print only the row which has company Google
        List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows1) {
            String rowText = row.getText();
            if (rowText.contains("Google")) {
                System.out.println(rowText);
            }
        }
        System.out.println("-------------");
    }}
