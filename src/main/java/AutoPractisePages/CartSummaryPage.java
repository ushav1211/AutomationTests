package AutoPractisePages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartSummaryPage {
	
		public WebDriver driver;
//		public Alert jsAlert;
		
		public CartSummaryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		@FindBy(xpath="//span[text()='Proceed to checkout']")
		private WebElement proceedToButton;
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement emailAddressTextBox;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement PasswordTextBox;
		
		@FindBy(xpath="//button[@id='SubmitLogin']")
		private WebElement signInButton;
		
		@FindBy (xpath="//span[text()='Proceed to checkout']")
		private WebElement checkOutInAddrTab;
		
		@FindBy (xpath="//button/span[normalize-space()='Proceed to checkout']")
		private WebElement checkOutInShippingTab;
		
		@FindBy (xpath="//span/input[@type=\"checkbox\"]")
		private WebElement termsCheckBox;
		
		@FindBy (xpath="//a[@class='bankwire']")
		private WebElement payByBanKWire;
		
		@FindBy (xpath="//a[@class='cheque']")
		private WebElement payByCheck;
		
		@FindBy (xpath="//a[@title='Close']")
		private WebElement closeButton;
		
		public void clickOnProceedToButton() {
			proceedToButton.click();
		}
		public void enterEmailAddress() {
			emailAddressTextBox.sendKeys("usha@test.com");
			System.out.println("Email entered for aignin");
		}
		public void enterPasswordTextBox() {
			PasswordTextBox.sendKeys("123456");
			System.out.println("Password entered signin");
		}
		public void clickOnCheckOutInAddrTab() {
			checkOutInAddrTab.click();
			System.out.println("checkout tab clicked");
		}
		public void clickOncheckOutInShippingTab() {
			checkOutInShippingTab.click();
			System.out.println("checkout clicked in shipping tab");
		}
		public void clickOnTermsCheckBox() {
			termsCheckBox.click();
			System.out.println("agree terms checkbox clicked");
		}
		public void verifyPayByBankWire() {
			System.out.println("1. Verification pay by bank wire====" + payByBanKWire.isDisplayed());
			System.out.println("1. Verification pay by bank wire====" + payByBanKWire.getText());
			Assert.assertTrue(payByBanKWire.isDisplayed());
						
		}
		public void verifyPayByCheck() {
			System.out.println("1. Verification pay by bank wire====" + payByCheck.isDisplayed());
			System.out.println("1. Verification pay by bank wire====" + payByCheck.getText());
			Assert.assertTrue(payByCheck.isDisplayed());
						
		}
		public void clickOnSignOnButton() {
			signInButton.click();
		}
		
//		public void dismissAlert() {
//			jsAlert= driver.switchTo().alert();
//			jsAlert.dismiss();
//		}
		public void clickOnCloseButton() {
			closeButton.click();
		}
		
}
