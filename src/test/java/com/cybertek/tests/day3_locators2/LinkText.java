package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //Locator -> LinkText

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));

        String textVersionOfExample3 = example3.getText();

        System.out.println(textVersionOfExample3);

        WebElement examle3_2 = driver.findElement(By.partialLinkText("Example 3"));

        String text = example3.getText();
        System.out.println(text);

        WebElement example4 = driver.findElement(By.linkText("Cybertek School"));

        //I can not print the above variable cybertekschool
        //because it is a webElement

        //in order to print, I need getText()

        String textVersionOfExample4 = example4.getText();
        System.out.println(textVersionOfExample4);

        //Todo. locate the element: Home

        WebElement example5 = driver.findElement(By.linkText("Home"));

        String textVersionOfExample5 = example5.getText();
        System.out.println(textVersionOfExample5);

        driver.close();


    }

}
