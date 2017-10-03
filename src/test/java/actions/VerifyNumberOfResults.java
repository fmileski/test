package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;


public class VerifyNumberOfResults {

    public static void Execute(WebDriver driver, int expected) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement firstItemOfList = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/span/div[3]/div/section[2]/article[2]/div/div[2]/div/ul/li[1]/a")));

        int resultsCount = driver.findElements(By.xpath("html/body/span/div[3]/div/section[2]/article[2]/div/div[2]/div/ul/li/a")).size();
        assertEquals(expected, resultsCount);
    }
}
