package PgObjPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath="//a[@href=\"/broken_images\"]")
	private WebElement BrokenImageLink;
	
	@FindBy(xpath="//a[@href='/checkboxes']")
	private WebElement CheckBoxesLink;
	
	public void clickOnBrokenImageLink() {
		BrokenImageLink.click();
	}
	public void clickOnCheckBoxesLink() {
		CheckBoxesLink.click();
	}
}

