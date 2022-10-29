package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automated_Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
		
        	driver.manage().window().maximize();
			
			driver.navigate().to("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
//			driver.close();
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			
			System.out.println(url);
			
			String pageSource = driver.getPageSource();
			
			System.out.println(pageSource);
			
			
			
			
	}

}
