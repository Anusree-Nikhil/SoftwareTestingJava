package org.chl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneWindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 13 Mini (512GB) - Starlight']")).click();
				String a = driver.getWindowHandle();
				System.out.println("Parent id "+a);
				Set<String> a1 = driver.getWindowHandles();
				System.out.println("All window id: "+a1);
				for (String s : a1) {
					if(s != a) {
						driver.switchTo().window(s);
					}
						
					
				}
				WebElement qq = driver.findElement(By.xpath("(//span[contains(text(),'94,900')])[1]"));
				String text = qq.getText();
				System.out.println("Price "+ text);
			}

}
