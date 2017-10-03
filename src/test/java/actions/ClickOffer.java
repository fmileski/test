package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOffer {

    public static void Execute(WebDriver driver, String title) throws Exception {
        StringBuilder sb = new StringBuilder();
        //As in ClickLocation.Execute(), I build the xpath to click in dinamic elements
        sb.append("html/body/span/div[3]/div/section[2]/article[2]/div/div[2]/div/ul/li/a[text()='");
        sb.append(title);
        sb.append("']");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement positionTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sb.toString())));
        positionTitle.click();
        wait.until( new Predicate<WebDriver>() {
                        public boolean apply(WebDriver driver) {
                            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                        }
                    }
        );
    }
}
