package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenShot(WebDriver driver, int testcaseID) throws IOException
	{
		Date date=new Date();
		String currenttime=date.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot s=(TakesScreenshot) driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\selenium project\\failTestcases\\Test-"+testcaseID+"-"+currenttime+".jpeg");
		try
		{
		FileHandler.copy(src, dest);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	  

	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Tausif\\Desktop\\demo.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
				
		return value;
	}
	

}
