package com.milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopUP {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("/home/wakefit/Desktop/index.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/input[2]")).click();
		
	}

}
