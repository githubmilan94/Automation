package com.milan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FourthTask {

	public static void main(String[] args) throws InterruptedException {
		handleScroll();
		
	}

	public static void handleScroll() throws InterruptedException {
		// detect chrome browser setup automatically
		WebDriverManager.chromedriver().setup();

		// Launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Launch Google on the browser
		//driver.navigate().to("https://www.saucedemo.com/");
		driver.navigate().to("https://www.wakefit.co/");
		Thread.sleep(2000);

		/*
		 * // Enter username
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * Thread.sleep(3600);
		 * 
		 * // Enter password
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * Thread.sleep(3600);
		 * 
		 * // click Login button to login to website
		 * driver.findElement(By.id("login-button")).click();
		 */
		Thread.sleep(3600);
		//Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 3500)");  
	}

}
