package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {

        //go to practice login page
        //locate username box with absolute xpath
        //locate username box with relative xpath

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");

        //  /html/body/div/div[2]/div/div/form/div[1]/div/input
        //  //input[@type='text']

        Thread.sleep(3000);

//        WebElement absolute = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
//        absolute.sendKeys("akifvaliyev1973@gmail.com");

        WebElement relative = driver.findElement(By.xpath("//input[@type='text']"));
        relative.sendKeys("akifvaliyev1973@gmail.com");




    }
}
