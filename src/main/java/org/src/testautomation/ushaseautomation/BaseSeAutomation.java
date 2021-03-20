package org.src.testautomation.ushaseautomation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSeAutomation {
	public WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void openUrl() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	}
//	@AfterMethod
//	public void quitApp() {
//		driver.quit();
//	}
	
	
	
	

}
