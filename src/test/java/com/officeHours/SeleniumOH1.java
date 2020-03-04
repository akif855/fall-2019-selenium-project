package com.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {

    /*
        - Iterator
            -List, Set, Map and other types of collections can use Iterator class to iterate over that collection
            -List has indexex (for i, for each, while, Iterator)
            -Map (for each, Iterator - to loop through keys)
          - Basic Selenium Navigations -
     */

    public static void main(String[] args) {

        //Create arraylist of Strings - iterate over it

        ArrayList<String> keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator <String> iterator = keysToSearch.iterator();
        //iterator() - lreturn Iterator type which we can use with all iterator ,methods
        //[fruits, veggies, berries]
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //print before modification and
        //add * to each string in list before printing

        Iterator <String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()){
            String item = iterator1.next();
            System.out.println(item);
            System.out.println("*" + item);
        }

        //create a map with <String, String>
        HashMap <String, String> personalInfo = new HashMap<>();
        personalInfo.put("name", "Bryan");
        personalInfo.put("student_id", "21235987");
        personalInfo.put("major", "computer sience");

        Iterator <String> mapIterator = personalInfo.keySet().iterator();
        while (mapIterator.hasNext()){
            String key = mapIterator.next();
            System.out.println(key + ":" + personalInfo.get(key));
        }

        //==============================
        // SELENIUM
        /*
            id - unique (it is not always available) - we always want to use it when
            class - classname
            name
            tag - every element will have a tag

            will only work with the link
            linktext
            partial linktext

            locator that is using html (syntax)
            css
            xpath

            ------------------


         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://eatsy.com");

        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        //findElement() -> returns WebElement
        //as param we put By.locator("value
        //              (id, name, classname, class, ...)



    }
}
