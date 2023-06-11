package org.chl;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRobot {
public static void main(String[] args) throws  AWTException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Robot r=new Robot();
		Actions a=new Actions(driver);
		
		WebElement b = driver.findElement(By.name("q"));
		b.sendKeys("Inmakes Infotech");
		a.moveToElement(b).perform();
		
		WebElement f = driver.findElement(By.xpath("//span[text()='Inmakes Infotech Pvt. Ltd.']"));
		a.doubleClick(f).perform();

}
}