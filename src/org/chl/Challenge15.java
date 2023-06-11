package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge15 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_1_3w1N")).click();
		WebElement ss = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		ss.sendKeys("anusree265@gmail.com");
		System.out.println(ss);

}
}
