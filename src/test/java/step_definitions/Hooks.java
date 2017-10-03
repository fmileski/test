package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public static WebDriver driver;

    
    @Before
    public void openBrowser() throws MalformedURLException {
        //Before starting each test (if we had multiple) this would clear up
        //cookies to avoid data contamination
    	System.out.println("Called openBrowser");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

     
    @After
    public void embedScreenshot(Scenario scenario) {

        //Test teardown if failed
        //Will embed screenshot if failed.
        //It is mostly used this way to save resources as files can get quite big
        //If we embed screenshot from all steps.
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }
    
}

