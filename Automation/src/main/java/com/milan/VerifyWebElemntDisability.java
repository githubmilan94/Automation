package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyWebElemntDisability {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 boolean logo = driver.findElement(By.xpath("//input[@class  = 'trtryr']")).isDisplayed();
		 driver.findElement(By.id("btm")).submit();
		 WebElement e = driver.switchTo().activeElement();
		 
		 if(logo == true) {
			 System.out.println("disabled and pass");
		 }else {
			 System.out.println("Not Disabled and fail");
		 }
	}

}
