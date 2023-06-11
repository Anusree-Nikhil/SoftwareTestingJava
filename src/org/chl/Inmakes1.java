package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inmakes1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://inmakesedu.com/about_us");
				
				WebElement a = driver.findElement(By.xpath("//p[contains(text(),'best known')]"));
				String text = a.getText();
				System.out.println(text);
				
				WebElement b = driver.findElement(By.xpath("//p[contains(text(),'credentials')]"));
				String text2 = b.getText();
				System.out.println(text2);
				
				WebElement c = driver.findElement(By.xpath("//p[contains(text(),'Blockchain')]"));
				String text3 = c.getText();
				System.out.println(text3);
				

	}
}
