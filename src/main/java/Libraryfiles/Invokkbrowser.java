package Libraryfiles;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

public class Invokkbrowser {
	public WebDriver driver;

@Parameters("Webbrowser")
public void openbrowser(String Webbrowser) throws IOException {
	if(Webbrowser.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\TESTNG\\Browser\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	 else if(Webbrowser.equals("Edge")) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\TESTNG\\Browser\\msedgedriver.exe");
		 driver = new EdgeDriver();	
	}
	
	driver.get(Utilitiesinclass.readvaluefromPF("URL"));
	driver.manage().window().maximize();
	}	
}
