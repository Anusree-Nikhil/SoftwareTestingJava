package org.chl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoneRobot {
public static void main(String[] args) throws InterruptedException, AWTException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		WebElement a1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(a1).perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		WebElement aa = driver.findElement(By.name("email"));
		aa.sendKeys("Nakshathra");
		a.doubleClick(aa).perform();
		a.contextClick(aa).perform();
		
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);}
			
			
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

}
}
