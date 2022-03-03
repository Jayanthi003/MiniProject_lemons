package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Task {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://www.facebook.com/");
			d.manage().window().maximize();
			String title = d.getTitle();
			System.out.println(title);
			String currentUrl = d.getCurrentUrl();
			System.out.println(currentUrl);
			//Navigation method
			d.navigate().to("https://www.youtube.com/");
			d.navigate().back();
			d.navigate().forward();
			Thread.sleep(1000);
			d.navigate().refresh();
			d.close();
			
	
	
}
}
