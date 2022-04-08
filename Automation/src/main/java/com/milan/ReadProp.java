package com.milan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/milan.kuilya@wakefit.me/eclipse-workspace/Automation/src/main/java/com/milan/abc.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
	}

}
