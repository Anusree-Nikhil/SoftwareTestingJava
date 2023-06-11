package org.chl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraFrames {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.canarabank.in/?module=login");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
		
		/*Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);*/
		
		WebElement aa = driver.findElement(By.xpath("//span[text()='User Id must be entered']"));
		String text = aa.getText();
		System.out.println(text);
	}

}
