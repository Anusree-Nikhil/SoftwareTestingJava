package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinJavascript {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement a1 = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','anusree265@gmail.com')", a1);
		
		WebElement a2 = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','anu')", a2);
		
		WebElement a3 = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", a3);
		
	}

}
