package com.milan;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkImages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.wakefit.co/");
	//	driver.get("https://www.wakefit.co/categories/mattress");
		driver.get("https://dev2-crm.wakefit.co/order-search?orderId=ORDER202203i3gBwx");
		// GET ALL LINKS & IMAGES
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of all links & images----> " + linksList.size());
		// find all active links 
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i =0;i<linksList.size();i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("javascript"))  && (! linksList.get(i).getAttribute("href").contains("tel"))) {
				activeLinks.add(linksList.get(i));
			}
		}
		System.out.println("Size of active LINKS & IMAGES----> "+ activeLinks.size());
		// CHECK HREF URL WITH HTTPCONNECTION API:
		for(int j = 0; j<activeLinks.size();j++) {
			HttpURLConnection connection =(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			int responseCode = connection.getResponseCode();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")  + "----> " + response + "  " + responseCode);
		}
	}

}
