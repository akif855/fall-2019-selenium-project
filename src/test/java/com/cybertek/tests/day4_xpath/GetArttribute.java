package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetArttribute {
    public static void main(String[] args) {
        /*
        Task:
        1. go to forgot password web page
                type = 'submit'
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        WebElement retreivePasswordBttn = driver.findElement(By.id("form_submit"));

        System.out.println(retreivePasswordBttn.getAttribute("type"));
        System.out.println(retreivePasswordBttn.getAttribute("class"));
        System.out.println(retreivePasswordBttn.getAttribute("id"));

        driver.close();
    }
}
