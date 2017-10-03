package actions;

/**
 * Created by fernando on 03/10/2017.
 */
import com.google.common.base.Predicate;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.MainPage;

public class ExpandMainMenu {

    public static void Execute(WebDriver driver) throws Exception {
        MainPage.main_menu.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( new Predicate<WebDriver>() {
                        public boolean apply(WebDriver driver) {
                            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                        }
                    }
        );
    }
}
