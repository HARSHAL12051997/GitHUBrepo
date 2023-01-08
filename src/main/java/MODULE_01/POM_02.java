package MODULE_01;

import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_02 {	
 	WebDriver driver1;
	Select fc;
	Select sc;
	Set<String> gwh;
	ArrayList<String> al1;
@FindBy(xpath="//input[@placeholder=\"Enter your name....\"]") private WebElement	WEBNAME;
@FindBy(xpath="//input[@placeholder=\"Enter email id.....\"]") private WebElement	EMAILID;
@FindBy(xpath="//input[@placeholder=\"Enter mobile number....\"]") private WebElement	MOBILENO;
@FindBy(xpath="//textarea[@placeholder=\"Enter company name & address.....\"]") private WebElement ADDRESS;
@FindBy(xpath="(//select[@class=\"form-control txt-inp\"])[1]") private WebElement STB1;
@FindBy(xpath="(//select[@class=\"form-control txt-inp\"])[2]") private WebElement STB2;
@FindBy(xpath="//input[@name=\"zreq\"]") private WebElement GRADE;
@FindBy(xpath="(//textarea[@class=\"form-control txt-inp\"])[2]") private WebElement QUANTITY;
	

public POM_02(WebDriver driver) 
{
	PageFactory.initElements(driver,this);	
	driver1=driver;
}


public void getwindowhandles(int value)
{
	Set<String> allwindow = driver1.getWindowHandles();
	 al1 = new ArrayList<String>(allwindow);
	driver1.switchTo().window((String) al1.get(value));
	}

public void insertfield() throws InterruptedException {
	Thread.sleep(5000);
	WEBNAME.sendKeys("HARSHAL");
	EMAILID.sendKeys("harshal.nawkar@gmail.com");
	MOBILENO.sendKeys("72762582777");
	ADDRESS.sendKeys("RUNPISE NAGAR AKOLA");
	fc = new Select(STB1);
	fc.selectByVisibleText("PUNE");
	sc = new Select(STB2);
	sc.selectByVisibleText("PIPES");
	GRADE.sendKeys("A");
	QUANTITY.sendKeys("40TONNES");	
}
}
