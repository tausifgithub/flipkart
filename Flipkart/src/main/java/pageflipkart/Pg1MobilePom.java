package pageflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg1MobilePom {
	@FindBy (xpath="//img[@title='Flipkart']")
	private WebElement homeButton;
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closelogIn;
	
	@FindBy (xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement searchFeild;
	
	@FindBy (xpath="//button[@class='L0Z3Pu']")
	private WebElement searchlogo;
	
	@FindBy (xpath="//div[text()='OnePlus Nord 2T 5G (Gray Shadow, 256 GB)']")
	private WebElement nordmobile;
	
	

public Pg1MobilePom(WebDriver driver) 
    {
		PageFactory.initElements(driver, this);
	}


public void clickonCrossicon()
{
	closelogIn.click();
}
	

public void entermobileInSearchField()
{
	searchFeild.sendKeys("one plus nord");
}
	
public void clicksearchLogo()
{
	searchlogo.click();
}

public void nordMobile()
{
	nordmobile.click();
}

public void clickHomebutton()
{
	homeButton.click();
}







}
