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
            driver.findElement(By.name("firstname")).sendKeys("Polina");
            driver.findElement(By.name("lastname")).sendKeys("Melvin");
            driver.findElement(By.name("reg_email__")).sendKeys("polinapolina@gmail.com");
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("polinapolina.com");
            driver.findElement(By.id("password_step_input")).sendKeys("polina1984");
            driver.findElement(By.id("month")).sendKeys("Dec");
            driver.findElement(By.name("birthday_day")).sendKeys("1");
            driver.findElement(By.name("birthday_year")).sendKeys("1984");
            driver.findElement(By.className("_58mt")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("websubmit")).click();
            Thread.sleep(8000);
            driver.quit();


        }
}
