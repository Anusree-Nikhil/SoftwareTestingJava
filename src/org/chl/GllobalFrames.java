package org.chl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GllobalFrames {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='click here']")).click();
		String a = driver.getWindowHandle();
		System.out.println(a);
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		
		for (String string : s) {
			if(string != a) {
				driver.switchTo().window(string);
			}
			
		}
		WebElement a1 = driver.findElement(By.xpath("(//input[@name='DUMMY1'])[1]"));
		a1.sendKeys("anu");
		a1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']")).sendKeys("1234");
		

}
}