package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions a=new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement debit = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, debit).perform();
		
		
		WebElement sale = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement credit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(sale, credit).perform();
		
		WebElement debitMoney = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement debitDrop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(debitMoney,debitDrop).perform();
		
		WebElement saleMoney = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement saleDrop = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(saleMoney, saleDrop).perform();
		
	

}
}
