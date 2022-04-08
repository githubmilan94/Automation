package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {
	
	public static void customXPath() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Vivo");
		Thread.sleep(3000);
		// design xpath using contains function
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-cart-count")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		

	}

	public static void main(String[] args) throws InterruptedException {

		customXPath();
	}

}
