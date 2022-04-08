package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleSelectBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebElement multiListBox = driver.findElement(By.id("ABC"));
		Select select = new Select(multiListBox);
		select.selectByValue("i");
		select.selectByIndex(2);
		select.selectByVisibleText("Java");
		Thread.sleep(2000);
		select.selectByIndex(0);
		select.deselectByValue("v");
		select.deselectByVisibleText("python");
		System.out.println(select.isMultiple());
		

	}

}
