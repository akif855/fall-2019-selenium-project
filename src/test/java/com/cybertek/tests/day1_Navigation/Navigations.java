package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException{
        /*
         Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
       */

        //go to practice -->go to google --> back to practice
        // --> forward to google

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        ChromeDriver driver1 = new ChromeDriver();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        //go to practice
        driver.get(practiceWebURL);

        //I want to see the full window
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //go to practice
        String ggURL = "https://www.google.com";
        driver.navigate().to(ggURL);
        Thread.sleep(3000);

        //go to back to practice
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        driver.navigate().refresh();

        //close driver
        //close the current WebPage
        driver.close();

        //close all the opened windows
        driver.quit();


    }
}
