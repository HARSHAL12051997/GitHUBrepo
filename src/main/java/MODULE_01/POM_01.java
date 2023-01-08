package MODULE_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_01 {
@FindBy(xpath="(//span[@class=\"dropdown-toggle tb-megamenu-no-link\"])[2]")private WebElement Marketing;	
@FindBy(xpath="//li[@data-label=\"Buy SAIL steel\"]")private WebElement Buysailsteel;
	 WebDriver driver1;
	Actions act;
	public POM_01(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	public void ACTION() {
		act = new Actions(driver1);
		act.moveToElement(Marketing).perform();
		act.moveToElement(Buysailsteel).click().perform();
	}
	
    }
