package org.chl;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("nikhilanu");
		driver.findElement(By.id("password")).sendKeys("Nakshathra");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		WebElement a1 = driver.findElement(By.id("location"));
		Select s1=new Select(a1);
		s1.selectByVisibleText("Sydney");
		
		WebElement a2 = driver.findElement(By.id("hotels"));
		Select s2=new Select(a2);
		s2.selectByVisibleText("Hotel Creek");

		WebElement a3 = driver.findElement(By.id("room_type"));
		Select s3=new Select(a3);
		s3.selectByValue("Double");

		WebElement a4 = driver.findElement(By.id("room_nos"));
		Select s4=new Select(a4);
		s4.selectByVisibleText("4 - Four");
		Thread.sleep(4000);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("continue")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\Master\\anu\\AnuProject\\WebpageScreenshot\\adactinpayment.png");
		
		FileUtils.copyFile(screenshotAs, f);

}

}
