package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) throws InterruptedException {
        /*
        go to login page
        enter username
        enter password
        click login button

        Verify the welcome message "Welcome to the Secure Area. When you are done click logout below."
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        WebElement loginButton = driver.findElement(By.id("wooden_spoon"));
        loginButton.submit();

        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));

        Thread.sleep(3000);

        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        String actualWelcomeMessage = welcomeMessage.getText();

        if (expectedMessage.equals(actualWelcomeMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("I expected " + expectedMessage);
            System.out.println("The Actual title is " + actualWelcomeMessage);

        }
        driver.close();
    }
}
