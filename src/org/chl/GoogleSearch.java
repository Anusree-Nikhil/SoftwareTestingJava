package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement a = driver.findElement(By.id("APjFqb"));
		a.sendKeys("Inmakes Learning Hub");
		a.sendKeys(Keys.ENTER);
		
		WebElement b = driver.findElement(By.partialLinkText("https://www.inmakeslh.in/"));
		b.click();
		
	}

}
