package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot2 {
public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(a1).perform();
	
		WebElement a2 = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(a2).perform();
		
		WebElement a3 = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(a3).perform();
		
		Thread.sleep(4000);
		
		WebElement a4 = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a4.click();
		
}

}
