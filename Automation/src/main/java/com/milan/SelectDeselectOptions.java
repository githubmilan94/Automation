package com.milan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDeselectOptions {

	public static void main(String[] args) throws Exception {
		
		// SELECT ALL OPTIONS PRESENT IN THE LISTBOX AND DESELECT REVERSE ORDER 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebElement mtnListBox = driver.findElement(By.id("XYX"));
		
		Select select = new Select(mtnListBox);
		List<WebElement> allOptions = select.getOptions();
		
		int count  = allOptions.size();
		// select
		for (int i=0;i<count;i++) {
			Thread.sleep(2000);
			select.selectByIndex(i);
		}
		
		// Deselect
		for (int i =  count  - 1; i>=0;i--) {
			select.deselectByIndex(i);
			Thread.sleep(2000);
		}
		
	}
}
