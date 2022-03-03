package com.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Actions s = new Actions(driver);
		driver.navigate().to("http://www.ajio.com/");
		
		
		
		
		Set<String> All_Id = driver.getWindowHandles();
		for (String string : All_Id) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}

		String Actual_title = "http://www.amazon.in/";
		for (String string : All_Id) {
			if (driver.switchTo().window(string).getTitle().equals(Actual_title)) {
				continue;

			} else {
				driver.close();
			}
		}

	}

}
