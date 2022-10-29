package com.miniproject;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cowin.gov.in/");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)");
	
	
	
}
}
