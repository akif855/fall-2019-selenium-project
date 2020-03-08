package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object

        Faker fakeData = new Faker();

        //I need firstName

        String name = fakeData.name().firstName();
        System.out.println(name);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsm");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPass");

        WebElement loginButton = driver.findElement(By.id("wooden_spoon"));
        loginButton.submit();

        WebElement errorMessage = driver.findElement(By.id("flash"));
    }
}
