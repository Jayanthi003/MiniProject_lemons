package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		String windowHandle = driver.getWindowHandle();
		System.out.println("firstwindow: " + windowHandle);
		driver.findElement(By.id("home")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles);
		List<String> list = new ArrayList<String>(WindowHandles);
		driver.switchTo().window(list.get(1));
		driver.close();
		Set<String> windowhandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowhandles2);
		driver.switchTo().window(list.get(0));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
