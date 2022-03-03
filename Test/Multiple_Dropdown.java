package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement multiDropdown = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiDropdown);
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		s.deselectByValue("3");
		// s.deselectAll();
		boolean multiple = s.isMultiple();
		System.out.println("Is multiple or Not:     " + multiple);

		List<WebElement> opt = s.getOptions();
		for (WebElement webElement : opt) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("***************");
		List<WebElement> aso = s.getAllSelectedOptions();
		for (WebElement webElement : aso) {
			System.out.println(webElement.getText());
		}

		System.out.println("*****************");
		WebElement fso = s.getFirstSelectedOption();
		System.out.println(fso.getText());

	}

}
