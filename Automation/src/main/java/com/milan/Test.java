package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://html.com/input-type-file/");
		//driver.get("https://html.com/input-type-file/");
		
		JavascriptExecutor jsexecutor  = (JavascriptExecutor) driver;
		jsexecutor.executeScript("scrollBy(0,1300)");
		
		driver.findElement(By.name("fileupload")).sendKeys("/home/wakefit/Desktop/index.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/input[2]")).click();
		
		driver.navigate().back();
		
		
		
		

	}

}
