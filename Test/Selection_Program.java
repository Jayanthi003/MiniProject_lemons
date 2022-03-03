package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Selection_Program {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ticket");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Booking");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("jay123@gmail.com");
		Thread.sleep(2000);
		WebElement Date = driver.findElement(By.id("day"));
		Select s = new Select(Date);
		s.selectByValue("13");
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.id("month"));
		Select s1 = new Select(Month);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1986");
		Thread.sleep(1000);
		boolean multiple = s.isMultiple();
		System.out.println("multiple or no:" + multiple);

		List<WebElement> opt = s2.getOptions();
		for (WebElement webElement : opt) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("First selected option");
		WebElement FSO = s2.getFirstSelectedOption();

		System.out.println(FSO.getText());

	}
}
