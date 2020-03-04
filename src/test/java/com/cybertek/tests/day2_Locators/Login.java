package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    /*
    User story: As a user, I should be able to login VyTrack app.

    test case1: login successfully

    1. go to VyTrack login page
    2. write username  data: storemanager52
    3. write password         UserUser123
    4. click

    test case2: login invalid cridential
    1. go to login page
    2. write invalid username  data: storemanager52
    3. write password         UserUser123
    4. click

     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.submit();

        driver.get("https://app.vytrack.com/");

        /*
        Verify that you are in the hame page
         */

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The Actual title is " + actualTitle);


        }
        driver.get("https://app.vytrack.com/");

        String expectedURL = "https://app.vytrack.com/";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " + expectedURL);
            System.out.println("The actual URL is: " + actualURL);
        }

        driver.close();
    }
}
