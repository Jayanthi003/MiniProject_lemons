package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://autopractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions Ac = new Actions(driver);
		Ac.moveToElement(Dresses).build().perform();
		WebElement Casual_Dresses = driver.findElement(By.xpath("(//a[text()='casual Dresses']"));
		Ac.click(Casual_Dresses).build().perform();
		WebElement Contact_us = driver.findElement(By.xpath("//a@title='contact Us']"));
		Ac.click(Contact_us).build().perform();
		WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		Ac.contextClick(Sign_in).build().perform();

	}

}
