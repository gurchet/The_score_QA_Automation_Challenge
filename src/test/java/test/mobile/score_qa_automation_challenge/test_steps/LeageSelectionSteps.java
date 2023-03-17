package test.mobile.score_qa_automation_challenge.test_steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import test.mobile.score_qa_automation_challenge.business_layer.LeagueSelection;

import java.util.List;

/**
 * @author gurchet.singh
 * @since 15 March 2023
 * Description : This class stores the test steps
 */

public class LeageSelectionSteps {
    @Given("User is at home screen")
    public void makeSureIfUserIsAtHomeScreen() {
        new LeagueSelection().verifyIfTheScreenIsHomeScreen();
    }


    @When("User goes to league selection page")
    public void goToLeagueSelection() {
        new LeagueSelection().goToLeageSelectionPage();
    }


    @Then("User verifies if following leagues are selected")
    public void selectLeague(DataTable leagueCodes) {
        //conversion of Datatable to list
        List<String> leagues = leagueCodes.row(0);
        String[] leaguesArray = new String[leagues.size()];
        int i = 0;
        for(String league : leagueCodes.row(0)){
            leaguesArray[i++] = league;
        }
        new LeagueSelection().verifyTheLeaguesSelection(leaguesArray);
    }

    @Then("User goes to the Teams selection page")
    public void goToTeamsSelectionPage() {
        new LeagueSelection().goToTeamsSelectionPage();
    }
}
