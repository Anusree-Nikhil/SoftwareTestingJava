package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoneSignin {
	
public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(a1).perform();
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Anusree M");
		driver.findElement(By.id("ap_phone_number")).sendKeys("123456677");
		driver.findElement(By.name("password")).sendKeys("Nak@1234");
		
		driver.findElement(By.id("continue")).click();
		
		
		

}
}
