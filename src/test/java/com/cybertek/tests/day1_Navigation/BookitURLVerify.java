package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitURLVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String expectedURL = "https://cybertek-reservation-qa.herokuapp.com/sign-in";

        String expectedPartialURL = "cybertek-reservation";
        String actualURL = driver.getCurrentUrl();


        if(actualURL.contains(expectedPartialURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " + expectedURL);
            System.out.println("The actual URL is: " + actualURL);
        }

        driver.close();

    }
}
