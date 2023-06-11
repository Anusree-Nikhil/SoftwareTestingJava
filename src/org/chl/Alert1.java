package org.chl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
public static void main(String[] args) throws InterruptedException    {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement a1 = driver.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]"));
		a1.click();
		
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		
		

}
}
