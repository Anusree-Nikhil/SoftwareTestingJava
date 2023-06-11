package org.chl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealRobot {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Robot r=new Robot();
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		a.contextClick(a1).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
