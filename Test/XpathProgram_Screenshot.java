package com.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import okhttp3.internal.Util;

public class XpathProgram_Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions(); //object creation
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("itzmejay@gmail.com"); //email
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ffhjghg"); //password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click(); //login
		//Take Screenshot
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver; // Narrowing Type casting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\screenshots\\a1.png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		  
	}

}
