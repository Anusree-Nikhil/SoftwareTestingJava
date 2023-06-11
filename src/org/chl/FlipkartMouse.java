package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouse {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions aa=new Actions(driver);
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/img"));
		aa.moveToElement(a).perform();
		
		
		
	}
	
	
}
