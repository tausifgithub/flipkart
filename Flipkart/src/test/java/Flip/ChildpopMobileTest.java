package Flip;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageflipkart.ChildpopMobilePom;
import pageflipkart.Pg1MobilePom;

public class ChildpopMobileTest {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.flipkart.com/");
		
Pg1MobilePom mobilepom=new Pg1MobilePom(driver);
		mobilepom.clickonCrossicon();
		System.out.println(driver.getCurrentUrl());
		mobilepom.entermobileInSearchField();
		mobilepom.clicksearchLogo();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		mobilepom.nordMobile();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		ChildpopMobilePom  ChildpopMobilePom =new ChildpopMobilePom (driver);
		
ArrayList<String> childpop=new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(childpop.get(1));
		Thread.sleep(3000);
		ChildpopMobilePom.clickOnKnowmore();
//		childpopMobilePom.checkLocPin();
//		Thread.sleep(3000);
//		childpopMobilePom.clickCheck();
//		Thread.sleep(8000);
		//seller is changed so new popup comming
		







}
}