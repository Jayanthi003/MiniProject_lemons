package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Program {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
	ChromeOptions ch = new ChromeOptions(); //object creation
	ch.addArguments("incongnito");
	
	WebDriver driver = new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("itzmejay@gmail.com");  //email id
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("fhghjgjg)"); //password
	driver.findElement(By.xpath("//button[@name=\"login\"]")); //login
}
}


