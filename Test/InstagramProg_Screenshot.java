package com.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class InstagramProg_Screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions(); // object creation
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocorrect='off'][1]")).sendKeys("jayanthi5944"); // email
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Kutima003"); // password

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click(); // login

		// Take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; // Narrowing Typecasting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Screenshot\\a2.png");
		FileHandler.copy(source, destination);
	}

}
