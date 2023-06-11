package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazoneSearch2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.amazon.in/");
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ladies Kurtis");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
			}

}
