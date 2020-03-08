package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        WebElement username = driver.findElement(By.name("username"));
        String valueOfType = username.getAttribute("type");
        System.out.println("Value of type is: " + valueOfType);

        /*
        <button class="btn btn-primary" type="submit" id="wooden_spoon">Login</button>
         */

        WebElement login = driver.findElement(By.id("wooden_spoon"));
        String valueOfClass = login.getAttribute("class");
        System.out.println("Value of class is: " + valueOfClass);
    }
}