package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoneSignin2 {
	
public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(a1).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Seller Account']")).click();		

}
}

