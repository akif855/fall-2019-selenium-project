package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        /*
        Task:
        1. go to forgot password web page
        2. enter any email
        3. click "retriev password" bttb
        4. Verify "Your e-mail's been sent!"
         */
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("abc@gmail.com");

        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        submitBttn.submit();

        String expectedText = "Your e-mail's been sent!";

        WebElement message = driver.findElement(By.name("confirmation_message"));

        String actualText = message.getText();

        if(expectedText.equals(actualText)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }

        driver.close();


    }
}
