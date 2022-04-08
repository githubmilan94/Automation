package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeightWidthtextBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement emailHeight = driver.findElement(By.id("email"));
		int height = emailHeight.getSize().getHeight();
		int width = emailHeight.getSize().getWidth();
		System.out.println(height+  " " + width);
		
	}
}
