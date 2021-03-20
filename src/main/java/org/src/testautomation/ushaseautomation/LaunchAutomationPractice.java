package org.src.testautomation.ushaseautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAutomationPractice {
	public static WebDriver driver;
	@Test
	public void OpenUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
//		driver.navigate().refresh();}
	}
		@Test
		public static void takeScreen(String filename) throws IOException{
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile , new File("\\Users\\Kesari\\eclipse-workspace\\ushaseautomation\\src\\main\\java\\org\\src\\testautomation\\ushaseautomation\\ushaTest.png"
		+filename+".jpg"));
	}

}
