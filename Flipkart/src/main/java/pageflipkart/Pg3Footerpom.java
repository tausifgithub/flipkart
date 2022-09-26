package pageflipkart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg3Footerpom {
	@FindBy (xpath="//a[text()='About Us']")
    private WebElement aboutUs;
	
	@FindBy (xpath="//a[text()='Careers']")
    private WebElement career;
	
	@FindBy (xpath="//a[text()='Home']")
    private WebElement home;
	
	@FindBy (xpath="//a[text()='Flipkart Stories']")
    private WebElement fkStories;
	
	@FindBy (xpath="(//a[text()='Candidate Login'])[2]")
    private WebElement candidateLogin;
	
	
	
	public Pg3Footerpom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAboutUs() {
		aboutUs.click();
	}
	
	public void clickCareer() {
		career.click();
	}
	public void homeButton() {
		home.click();
	}
	
	
	public void clickFkstories() {
		fkStories.click();
	}
	
	
	
		public void scrollcandidatelogin(JavascriptExecutor driver) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",candidateLogin );
			
		}
	
	
	
	
	
	
}
