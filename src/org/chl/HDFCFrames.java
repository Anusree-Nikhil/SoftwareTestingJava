package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement a = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(a);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12345666");
		WebElement b = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		b.click();
		Thread.sleep(4000);
		WebElement c = driver.findElement(By.xpath("//input[@placeholder='Password/ IPIN']"));
		c.sendKeys("hiii");

}
}