package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.className("login")).click();
	driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("javas@gmail.com");
	driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Z");
	//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("javas@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("java5432@");
	WebElement day = driver.findElement(By.id("days"));
	Select d=new Select(day);
	d.selectByValue("3");
	
	WebElement month = driver.findElement(By.id("months"));
	Select m=new Select(month);
	m.selectByValue("2");
	
	WebElement year = driver.findElement(By.id("years"));
	Select y=new Select(year);
	y.selectByValue("2022");
	
	driver.findElement(By.id("firstname")).sendKeys("abc");
	driver.findElement(By.id("lastname")).sendKeys("Z");
	driver.findElement(By.id("company")).sendKeys("xyz");
	driver.findElement(By.id("address1")).sendKeys("Dlf Opposite, Greens technology, Porur");
	driver.findElement(By.id("address2")).sendKeys("aabbcc");
	driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("hhh");
	
	WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
	Select a=new Select(state);
	a.selectByValue("3");
	
	driver.findElement(By.id("postcode")).sendKeys("85018");
	WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
	Select c=new Select(country);
	c.selectByValue("21");
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("No information");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8768676576");
	driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("8768676576");
	driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Dlf Opposite");
	
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File ss=ts.getScreenshotAs(OutputType.FILE);
//	File memory=new File("C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\screenshot\\miniproject.png");
//	FileUtils.copyFile(ss, memory);
	
	driver.findElement(By.xpath("//span[text()='Register']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
