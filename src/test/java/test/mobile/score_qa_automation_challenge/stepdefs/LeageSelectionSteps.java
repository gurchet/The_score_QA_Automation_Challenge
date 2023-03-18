package test.mobile.score_qa_automation_challenge.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import test.mobile.score_qa_automation_challenge.business_layer.Home_BusinessFlow;
import test.mobile.score_qa_automation_challenge.business_layer.League_BusinessFlow;

import java.util.List;

/**
 * @author gurchet.singh
 * @since 15 March 2023
 * Description : This class stores the test steps
 */

public class LeageSelectionSteps {

    @Given("User is at home screen")
    public void makeSureIfUserIsAtHomeScreen() {
        new Home_BusinessFlow().verifyIfTheScreenIsHomeScreen();
    }


    @When("User goes to league selection page")
    public void goToLeagueSelection() {
        new Home_BusinessFlow().goToLeageSelectionPage();
    }

    @Then("League selection page should get opened")
    public void verifyIfLeaguePageOpened(){
        new League_BusinessFlow().verifyIfTheScreenIsLeagueSelectionScreen();
    }

    @Then("User should be able to select the league {string}")
    public void selectLeague(String league) {
        new League_BusinessFlow().verifyTheLeaguesSelection(league.split(","));
    }

    @Then("User goes to the Teams selection page")
    public void goToTeamsSelectionPage() {
        new League_BusinessFlow().goToTeamsSelectionPage();
    }

    @When("User goes to back to the previous page from league page")
    public void goToPreviousPage() {
        new League_BusinessFlow().navigateToPreviousScreen();
    }

}
