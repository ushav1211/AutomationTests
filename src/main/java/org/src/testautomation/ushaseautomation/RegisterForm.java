package org.src.testautomation.ushaseautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RegisterForm {
	public static WebDriver driver = null;
@Test	
public void test() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement signinButton= driver.findElement(By.xpath("//a[@class='login']"));
	signinButton.click();
	WebElement emailAddressTextBox = driver.findElement(By.xpath("//input[@name='email_create']"));
	emailAddressTextBox.sendKeys("usha@gmail.com");
	WebElement createButton=driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
	createButton.click();
	WebElement webTitle= driver.findElement(By.xpath("//label[text()='Title']"));
	System.out.println("Title displayed is true /False---->"+webTitle.isDisplayed());
	WebElement registerButton=driver.findElement(By.xpath("//span[text()='Register']"));
	System.out.println("register button is displayed true/false"+registerButton.isDisplayed());
	WebElement createAccountText =driver.findElement(By.xpath("//h1[@class='page-heading']"));
	System.out.println("Heading displayed true/false"+createAccountText.isDisplayed());
	
	
	
}
}
