package com.SyntaxClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {

    public static void main(String[] args) {

        //go to google.com
        //maximize your window

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //maximize
        driver.manage().window().maximize();
        //quit
        driver.quit();

    }
}
