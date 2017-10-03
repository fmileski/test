package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CareersPage;

public class ExpandLocationsCombo {

    public static void Execute(WebDriver driver) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Wait for the element to be rendered and clickable
        WebElement LocationsCombo = wait.until(ExpectedConditions.elementToBeClickable(CareersPage.locations_combo));
        LocationsCombo.click();
    }
}
