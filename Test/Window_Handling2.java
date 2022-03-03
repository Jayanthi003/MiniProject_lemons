package com.Test;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("parent");
		driver.findElement(By.xpath("(//div[@class='mTxt'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mTxt'])[1]")).click();
		Set<String> s = driver.getWindowHandles();
		for (String string : s) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		String Actual_Title = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri";
		for (String Id : s) {
			if (driver.switchTo().window(Id).equals(Actual_Title)) {
				continue;
			}
		}
		/*Iterator<String> i1 = s.iterator();
		while(i1.hasNext()) {
			String child_window = i1.next();
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window)).getTitle());
				driver.close();
			}
		}
		
driver.switchTo().window(parent);*/
	}

}
