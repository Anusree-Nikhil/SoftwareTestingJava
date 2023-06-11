package org.chl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenShot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\Master\\anu\\AnuProject\\WebpageScreenshot\\flipkartlogin.jpg");
		
		FileUtils.copyFile(sc, f);
		
	}

}
