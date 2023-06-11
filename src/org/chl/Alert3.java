package org.chl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
	
public static void main(String[] args) throws InterruptedException    {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement a1 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		a1.click();
		
		WebElement a2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		a2.click();
		
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("Helloo");
		Thread.sleep(3000);
		String text = a3.getText();
		System.out.println(text);
		
		a3.accept();

}
}