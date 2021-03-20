package org.src.testautomation.ushaseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApContactUsPage {
	private WebDriver driver;
	public ApContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Contact Us']")
			private WebElement ContactUsLink;

//	@FindBy(css="select#id_contact")
//	private WebElement SubHeadingDropDown;
	WebElement slctDropDown = driver.findElement(By.cssSelector("select#id_contact"));
	Select dropDown=new Select(slctDropDown);
	
	public void clickOnContactUsLink() {
		ContactUsLink.click();
			}
	
	public void selectDropDown() {
//		dropDown.slctDropDown.selectByVisbileText("Customer service");
		
	}
}
