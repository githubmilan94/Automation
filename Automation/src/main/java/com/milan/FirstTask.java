package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Launch Google Chrome browser.
   Open URL: www.google.com
   Click on the Google Search text box.
   Type the value "javatpoint tutorials"
   Click on the Search button.

 * */
public class FirstTask {

	public static void googleSearchTask() throws InterruptedException {
		
		// detect chrome browser setup automatically
		WebDriverManager.chromedriver().setup();
		
		// Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		// maximize browser
		driver.manage().window().maximize();
		
		// Launch Google on the browser
		driver.navigate().to("https://www.google.com");
		
		// Click on the search text box and send value
		driver.findElement(By.name("q")).sendKeys("Selenium tutorial");
		
		// // Click on the search button 
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		// Wait for few seconds
		Thread.sleep(5);
		
		// close browser
		//driver.quit();
		driver.close(); 

	}

	public static void main(String[] args) throws InterruptedException {

		googleSearchTask();
	}

}
