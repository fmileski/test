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

public class ClickJoinLink {

    public static void Execute(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Waiting until the button is clickable
        WebElement joinLink = wait.until(ExpectedConditions.elementToBeClickable(MainPage.join_link));
        joinLink.click();
        //For some reason (at least in my computer) even when the element is clickable,
        //I've notice a stutter on the page that keeps us from clicking the button,
        //so I've added a waiter so it will wait until the javascript has finished
        wait.until( new Predicate<WebDriver>() {
                        public boolean apply(WebDriver driver) {
                            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                        }
                    }
        );

    }
}
