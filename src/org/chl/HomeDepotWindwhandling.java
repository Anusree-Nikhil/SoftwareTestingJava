package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotWindwhandling {
	
public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("headerSearch")).sendKeys("ceiling fan");
		driver.findElement(By.id("headerSearchButton")).click();
		
		driver.findElement(By.xpath("//img[@alt='Image for Indoor Ceiling Fans']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"browse-search-pods-1\"]/div[1]/div/a/div/img[2]")).click();
			

}}

