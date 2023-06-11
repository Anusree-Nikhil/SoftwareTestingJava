package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesJavascript2 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement a1 = driver.findElement(By.xpath("(//a[@class='default-btn'])[4]"));
		js.executeScript("arguments[0].scrollIntoView(false)", a1);

}
}
