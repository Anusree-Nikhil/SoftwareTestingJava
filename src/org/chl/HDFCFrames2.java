package org.chl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrames2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(a);
		
		WebElement b = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		b.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
