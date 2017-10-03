package actions;

/**
 * Created by fernando on 03/10/2017.
 */
import org.openqa.selenium.WebDriver;
import pageobjects.MainPage;

public class ExpandMainMenu {

    public static void Execute(WebDriver driver) throws Exception {
        MainPage.main_menu.click();
    }
}
