package com.hackerrank.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DataEntryAutomation {

    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
       //implement
       Select s = new Select(driver.findElement(By.id("month")));
       s.selectByValue("July");
       Select s1 = new Select(driver.findElement(By.id("day")));
       s1.selectByValue("11");
       Select s2 = new Select(driver.findElement(By.id("year")));
       s2.selectByValue("1990");
    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {
        //implement
    	
    	String java_WE = "//input[@name='favorite_language'][1]";
    	String python_WE = "//input[@name='favorite_language'][5]";
    	String linux_WE = "//input[@name='favorite_os'][1]";
    	String mac_WE = "//input[@name='favorite_os'][3]";
    	String intelliJ_WE = "//input[@name='favorite_idea'][1]";
    	
    	WebElement java = driver.findElement(By.xpath(java_WE));
    	java.click();
    	
       	WebElement python = driver.findElement(By.xpath(python_WE));
       	python.click();
       	
       	WebElement linux = driver.findElement(By.xpath(linux_WE));
       	linux.click();
       	
       	WebElement mac = driver.findElement(By.xpath(mac_WE));
       	mac.click();
       	
       	WebElement intelliJ = driver.findElement(By.xpath(intelliJ_WE));
       	intelliJ.click();
    }
}
