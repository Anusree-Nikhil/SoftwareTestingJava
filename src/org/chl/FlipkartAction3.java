package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction3 {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("(//img[@class='_396cs4'])[4]"));
		a.moveToElement(a1).perform();
		
		WebElement a2 = driver.findElement(By.name("q"));
		a2.sendKeys("Realme");
		a2.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement a3 = driver.findElement(By.xpath("//div[text()='realme C33 2023 (Night Sea, 64 GB)']"));
		a3.click();

}
}