package org.chl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		WebElement a1 = driver.findElement(By.id("day"));
		Select s=new Select(a1);
				
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			
			if(i%2!=0) {
				WebElement day = options.get(i);
			    String text = day.getText();
			    System.out.println(text);
			}
			
		}
	}


}
