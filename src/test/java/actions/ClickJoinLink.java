package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.MainPage;

public class ClickJoinLink {

    public static void Execute(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Waiting until the button is clickable
        WebElement joinLink = wait.until(ExpectedConditions.elementToBeClickable(MainPage.join_link));
        joinLink.click();
    }
}
