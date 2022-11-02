package com.SyntaxClass04CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();

        //go to syntaxprojects.com/basic-radiobutton-demo.php
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //get the radio button Male
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']"));
        //check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is Displayed: "+ displayStatus);

        //check whether the radio button male is Enabled
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Eneabled: "+enableStatus);

        //check weather the radio button male is Selected
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selelcted: "+selectStatus);

        //check if the radio button male is not selected then click on it
        if(!selectStatus){
            //perform a click operation on the radio button
            maleRadioBtn.click();
        }
selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);


    }
}
