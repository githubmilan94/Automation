package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Launch web browser
 * Launch URL to the browser
 * Enter username
 * Enter password
 * Click on Login button
 * 
 * */


public class SecondTask {
	
	public static void loginTask() throws InterruptedException {
		
				// detect chrome browser setup automatically
				WebDriverManager.chromedriver().setup();
				
				// Launch chrome browser
				WebDriver driver = new ChromeDriver();
				
				// maximize browser
				driver.manage().window().maximize();
				
				// Launch Google on the browser
				driver.navigate().to("https://www.saucedemo.com/");
				Thread.sleep(3600);
				
				// Enter username
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(3600);
				
				// Enter password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(3600);
				
				// click Login button to login to website
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(3600);
				// click on add to cart
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(3600);
				// click on remove from cart
				driver.findElement(By.id("remove-sauce-labs-backpack")).click();
				Thread.sleep(3600);
				
				//click on menu button
				driver.findElement(By.id("react-burger-menu-btn")).click();
				
				Thread.sleep(3600);
				// click on logout button
				//driver.findElement(By.id("logout_sidebar_link")).click();
				
				//driver.close();
	}

	public static void main(String[] args) throws Exception  {
			loginTask();

	}

}
