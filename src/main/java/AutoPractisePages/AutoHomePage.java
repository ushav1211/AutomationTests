package AutoPractisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoHomePage {
	public WebDriver driver;
	
	public AutoHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
			}

	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenMenuItem;
	
	@FindBy(xpath="//a[@title='Casual Dresses']")
	private WebElement casualDressesLink;
	

	public void clickCasualDress() {
		Actions mouseACtions = new Actions(driver);
		mouseACtions.moveToElement(womenMenuItem).build().perform();
		mouseACtions.moveToElement(casualDressesLink).click().build().perform();
	}
}
