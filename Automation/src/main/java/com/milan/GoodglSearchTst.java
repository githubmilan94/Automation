package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoodglSearchTst {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/");
		driver.get("https://dev2-crm.wakefit.co/order-search?orderId=ORDER202203i3gBwx");
		
		driver.findElement(By.name("q")).sendKeys("Testing Tutorial");
		
		// SELECT ANY SPECIFIC SUGGESIONS FROM GOOGLE SEARCH
		//driver.findElements(By.xpath(""))
	}

}
