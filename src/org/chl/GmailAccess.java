package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAccess {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("anusree265");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("ss");
		
		
	}

}
