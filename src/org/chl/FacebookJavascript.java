package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJavascript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement a1 = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','anusree265@gmail.com')", a1);
		
		WebElement a2 = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','anu')", a2);
		
		WebElement a3 = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", a3);
		
	}

}
