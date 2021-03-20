package POMPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PgLogin {

	public WebDriver driver;

	public PgLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='Contact us']")
	private WebElement contactUSLink;

	@FindBy(xpath = "//select[@id='id_contact']")
	private WebElement DropDown;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailAddLink;

	@FindBy(xpath = "//input[@type='text'][@id='id_order']")
	private WebElement orderPreferenceTextBox;

	@FindBy(xpath = "//button[@type=\"submit\"]/span[text()='Send']")
	private WebElement sendButton;

	@FindBy(xpath = "//textarea")
	private WebElement messageTextBox;

	public void clickOnContactUs() {
		contactUSLink.click();
	}

	public void enterDropDown() {
		Select selctDropDown = new Select(DropDown);
		selctDropDown.selectByIndex(1);
	}

	public void enterEmail() {
		EmailAddLink.sendKeys("test@test.com");

	}

	public void enterOrderPreference() {
		orderPreferenceTextBox.sendKeys("first");

	}

	public void sendButtonClick() {
		sendButton.click();
	}

	public void enterMessageText() {
		messageTextBox.sendKeys("Yahoooooo....ContactUs Page completed");
	}
}
