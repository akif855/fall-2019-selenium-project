package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttriibute2 {
    /*
    go to http://practice.cybertekschool.com/dynamic_loading
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement exampleElement1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));

        System.out.println(exampleElement1.getAttribute("href"));

        driver.close();
    }
}