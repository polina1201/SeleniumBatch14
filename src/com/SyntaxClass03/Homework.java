package com.SyntaxClass03;

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
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromdriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
    }

}
