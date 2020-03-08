package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) throws InterruptedException {
        /*
        go to http://practice.cybertekschool.com/context_menu
        verify Context Menu is on the page
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");

        Thread.sleep(3000);



        WebElement message = driver.findElement(By.xpath("//h3[text() = 'Context Menu']"));


        String actualText = message.getText();

        String expectedText = "Context Menu";

        if(expectedText.equals(actualText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}