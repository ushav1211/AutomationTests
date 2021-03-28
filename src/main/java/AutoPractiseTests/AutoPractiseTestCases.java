package AutoPractiseTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutoPractisePages.AutoHomePage;
import AutoPractisePages.CartSummaryPage;
import AutoPractisePages.CasualDressesPage;
import AutoPractisePages.LaunchAutoPractise;

public class AutoPractiseTestCases extends LaunchAutoPractise {

	public AutoHomePage autoHomePage;
	public CasualDressesPage casualDressesPage;
	public CartSummaryPage cartSummaryPage;
	
	
	@BeforeClass
	public void initialisePages() {
		autoHomePage = new AutoHomePage (driver);
		casualDressesPage = new CasualDressesPage (driver);
		cartSummaryPage = new CartSummaryPage (driver);
	}
	
	@Test
	public void shopDress() throws InterruptedException {
		autoHomePage.clickCasualDress();
		Thread.sleep(5000);
		casualDressesPage.checkBoxChecked();
		casualDressesPage.selectSortByDropDown();
		casualDressesPage.hoverOnImageIcon();
		casualDressesPage.clickOnAddtoCartButton();
		casualDressesPage.clickOnProceedtoChkoutButton();
		cartSummaryPage.clickOnProceedToButton();
		cartSummaryPage.enterEmailAddress();
		cartSummaryPage.enterPasswordTextBox();
		cartSummaryPage.clickOnSignOnButton();
		cartSummaryPage.clickOnCheckOutInAddrTab();
		cartSummaryPage.clickOncheckOutInShippingTab();
		cartSummaryPage.clickOnCloseButton();
//		cartSummaryPage.dismissAlert();
		cartSummaryPage.clickOnTermsCheckBox();
		cartSummaryPage.clickOncheckOutInShippingTab();
		cartSummaryPage.verifyPayByBankWire();
		cartSummaryPage.verifyPayByCheck();
	}
	
	
	
}
