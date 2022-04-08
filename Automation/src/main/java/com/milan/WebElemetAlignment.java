package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemetAlignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		int x1 = driver.findElement(By.id("email")).getLocation().getX();
		int y1 = driver.findElement(By.id("email")).getLocation().getY();
		
		if(x1 == y1) {
			System.out.println("Properly aligned...");
		} else {
			System.out.println("Not Properly Aligned...");
		}
		
		
		
		
		
	}

}
