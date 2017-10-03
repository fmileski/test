package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import com.google.common.base.Predicate;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.MainPage;



public class ClickExploreCareers {

    public static void Execute(WebDriver driver) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Waiting until the button is clickable
        WebElement ExploreCareers = wait.until(ExpectedConditions.elementToBeClickable(MainPage.explore_careers_button));

        //Sorry about the 1 second sleep. For some reason the javascript is
        //with a complete state but the page is still scrolling.

        Thread.sleep(1000);
        ExploreCareers.click();

    }
}
