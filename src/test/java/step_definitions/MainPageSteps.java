package step_definitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import actions.ClickExploreCareers;
import actions.ClickJoinLink;
import actions.ExpandMainMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.MainPage;

public class MainPageSteps {


    public WebDriver driver;
    public MainPageSteps() {
        driver = Hooks.driver;
    }

    @Then("^I open infusion website$")
    public void i_open_infusion_wubsite() throws Throwable {
        driver.get("https://www.infusion.com/");
    }
    @And("^I expand the main menu$")
    public void i_expand_main_menu() throws Throwable {
        PageFactory.initElements(driver, MainPage.class);
        ExpandMainMenu.Execute(driver);

    }

    @And("^I click Join$")
    public void i_click_join() throws Throwable {
        PageFactory.initElements(driver, MainPage.class);
        ClickJoinLink.Execute(driver);
    }
    @And("^I click Explore Careers$")
    public void i_click_explore_careers() throws Throwable {
        PageFactory.initElements(driver, MainPage.class);
        ClickExploreCareers.Execute(driver);
    }


}
