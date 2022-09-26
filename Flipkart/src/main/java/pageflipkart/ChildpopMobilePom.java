package pageflipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildpopMobilePom {
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addTocart;
	
	@FindBy (xpath="//input[@class='_36yFo0']")
	private WebElement locationPin;
	
	@FindBy (xpath="//span[@class='_2P_LDn']")
	private WebElement checkButton;
	
	@FindBy (xpath="//span[text()='Know More']")
	private WebElement knowmoreButton;
	
	
	public ChildpopMobilePom(WebDriver driver) 
    {
		PageFactory.initElements(driver, this);
	}


	
	public void checkLocPin()
	{
		locationPin.sendKeys("416507");
	}

	public void clickCheck()
	{
		checkButton.click();
	}
	
	public void clickOnKnowmore()
	{
	knowmoreButton.click();	
	}
	
	
	
	
	

}
