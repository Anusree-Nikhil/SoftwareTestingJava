package org.chl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal2 {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		Actions a=new Actions(driver);
		
		WebElement a1 = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(a1).perform();

		Thread.sleep(4000);
		
		WebElement a2 = driver.findElement(By.xpath("//span[text()='Heels']"));
		a2.click();

}
}