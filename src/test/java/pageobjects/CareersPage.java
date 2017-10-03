package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CareersPage extends BaseClass{

	public CareersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="html/body/span/div[3]/div/section[2]/article[1]/div[2]/div")
	public static WebElement locations_combo;

}
