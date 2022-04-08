package com.milan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelectedOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		WebElement sluListBox = driver.findElement(By.id("slv"));

		Select select = new Select(sluListBox);
		String firstSelectedOption = select.getFirstSelectedOption().getText();
		System.out.println(firstSelectedOption);

		// PRINTING ALL SELECTED OPTIONS PRESENT IN THE LIST BOX
		// -------------
		// -------------
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select select2 = new Select(slvListBox);
		List<WebElement> allOptions = select2.getAllSelectedOptions();

		int count = allOptions.size();
		
		// 1.FOREACH LOOP
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
		
		
		//2.NORMAL FOR LOOP
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);

		}
	}

}
