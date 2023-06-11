package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inmakes {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmakesedu.com/");
		
		WebElement ss = driver.findElement(By.tagName("h1"));
		String text = ss.getText();		
		System.out.println(text);
		System.out.println("\n");
		
		WebElement aa = driver.findElement(By.tagName("p"));
		String text2 = aa.getText();
		System.out.println(text2);
		
		WebElement bb = driver.findElement(By.xpath("//p[contains(text(), 'totally cost effective')]"));
		String text3 = bb.getText();
		System.out.println(text3);
		
	}

}
