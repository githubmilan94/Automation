package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
		WebElement monthList = driver.findElement(By.id("month"));
		
		Select select = new Select(monthList);
		select.selectByIndex(3);
		select.selectByValue("7");
		select.selectByVisibleText("NOV");
		
		
		
		
		
	}

}
