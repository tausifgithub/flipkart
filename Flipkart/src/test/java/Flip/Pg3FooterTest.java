package Flip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageflipkart.Pg3Footerpom;
import pageflipkart.Pg1MobilePom;

public class Pg3FooterTest {
	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.flipkart.com/");
		
Pg1MobilePom mobilepom=new Pg1MobilePom(driver);
mobilepom.clickonCrossicon();
Pg3Footerpom footerpom =new Pg3Footerpom (driver);
footerpom.clickAboutUs();
Thread.sleep(3000);
footerpom.clickCareer();
Thread.sleep(5000);
footerpom.scrollcandidatelogin(null);


}
}