package com.milan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void handleAlert() throws InterruptedException {
		// detect chrome browser setup automatically
		WebDriverManager.chromedriver().setup();

		// Launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Launch Google on the browser
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		  Alert alert = driver.switchTo().alert();
		  System.out.println(alert.getText());// get me the text present on the alert box
		  
		  String text = alert.getText();
		  if(text.equals("Please enter a valid user name")) {
			  System.out.println("Correct");
		  } else {
			  System.out.println("Incorrect");
		  }
		  
		  Thread.sleep(3000);
		  alert.accept();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		handleAlert();

	}

}
