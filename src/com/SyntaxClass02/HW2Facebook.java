package com.SyntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to fb.com
        click on create new account
        fill up all the textboxes

        close the pop up
        close the browser
*/

public class HW2Facebook {
    public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            // create a Webdriver instance
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("Create new account")).click();
            Thread.sleep(5000);
            driver.findElement(By.name("firstname")).sendKeys("Kate");
            driver.findElement(By.name("lastname")).sendKeys("Petrova");
            driver.findElement(By.name("reg_email__")).sendKeys("kate.petrova@gmzil.com");
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kate.petrova@gmzil.com");
            driver.findElement(By.id("password_step_input")).sendKeys("katepetrova88");
            driver.findElement(By.id("month")).sendKeys("Jan");
            driver.findElement(By.name("birthday_day")).sendKeys("10");
            driver.findElement(By.name("birthday_year")).sendKeys("1988");
            driver.findElement(By.className("_58mt")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("websubmit")).click();
            Thread.sleep(8000);
            driver.quit();


        }
}
