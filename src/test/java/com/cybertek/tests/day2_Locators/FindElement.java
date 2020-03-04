package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {

        //Locator 1. ID
        /*
        <input type="text" placeholder="" name="username"
        id="okta-signin-username" value="akifvaliyev1973@gmail.com"
        aria-label="" autocomplete="off">
         */

        //go to cybertec okta login page
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the text box
        /*
        1. Find the text box first --> find element
         */

        Thread.sleep(3000);
        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("akifvaliyev1973@gmail.com");


        Thread.sleep(3000);
        WebElement passwordBox = driver.findElement(By.id("okta-signin-password"));

        passwordBox.sendKeys("Akifakif2019");

        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.id("okta-signin-submit"));

        signIn.click();

        Thread.sleep(3000);
        driver.close();


    }
}
