package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_prgm {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		// single Frame
		// Switching by id
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("single Frame");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		// Multiframe
		driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]")).click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(1000);
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'][1]"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Multiple Frame");
		Thread.sleep(1000);
		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[5]")).click();

	}

}
