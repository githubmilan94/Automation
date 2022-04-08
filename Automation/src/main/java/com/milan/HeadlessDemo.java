//package com.milan;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class HeadlessDemo {
//
//	// EITHOUT LAUNCHING BROWSER WE CAN EXECUTE THE TEST CASES
//	// PERFORMABCE : VERY FAST AS COMPARE TO OTHER
//	public static void main(String[] args) {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new HtmlUnitDriver();
//		
//		driver.get("https://www.saucedemo.com/");
//		
//		System.out.println("Before login title " + driver.getTitle());
//		
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		System.out.println("After login " + driver.getTitle());
//	}
//
//}
