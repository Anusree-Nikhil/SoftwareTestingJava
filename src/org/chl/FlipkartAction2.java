package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction2 {
	
public static void main(String[] args)    {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("(//img[@class='_396cs4'])[9]"));
		a.moveToElement(a1).perform();
		
		WebElement a2 = driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
		a.moveToElement(a2).perform();
		
		WebElement a3 = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		a3.click();

}
}