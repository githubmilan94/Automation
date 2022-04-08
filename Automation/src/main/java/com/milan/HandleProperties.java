package com.milan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleProperties {
	
	 public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/home/wakefit/eclipse-workspace/Automation/src/main/java/com/milan/data.properties");
		prop.load(ip);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		String url = prop.getProperty("URL");
		System.out.println(1);
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		System.out.println(url);
		driver.get(url);
		System.out.println(2);
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_id"))).click();
		
		
		
		
		
//		String url = prop.getProperty("URL");
//		
//		String firstname  = prop.getProperty("firstName");
//		String lastName = prop.getProperty("lastName");
//		String city = prop.getProperty("city");
//		
//		// READ XPATH PROPERTIES 
//		String firstName_xpath = prop.getProperty("firstName_xpath");
//		String lastName_xpath = prop.getProperty("lastName_xpath");
//		String email_xpath = prop.getProperty("email_xpath");
//		String password_xpath =  prop.getProperty("password_xpath");
//
		

	}

}
