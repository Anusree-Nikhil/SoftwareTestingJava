package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQAjavascriptExecuter {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://toolsqa.com/#");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement a1 = driver.findElement(By.xpath("//span[text()='Youtube']"));
		js.executeScript("arguments[0].scrollIntoView(false)", a1);
		
		Thread.sleep(5000);
		
		WebElement a2 = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		js.executeScript("arguments[0].scrollIntoView(true)", a2);
		
	}

}
