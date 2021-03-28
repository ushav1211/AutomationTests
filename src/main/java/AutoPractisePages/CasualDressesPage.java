package AutoPractisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CasualDressesPage {
	public WebDriver driver;
	
	public CasualDressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//a[text()='M']")
	private WebElement checkBoxM;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	private WebElement sortByDropDown;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//span[normalize-space()=\"Proceed to checkout\"]")
	private WebElement ProceedtoChkoutButton;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement ImageIcon;
	
	public void checkBoxChecked() {
		checkBoxM.click();
		System.out.println("M checkbox is checked");
	}
	
	public void selectSortByDropDown() {
		Select selectSortBy = new Select(sortByDropDown);
		selectSortBy.selectByIndex(1);
	}
	public void clickOnAddtoCartButton() {
		addToCartButton.click();
	}
	public void clickOnProceedtoChkoutButton() {
		ProceedtoChkoutButton.click();
	}
	public void hoverOnImageIcon() {
		Actions mouseACtions = new Actions(driver);
		mouseACtions.moveToElement(sortByDropDown).build().perform();
		mouseACtions.moveToElement(ImageIcon).build().perform();
	}

}
