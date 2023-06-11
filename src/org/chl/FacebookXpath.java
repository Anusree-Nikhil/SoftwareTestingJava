package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anusree265@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("anu");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

}
}
