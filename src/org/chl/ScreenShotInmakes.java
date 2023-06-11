package org.chl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotInmakes {
	
	public static <TakesScreenShot> void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\anu\\AnuProject\\driverchrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://lh.inmakesedu.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File a = ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Master\\anu\\AnuProject\\WebpageScreenshot\\inmakeslogin.jpg");
		FileUtils.copyFile(a, des);
		
	}

}
