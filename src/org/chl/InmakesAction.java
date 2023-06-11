package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class InmakesAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://lh.inmakesedu.com/home");
				
				Actions a=new Actions(driver);
				
				WebElement a1 = driver.findElement(By.xpath("//a[@class='nav-link']"));
				a.moveToElement(a1).perform();
				
				WebElement b = driver.findElement(By.xpath("(//button[@class='dropdown-toggle'])[10]"));
				a.moveToElement(b).perform();
				
				Thread.sleep(3000);
				
				WebElement c = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
				c.click();

}
}

