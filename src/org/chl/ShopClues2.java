package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues2 {
	
public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
				
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.shopclues.com/wholesale.html");
				
			Actions a=new Actions(driver);
			
			WebElement a1 = driver.findElement(By.xpath("//a[text()='Sports & More']"));
			a.moveToElement(a1).perform();
			
			Thread.sleep(4000);
			WebElement a2 = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
			a2.click();
			
			
			
}

}
