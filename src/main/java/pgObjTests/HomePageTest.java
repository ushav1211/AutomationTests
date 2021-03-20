package pgObjTests;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.src.testautomation.ushaseautomation.BaseSeAutomation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PgObjPackage.HomePage;

public class HomePageTest extends BaseSeAutomation{
public HomePage homePage;

@BeforeClass
public void initialisePages() {
	homePage=new HomePage(driver);
}
@Test
public void verifyBrokenImageLink() {
	homePage.clickOnBrokenImageLink();
	System.out.println("brokenimagesclicked");
}
@Test
public void verifyCheckBoxesLink() {
	homePage.clickOnCheckBoxesLink();
	System.out.println("checkboxeslinkclicked");
}
}