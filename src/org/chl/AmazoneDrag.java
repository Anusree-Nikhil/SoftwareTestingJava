package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoneDrag {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		Actions aa=new Actions(driver);
		
		WebElement a = driver.findElement(By.xpath("//span[text()='Prime']"));
		aa.moveToElement(a).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();		
		

}
	
}
