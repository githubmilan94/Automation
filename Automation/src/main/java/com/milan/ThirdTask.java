package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTask {

	public static void main(String[] args) throws Exception {
		handleDropDown();

	}
	
	public static void  handleDropDown() throws Exception {
		
		// detect chrome browser setup automatically
		WebDriverManager.chromedriver().setup();
		
		// Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// maximize browser
		driver.manage().window().maximize();
		
		// Launch Google on the browser
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		// Enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3600);
		
		// Enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3600);
		
		// click Login button to login to website
		driver.findElement(By.id("login-button")).click();
		
		// use Select class to select value from drop down
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
		select.selectByVisibleText("Price (low to high)");
		
		
	}

}
