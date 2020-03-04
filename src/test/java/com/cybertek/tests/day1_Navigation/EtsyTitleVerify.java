package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().fullscreen();

        String expectedTitle = "etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected " + expectedTitle);
            System.out.println(expectedTitle + " - vs - " + actualTitle);
        }
        driver.close();
    }
}
