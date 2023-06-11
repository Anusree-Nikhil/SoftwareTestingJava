package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inmakes2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmakesedu.com/");
		
		WebElement a = driver.findElement(By.xpath("//a[contains(text(),'Dubai')]"));
		String text = a.getText();
		System.out.println(text);
		
	}

}
