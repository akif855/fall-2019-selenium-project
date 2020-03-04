package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeSet;

public class FirstClass {

    public static void main(String[] args) throws InterruptedException {
        //1. binary the driver and browsers
        WebDriverManager.chromedriver().setup();

        //2. WebDriver object --> Interface
        //I have a driver
        WebDriver driver = new ChromeDriver();

        //3. I want to open Google home page

        //how do you launch / pen a web page?
        //by using get() --> url as String
       // driver.get("https://www.google.com");

        //Navigations
        //1. navigate().to() --> open a web page

        driver.navigate().to("https://www.google.com");


        //get() vs navigate().to()
        //get --> wait to load the page
        //to() --> does not wait

        //navigate().back() -->
        //go to google 2. go to cybertek practice website

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

    }
}
