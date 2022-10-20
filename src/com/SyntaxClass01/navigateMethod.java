package com.SyntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //go to goggle.com
        //go to facebook.com
        //go back to google

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("http://www.google.com/");

        //go to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        //introduce some sleep, which is wait
        //wait or pause for 2000 milli seconds(2 sec)
        Thread.sleep(2000);

        //go back to google.com
        driver.navigate().back();

        Thread.sleep(1000);
        //go back to facebook.com
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().refresh();

        driver.quit();

    }
    }

