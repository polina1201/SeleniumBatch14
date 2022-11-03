package com.SyntaxClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojects.com/basic-checkbox-demo.php
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //maximize
        driver.manage().window().maximize();

        //find the WebElement dropdown by looking for select tag
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use Select class
        Select select=new Select(dropDown);
    //select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        //select by visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(2000);
        //Select by value
        select.selectByValue("Sunday");

        //get all the options available in the dropdown

        List<WebElement> options=select.getOptions();
        //traverse through the option
        for (int i = 0; i < options.size(); i++) {
            WebElement option=options.get(i);
            //extracting first option
            System.out.println(option.getText());
            String text=option.getText();
            if (text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);

            }
        }
    }
}
