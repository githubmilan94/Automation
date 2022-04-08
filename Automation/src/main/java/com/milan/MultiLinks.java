package com.milan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.source.doctree.LinkTree;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ebay.com/");
		
		// get all the links on the page
		// get count of all the LINKS, INput tags , etc 
		List<WebElement> linklist = 	driver.findElements(By.tagName("a"));
		
		System.out.print(linklist.size()+"\n");
		
		for (int i = 0; i < linklist.size(); i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
		}
		
		
	}

}
