package com.SyntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojects.com/basic-checkbox-demo.php
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //maximize
        driver.manage().window().maximize();
        //find the WebElement that contains the select class
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        //using select class
        Select sel=new Select(DD);
        //select by index
        sel.selectByIndex(3);
        //select by visible text
        sel.selectByVisibleText("Texas");
        //deselect by index
        Thread.sleep(2000);
        sel.deselectByIndex(3);

        //write down the code to select all the options in the dropdown
        //getOptions return ALL the options available on the menu
        List<WebElement> options=sel.getOptions();
        for (int i = 0; i < options.size(); i++) {

            sel.selectByIndex(i);
        }
        Thread.sleep(300);
        sel.deselectAll();

        //how can we check if the drop down is multi selelct or not using selenium?
        boolean multiSelect= sel.isMultiple();
        System.out.println(multiSelect);

    }
}
