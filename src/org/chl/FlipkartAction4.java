package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction4 {
	
public static void main(String[] args) throws InterruptedException    {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("(//img[@class='_396cs4'])[6]"));
		a1.click();
		Thread.sleep(3000);
		
		WebElement a2 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	    a.moveToElement(a2).perform();
		
		
}
}