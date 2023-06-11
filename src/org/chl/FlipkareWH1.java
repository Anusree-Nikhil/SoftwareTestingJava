package org.chl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkareWH1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.name("q"));
		a.sendKeys("redmi phone");
		a.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='REDMI 10 Power (Sporty Orange, 128 GB)'])[1]")).click();
		String c = driver.getWindowHandle();
		System.out.println("Parent id "+c);
		Set<String> a1 = driver.getWindowHandles();
		System.out.println("All window id: "+a1);
		for (String s : a1) {
			if(s != c) {
				driver.switchTo().window(s);
			}
			}
		WebElement b = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = b.getText();
		System.out.println(text);
	}

}
