package Flip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
			driver.get("https://www.amazon.in");
			
		
	}

}
