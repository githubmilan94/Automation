package com.milan;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNavigate {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		// Here driver reference has been type caste to Takescreenshot Interface
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Copy screen shots to the desire location
		FileUtils.copyFile(src, new File("/home/wakefit/eclipse-workspace/Automation/src/main/java/com/milan/google.png"));
		
	}
	

}
