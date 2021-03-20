package pOMTests;

//import org.src.testautomation.ushaseautomation.test;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import POMPages.LaunchBrowser;
import POMPages.PgLogin;

public class PgLoginTest extends LaunchBrowser {
	public PgLogin pgLogin;

	@BeforeClass
	public void initialisePages() {
		pgLogin = new PgLogin(driver);
	}

	@Test(priority = 1)
	public void verifyContactUsLink() {
		pgLogin.clickOnContactUs();
		System.out.println("ContactUs link clicked");
	}

	@Test(priority = 2)
	public void fillingFields() {
		pgLogin.enterDropDown();
		System.out.println("Dropdownfilled");
		pgLogin.enterEmail();
		System.out.println("email address entered");
		pgLogin.enterOrderPreference();
		System.out.println("Order preference entered");
		pgLogin.enterMessageText();
		System.out.println("Message text entered");
		pgLogin.sendButtonClick();
		System.out.println("SendButtonClicked");
		
	}

//	@Test(priority = 3)
//	public void DropdownEnter() {
//		
//	}
}
