package ipt.myntra.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.concept.Browser_Launch;

public class A {
	
	public static WebDriver driver;
	public static int totalNumberOfProducts;
	public static int minPrice;
	
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//Webdriver
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	}
	
	//Task 1
	public static void productsCount() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//li[@class='product-base']"));
		totalNumberOfProducts = allProducts.size();
		System.out.println("Total count of products is: "+totalNumberOfProducts);
		
		for (WebElement product : allProducts) {
			//System.out.println("Product Brand Name is : "+product.getText());
		}
	}
	//Task 2
	public static void minimumPriceOfallProducts() {
		List<Integer> priceList=new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']/span/span[@class=\"product-discountedPrice\"]"));
		for(WebElement price : allPrices) {
			String priceText= price.getText().replaceAll("Rs. ", "");
			System.out.println(priceText);
			Integer priceValue = Integer.parseInt(priceText);
			priceList.add(priceValue);
		}
		minPrice = Collections.min(priceList);
		System.out.println("MINIMUM PRICE: "+minPrice);
	}
	//Task 3
	public static void getProductNameOfMinPrice() {
		
	}
	
	public static void main(String[] args) {
		browserLaunch();
		productsCount();
		minimumPriceOfallProducts();
	}
//li[@class='product-base']//descendant::div[@class='product-price']/span/span[@class=\"product-discountedPrice\"]
}
