package Libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utilitiesinclass {

	//method 1
//this method is used to call the key present inside the properties class
//	this method will return the string value and string key is passed to it
	// Author = HARSHAL NAWKAR
	public static String readvaluefromPF(String key) throws IOException 
	{
	 FileInputStream File= new FileInputStream("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\TESTNG\\src\\SAIL\\SAIL.properties");
	Properties p = new Properties();
      	p.load(File);
  	
		String value =p.getProperty(key);
		return value;		
	}
	
	//method 2
	//this method is used to capture screenshot which accept two arguments
	//webdriver driver and Test case id
	// author name = Harshal Nawkar
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destiny = new File("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\30july_maven1\\FAILED_TC_SS\\TestcaseID"+TCID+".jpg");
		FileHandler.copy(src, Destiny);
	}
	
	//Method 3
	//this method is used to fetch data from the excel sheet
	//Author = Harshal Nawkar
	public static String Fetchdatafromexcellsheet(int row,int cell, String sheetname) throws EncryptedDocumentException, IOException 
	{
		FileInputStream File = new FileInputStream("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\30july_maven1\\TESTDATA\\practiceexcel.xlsx");
		String value = WorkbookFactory.create(File).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	} 	
}
