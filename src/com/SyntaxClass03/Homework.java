package com.SyntaxClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*you must use Relative Xpath to do this
    Note:
    you are free to choose the type of relative Xpath, but try to use the one that seems more appropriate


    Navigate to http://syntaxprojects.com/
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(3000);
    //click on demo using indexing
   //Method 1
        driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

        //click on demo
       //Method 2
        // driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();


    }

}
