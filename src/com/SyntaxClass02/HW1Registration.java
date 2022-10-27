package com.SyntaxClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Registration {
    /*   navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser

    navigate to fb.com
    click on create new account
    fill up all the textboxes

    close the pop up
    close the browser
*/

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
       driver.manage().window().maximize();
       driver.findElement(By.id("customer.firstName")).sendKeys("Apollinaria");
       driver.findElement(By.id("customer.lastName")).sendKeys("Yershova") ;
       driver.findElement(By.id("customer.address.street")).sendKeys("1234 Main");
        driver.findElement(By.name("customer.address.city")).sendKeys("Odess");
driver.findElement(By.id("customer.address.state")).sendKeys("Maryland");
driver.findElement(By.name("customer.address.zipCode")).sendKeys("25589");
driver.findElement(By.name("customer.phoneNumber")).sendKeys("2558898888");
driver.findElement(By.id("customer.ssn")).sendKeys("555-897-8979");
driver.findElement(By.name("customer.username")).sendKeys("popo123");
driver.findElement(By.id("customer.password")).sendKeys("toto");
driver.findElement(By.className("button")).click();
Thread.sleep(2000);
driver.quit();



}}

