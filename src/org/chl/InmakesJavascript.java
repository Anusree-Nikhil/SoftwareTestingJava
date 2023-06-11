package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesJavascript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement a1 = driver.findElement(By.xpath("//p[contains(text(),'public and business ')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", a1);
		
		System.out.println(a1.getText());
		
		//Object a2 = js.executeScript("return arguments[0].getText", a1);
		//System.out.println(a2);
}

}
