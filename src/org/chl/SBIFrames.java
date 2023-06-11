package org.chl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(3000);		
		WebElement a = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		a.click();
		
		WebElement b = driver.findElement(By.id("Button2"));
		b.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
