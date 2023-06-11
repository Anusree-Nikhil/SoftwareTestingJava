package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShpClues {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.shopclues.com/wholesale.html");
				
			//Actions a=new Actions(driver);			
			driver.findElement(By.id("autocomplete")).click();
				
			driver.findElement(By.xpath("//*[@id=\'search\']/div/div/ul[2]/li[9]/a")).click();
				
			}

}
