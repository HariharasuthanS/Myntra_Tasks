package com.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.className("login")).click();

		driver.findElement(By.id("email")).sendKeys("javas@gmail.com");

		driver.findElement(By.id("passwd")).sendKeys("java5432@");

		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File memory = new File("C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\screenshot\\login.png");
		FileUtils.copyFile(ss, memory);

	}

}
