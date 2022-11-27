package com.SyntaxClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class calanderPagination {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //code to get to the table page
        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton= driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

    }
}
