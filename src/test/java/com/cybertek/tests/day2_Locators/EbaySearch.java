package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
    public static void main(String[] args) throws InterruptedException {
        /*
        Task:
        Go to amazon  https://www.amazon.com/
        Go to Ebay   https://www.ebay.com/
        Enter a search term
        Click on search button
        Verify title contains search term
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.name("_nkw"));

        Thread.sleep(4000);
        searchBox.sendKeys("shoes" + Keys.ENTER);

//        WebElement searchBttn = driver.findElement(By.id("gh-btn"));
//        searchBox.click();

        String expectedPartialTitle = "shoes";
        String actual = driver.getTitle();

        if(actual.contains(expectedPartialTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
