package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize(); 
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("575768787979");
	    System.out.println(email.getAttribute("value"));
	    WebElement Password = driver.findElement(By.name("pass"));
	    
	    Password.sendKeys("gugkjhjh");
	    Password.clear();
	    
	    boolean displayed = email.isDisplayed();
	    System.out.println("Is Displayed or Not"  +displayed);
	    boolean enabled = email.isEnabled();
	    System.out.println("Is Enabled or Not"   +enabled);
	    
	    boolean selected = email.isSelected();
	    System.out.println("Selected or Not"   +selected);
	    //Driver .findElement(By.name("pass")).sendkeys("gkjjhkj");
	    WebElement Login = driver.findElement(By.name("login"));
	    Login.click();
	    
	}

}
