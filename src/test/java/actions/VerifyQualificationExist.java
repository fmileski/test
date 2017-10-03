package actions;

/**
 * Created by fernando on 03/10/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;


public class VerifyQualificationExist {

    public static void Execute(WebDriver driver, String expected) throws Exception {
        StringBuilder sb = new StringBuilder();
        //Here I also build the xpath. This xpath receives a dinamic text and it will only searche
        //for this criteris within the Qualifications table
        sb.append("html/body/span/div[3]/div/section[3]/div[2]/div/article/div[2]/ul/li/span[text()='");
        sb.append(expected);
        sb.append("']");


        int resultsCount = driver.findElements(By.xpath(sb.toString())).size();
        assertEquals(1, resultsCount);
    }
}
