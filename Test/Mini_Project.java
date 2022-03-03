package com.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {


	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jayanthikumaran003@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Lakshi123");
		
		//scroll down
		JavascriptExecutor sc = (JavascriptExecutor) driver;
		sc.executeScript("window.scroll(0,500)", "");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement login = driver.findElement(By.xpath
				("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
		login.click();
		
		//actions
		Actions act = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		act.moveToElement(women).perform();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		tshirt.click();
		
		//scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scroll(0,400)", " ");
		
		//screenshot
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File from1 = ts1.getScreenshotAs(OutputType.FILE);
		File to1 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap1.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		WebElement bluecolour = driver.findElement(By.xpath("(//a[@class='color_pick'])[2]"));
		bluecolour.click();
		
		//scroll down
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scroll(0,400)", " ");
		
		//screenshot
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File from2 = ts2.getScreenshotAs(OutputType.FILE);
		File to2 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap2.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		Thread.sleep(3000);
		
		WebElement counts = driver.findElement(By.xpath
				("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]/span"));
		
		//loop
		for (int i = 0; i < 3; i++) {
			counts.click();
		}
		//Drop_Down
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s1 = new Select(size);
		s1.selectByValue("2");
		
		//scroll down
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scroll(0,500)", " ");
		
		//screenshot
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File from3 = ts3.getScreenshotAs(OutputType.FILE);
		File to3 =new File ("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap3.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		
		WebElement addcart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addcart.click();
		
		//screenshot
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File from4 = ts4.getScreenshotAs(OutputType.FILE);
		File to4 =new File ("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap4.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		
		WebElement checkout = driver.findElement(By.xpath
				("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		checkout.click();

		//scroll down
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scroll(0,500)", " ");
		
		Thread.sleep(2000);

		//screenshot
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File from5 = ts5.getScreenshotAs(OutputType.FILE);
		File to5 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap5.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		WebElement proceed = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		proceed.click();
		
		//scroll down
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scroll(0,500)", " ");
		
		//screenshot
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File from6 = ts6.getScreenshotAs(OutputType.FILE);
		File to6 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap6.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		Thread.sleep(2000);
		WebElement address1 = driver.findElement(By.xpath
				("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		address1.click();
		
		//scroll down
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scroll(0,700)", " ");
		
		Thread.sleep(2000);
		//screenshot
		TakesScreenshot ts7 = (TakesScreenshot) driver;
		File from7 = ts7.getScreenshotAs(OutputType.FILE);
		File to7 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap7.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		Thread.sleep(2000);
		WebElement proceed2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
		proceed2.click();
		
		//scroll down
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scroll(0,400)", " ");
		
		//screenshot
		TakesScreenshot ts8 = (TakesScreenshot) driver;
		File from8 = ts8.getScreenshotAs(OutputType.FILE);
		File to8 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap8.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		
		WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		confirm.click();
		
		//scroll down
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scroll(0,500)", " ");
		
		//screenshot
		TakesScreenshot ts9 = (TakesScreenshot) driver;
		File from9 = ts9.getScreenshotAs(OutputType.FILE);
		File to9 = new File("C:\\Users\\ kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap9.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);

	}

}

