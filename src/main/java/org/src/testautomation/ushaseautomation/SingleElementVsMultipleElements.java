package org.src.testautomation.ushaseautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleElementVsMultipleElements {
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws MalformedURLException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		DesiredCapabilities dc = new DesiredCapabilities().safari();
		dc.setCapability("platform", Platform.MAC);
		driver = new RemoteWebDriver(new URL("http://ushavalle1:iXieip6wF3Q8qPsdyrq5@hub.browserstack.com:80/wd/hub"), dc);
	}

	@BeforeTest
	public void openUrl() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void verifyMultipleElements() throws InterruptedException {
		// driver.navigate().to("http://the-internet.herokuapp.com/add_remove_elements/");
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
		WebElement singleButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));

		System.out.println("singleButton ========" + singleButton);
		System.out.println("Number of Add/Remove ELement ====== " + singleButton.getSize());

		List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));

	}
}