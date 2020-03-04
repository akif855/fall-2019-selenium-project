package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleStringTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        String expectedTitle = "Google";

        Thread.sleep(3000);
        driver.navigate().to("https://www.etsy.com/");

        String etsyExpectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Thread.sleep(3000);
        driver.navigate().back();

        String actualGoogleTitle = driver.getTitle();

        if(expectedTitle.equals(actualGoogleTitle)) {
            System.out.println("PASS");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The actual URL is: " + actualGoogleTitle);
        } else {
            System.out.println("FAIL");
        }

        driver.navigate().forward();
        String etsyTitle2 = driver.getTitle();

        if(etsyExpectedTitle.equalsIgnoreCase(etsyTitle2)) {
            System.out.println("Same title");
        } else {
            System.out.println("Not same title");
        }
        driver.close();
    }
}