package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickLocation {

    public static void Execute(WebDriver driver, String location) throws Exception {
        //Here I use a stringbuilder to build the xpath with the given location
        StringBuilder sb = new StringBuilder();
        //Concatenate the first parth of the xpath
        sb.append("html/body/span/div[3]/div/section[2]/article[1]/div[2]/ul/li/label[text()='");
        //With the argument
        sb.append(location);
        //And the closing
        sb.append("']");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        //Then wait until the combo is rendered and click the option
        WebElement locationCombo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sb.toString())));
        locationCombo.click();

    }
}
