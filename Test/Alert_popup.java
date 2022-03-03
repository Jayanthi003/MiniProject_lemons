package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simpleAlert.click();
		Thread.sleep(1000);		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick ='confirmPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		
		alert3.sendKeys("Alert Handling");
		Thread.sleep(4000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Prompt Box text:   " +text);
		Thread.sleep(1000);
		alert3.accept();
		
		String text1 = driver.findElement(By.id("result1")).getText();
		System.out.println(text1);
		

	}

}
