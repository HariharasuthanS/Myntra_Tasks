package com.concept;

import java.awt.Desktop.Action;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class Browser_Launch {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
//	driver.get("https://www.youtube.com/");
//	
	driver.manage().window().maximize();
//	
//	String title = driver.getTitle();
//	System.out.println(title);
//	
//	String currentUrl = driver.getCurrentUrl();
//	System.out.println(currentUrl);
//	
//	driver.get("https://www.facebook.com/");
//	
//	driver.navigate().to("https://www.instagram.com/");
//	
//	driver.navigate().back();
//	
//	driver.navigate().to("https://www.twitter.com/");
//	
//	String title1 = driver.getTitle();
//	System.out.println(title1);
//	
//	driver.navigate().back();
//	
//	String currentUrl1 = driver.getCurrentUrl();
//	System.out.println(currentUrl1);
//	
//	driver.navigate().forward();
//	
//	driver.navigate().back();
//	
//	driver.get("https://www.irctc.co.in/");
//	
//	String title2 = driver.getTitle();
//	System.out.println(title2);
//	
//	String currentUrl2 = driver.getCurrentUrl();
//	System.out.println(currentUrl2);
//	
//	driver.close();
	
	//Day 2
	
	//Task 1
//	driver.get("https://www.youtube.com/");
//	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
//	String title = driver.getTitle();
//	System.out.println(title);
//	String currentUrl = driver.getCurrentUrl();
//	System.out.println(currentUrl);
//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("abc@gmail.com");
//	WebElement password = driver.findElement(By.id("pass"));
//	password.sendKeys("123@");
//	WebElement loginbtn = driver.findElement(By.name("login"));
//	loginbtn.click();
//	driver.navigate().back();
//	driver.navigate().back();
//	
	//Task 2
	
//	driver.get("https://www.instagram.com/");
//	Thread.sleep(3000);
//	WebElement username = driver.findElement(By.name("username"));
//	username.sendKeys("xyz@gmail.com");
//	WebElement instapassword = driver.findElement(By.name("password"));
//	instapassword.sendKeys("123$");
//	Thread.sleep(3000);
//	WebElement instalogin = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
//	instalogin.click();
	
	//Task 3
	
//	driver.get("https://demoqa.com/automation-practice-form");
//	WebElement firstname = driver.findElement(By.id("firstName"));
//	firstname.sendKeys("selvakumar");
//	WebElement lastname = driver.findElement(By.id("lastName"));
//	lastname.sendKeys("selva");
//	WebElement email = driver.findElement(By.id("userEmail"));
//	email.sendKeys("abcd@gmail.com");
//	WebElement usernumber = driver.findElement(By.id("userNumber"));
//	usernumber.sendKeys("1234567890");
//	WebElement dateofbirth = driver.findElement(By.id("dateOfBirthInput"));
//	dateofbirth.sendKeys("27 mar 2022");
	
	
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	
//	File source = ts.getScreenshotAs(OutputType.FILE);
//	
//	File destination=new File("\\name.png");
//	
//	FileUtils.copyFile(source, destination);
	
	//Day 5
//	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
//	WebElement firstname = driver.findElement(By.name("firstname"));
//	firstname.sendKeys("Selva");
//	WebElement lastname = driver.findElement(By.name("lastname"));
//	lastname.sendKeys("Kumar");
//	WebElement cookie = driver.findElement(By.id("banner-accept"));
//	cookie.click();
//	Thread.sleep(3000);
//	WebElement sex = driver.findElement(By.xpath("//input[@value='Male']"));
//	sex.click();
//	WebElement exp = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
//	exp.click();
//	WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//	date.sendKeys("30.03.2022");
//	
//	WebElement profession = driver.findElement(By.name("profession"));
//	profession.click();
//	
//	Thread.sleep(2000);
//	WebElement fselenium = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
//	fselenium.click();
//	Thread.sleep(2000);
//	WebElement country = driver.findElement(By.name("continents"));
//
//	Select s=new Select(country);
//	
//	s.selectByVisibleText("Europe");
//	WebElement multidrop = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
//	
//	Select a=new Select(multidrop);
//	a.selectByVisibleText("Browser Commands");
//	a.selectByVisibleText("Wait Commands");
//	a.selectByVisibleText("WebElement Commands");
//	
//	TakesScreenshot ss=(TakesScreenshot)driver;
//	File abc = ss.getScreenshotAs(OutputType.FILE);
//	File memory=new File("C:\\Users\\kowsalya\\eclipse-workspace\\Selenium\\screenshot\\tutorial.png");
//	FileUtils.copyFile(abc, memory);
	
	//Day7
	
//	driver.get("https://demoqa.com/frames");
//	WebElement a = driver.findElement(By.id("frame1"));
//	driver.switchTo().frame(a);
//	WebElement b = driver.findElement(By.id("sampleHeading"));
//	System.out.println(b.getText());
//	driver.switchTo().defaultContent();
//	Thread.sleep(3000);
//	
//	WebElement frame2 = driver.findElement(By.id("frame2"));
//	driver.switchTo().frame(frame2);
//	WebElement title2 = driver.findElement(By.id("sampleHeading"));
//    System.out.println(title2.getText());
	
	//Day8
	
//	driver.get("https://demo.guru99.com/test/drag_drop.html");
//	WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
//    Actions a=new Actions(driver);
//    a.doubleClick(bank).perform();
//    
//    driver.switchTo().alert().accept();
//    Thread.sleep(2000);
//    WebElement bankdrag = driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
//    a.contextClick(bankdrag).perform();
    
    //10 scroll
    
//	driver.get("https://the-internet.herokuapp.com/infinite_scroll");
//	Thread.sleep(2000);
//    driver.manage().deleteAllCookies();
//    
//    JavascriptExecutor js= (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0,500)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,2000)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,3000)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,-1000)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,-2000)");
//    Thread.sleep(2000);
//    js.executeScript("window.scrollBy(0,-3000)");
//    
      driver.get("https://www.amazon.in/");
      JavascriptExecutor js= (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,3000)");
      Thread.sleep(2000);
      WebElement scroll = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small grid-row-1'])[8]"));
      js.executeScript("arguments[0].scrollIntoView();",scroll);
      Thread.sleep(2000);
      js.executeScript("arguments[0].click();", scroll);
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
