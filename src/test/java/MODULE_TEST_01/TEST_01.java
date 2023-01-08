package MODULE_TEST_01;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraryfiles.Invokkbrowser;
import Libraryfiles.Utilitiesinclass;
import MODULE_01.POM_01;
import MODULE_01.POM_02;

public class TEST_01 extends Invokkbrowser
{
	POM_01 PM1;
	POM_02 PM2;
	
@BeforeMethod
	public void TC_01() throws IOException 
    {
	int TCID;
	openbrowser("Chrome");
	PM1 = new POM_01(driver);
	PM2 = new POM_02(driver);		
	}
  @Test
 public void TC_02() throws InterruptedException 
    {
   int TCID = 01;
	PM1.ACTION(); 
    PM2.getwindowhandles(1);  
	PM2.insertfield();	
	
    }
  
  @AfterMethod
  public void TC_03() throws IOException
  {
	  Utilitiesinclass.captureSS(driver, 01);
   driver.close();
   PM2.getwindowhandles(0);
  }
  
}

