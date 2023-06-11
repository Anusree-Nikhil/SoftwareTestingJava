package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTrain {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.id("from_station")).sendKeys("Carmelarm");
		driver.findElement(By.name("to_station")).sendKeys("Kozhikode");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

}
	
}
