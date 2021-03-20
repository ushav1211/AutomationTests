package pgObjTests;

import org.src.testautomation.ushaseautomation.ApContactUsPage;
//import org.src.testautomation.ushaseautomation.ApSigninPage;
import org.src.testautomation.ushaseautomation.LaunchAutomationPractice;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUsTest extends LaunchAutomationPractice{

	public ApContactUsPage apContactUsPage;
	@BeforeTest
	public void initialisePages() {
		apContactUsPage= new ApContactUsPage(driver);
	}
	@Test
public void clickContactUsLink() {
		apContactUsPage.clickOnContactUsLink();
	}
}
