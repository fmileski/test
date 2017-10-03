package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BaseClass{
	
	public MainPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.CLASS_NAME, using="INF-mainMenu_trigger_icon")
	public static WebElement main_menu;

	
	@FindBy(how=How.LINK_TEXT, using="Join")
	public static WebElement join_link;

	@FindBy(how=How.XPATH, using="html/body/span/div[7]/section/section/div[1]/div[5]/div/p[1]/span/span/a")
	public static WebElement explore_careers_button;
}
