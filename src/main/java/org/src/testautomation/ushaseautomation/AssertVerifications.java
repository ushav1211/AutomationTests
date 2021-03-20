package org.src.testautomation.ushaseautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertVerifications {
	public WebDriver driver;
	public String contactUsLinktext;

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//         WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact us']"));
		 contactUsLinktext = driver.findElement(By.xpath("//a[text()='Contact us']")).getText();
		boolean contactUsLinkVerify = driver.findElement(By.xpath("//a[text()='Contact us']")).isDisplayed();
		System.out.println("contact us displayed true/False---" + contactUsLinkVerify);
		System.out.println("assert true line started");
		Assert.assertTrue(contactUsLinkVerify, "contact us link displayed usha test");
		System.out.println("assert true line completed");
		System.out.println("assert false line started");
//		Assert.assertFalse(contactUsLinkVerify, "Link not displayed usha test");
		System.out.println("assert false ended");
		System.out.println("get text value is ======"+contactUsLinktext);
		Assert.assertEquals(contactUsLinktext,"Contact us","Link not equal last asset by usha");
		
		WebElement cartLabel = driver.findElement(By.xpath("//b[text()='Cart']"));
		cartLabel.click();
		System.out.println("Cart summary opened");
		WebElement verifysignInTab = driver.findElement(By.xpath("//span[text()=' Sign in']"));
		boolean verifysignInTabVerify = verifysignInTab.isEnabled();
				System.out.println("Signin button is enabled/disabled True/False"+verifysignInTabVerify);
		
	}

}
