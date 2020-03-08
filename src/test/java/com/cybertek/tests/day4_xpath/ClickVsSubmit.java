package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        /*
        Click()
        submit()

        Task:
        1. go to forgot password web page
        2. enter any emal
        3. click "retriev password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        //enter any email
        //locate the email box first
        WebElement emailBox = driver.findElement(By.name("email"));
        //enter email  --> sendKey
        emailBox.sendKeys("abc@gmail.com");

        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        submitBttn.submit();

        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();


    }
}
