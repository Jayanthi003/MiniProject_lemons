package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Prgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		System.out.println("*****************************************************************************");
		System.out.println("All Data");
		List<WebElement>all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webElement :all_data) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("****************************************************************************");
		System.out.println("particular Row Data");
		
		List<WebElement>row_data = driver.findElements(By.xpath("//table/tbody/tr[3]td"));
		for (WebElement row : row_data) {
			String row_text = row.getText();
			System.out.println(row_text);
			
		}
		System.out.println("******************************************************************************");
		System.out.println("Particular column_data");
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for(WebElement column : column_data) {
			String columnData = column.getText();
			System.out.println(columnData);
		}
		System.out.println("*************************************************************************");
		System.out.println("particular data");
		WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[5]td[6]"));
		System.out.println(particularData.getText());
		}
		
		
	}


