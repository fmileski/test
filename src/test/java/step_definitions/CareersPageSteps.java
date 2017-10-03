package step_definitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import actions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CareersPage;

public class CareersPageSteps {


    public WebDriver driver;
    public CareersPageSteps() {
        driver = Hooks.driver;
    }

    @When("^I expand the location combo$")
    public void i_expand_the_location_combo() throws Throwable {
        PageFactory.initElements(driver, CareersPage.class);
        ExpandLocationsCombo.Execute(driver);
    }

    @When("^I select \"(.*?)\"$")
    public void i_select(String location) throws Throwable {
        ClickLocation.Execute(driver, location);
    }

    @Then("^the list must contain (\\d+) results$")
    public void the_list_must_contain_results(int numberOfResults) throws Throwable {

        VerifyNumberOfResults.Execute(driver, numberOfResults);

    }
    @Then("^the list must contain at least (\\d+) results$")
    public void the_list_must_contain_at_lease_results(int numberOfResults) throws Throwable {
        VerifyMinimumNumberOfResults.Execute(driver, numberOfResults);
    }

    @Then("^I click the position \"(.*?)\"$")
    public void i_click_the_position(String title) throws Throwable {
        ClickOffer.Execute(driver, title);
    }

    @Then("^the qualification \"(.*?)\" should exist$")
    public void the_qualification_should_exist(String qualification) throws Throwable {
        VerifyQualificationExist.Execute(driver, qualification);
    }
}
