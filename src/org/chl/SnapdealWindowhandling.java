package org.chl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealWindowhandling {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.snapdeal.com/");
				
				driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span")).click();
				
				driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
				
				driver.manage().window().maximize();
				String a = driver.getWindowHandle();
				System.out.println("Parent id "+a);
				Set<String> a1 = driver.getWindowHandles();
				System.out.println("All window id: "+a1);
				for (String s : a1) {
					if(s != a) {
						driver.switchTo().window(s);
					}
				}
				WebElement qq = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
				qq.click();
				
				WebElement el = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
				String text = el.getText();
				System.out.println(text);
			}

}


