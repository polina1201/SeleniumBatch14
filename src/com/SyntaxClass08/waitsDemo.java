package com.SyntaxClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to facebook.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //        click on the button "change text to selenium webDriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

//        get the text Selenium WebDriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
//        print out text on the screen
        System.out.println(webDriverText.getText());

        //Task 2
        //Click on the button "display button after 10 seconds"
        WebElement button2 = driver.findElement(By.xpath("////button[@id='display-other-button']"));
        button2.click();

        //as the button appears up after some time, so in order to click it, or get text from it,
        //we need to define some explciit wait

        WebDriverWait wait=new WebDriverWait(driver,20);//system is waiting for max of 20sec for button to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();

    }
}
