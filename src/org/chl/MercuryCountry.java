package org.chl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryCountry {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
				
		WebElement a1 = driver.findElement(By.xpath("//select[@name='country']"));
		
		Thread.sleep(3000);
		Select s=new Select(a1);
		boolean mul = s.isMultiple();
		System.out.println(mul);
		//s.selectByVisibleText("INDIA");
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			
			WebElement contry = options.get(i);
			String text = contry.getText();
			System.out.println(text);
			
		}
		
	}


}
