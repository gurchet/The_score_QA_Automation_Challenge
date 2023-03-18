package test.mobile.score_qa_automation_challenge.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.mobile.score_qa_automation_challenge.business_layer.League_BusinessFlow;
import test.mobile.score_qa_automation_challenge.business_layer.Team_BusinessFlow;

public class TeamSelectionSteps {

    @Then("Team selection page should get opened")
    public void verifyIfTeamsPageOpened(){
        new Team_BusinessFlow().verifyIfTheScreenIsTeamSelectionScreen();
    }

    @When("User selects the tab {string}")
    public void selectTabInTeams(String tabName){
        new Team_BusinessFlow().selectTab(tabName);
    }

    @Then("User should be able to select the teams {string} for {string}")
    public void selectTeam(String teamCodes, String league){
        new Team_BusinessFlow().selectTeam(teamCodes.split(","), league);
    }

    @Then("User should be able to see the selected {string} and {string}")
    public void verificationOfTeamLeaguesSelections(String leagues, String teams){
        String[] teamsArray = teams.split(",");
        String[] leaguesArray = leagues.split(",");
        String[] allLeaguesAndTeams = new String[teamsArray.length + leaguesArray.length];
        System.arraycopy(teamsArray, 0, allLeaguesAndTeams, 0, teamsArray.length);
        System.arraycopy(leaguesArray, 0, allLeaguesAndTeams, teamsArray.length, leaguesArray.length);
        new Team_BusinessFlow().verifyTheTeamsSelection(allLeaguesAndTeams);
    }


    @When("User goes to alerts settings page")
    public void goToAlertsSettingsPage(){
        new Team_BusinessFlow().goToAlertsSettingsPage();
    }

    @Then("Alerts settings page should get opened")
    public void verifyIfAlertsPageOpened(){
        new Team_BusinessFlow().verifyIfTheScreenIsAlertsSettingsScreen();
    }

    @When("User continue from alerts settings screen")
    public void continueFromAlertsSettings(){
        new Team_BusinessFlow().makeItDone();
    }

    @Then("Dashboard page should get opened")
    public void checkIfDashboardOpened(){
        new Team_BusinessFlow().verifyIfTheScreenIsDashboardScreen();
    }

    @And("User should be able to see the selected {string}")
    public void checkIfAllSelectedTeamsAvailable(String teams){
        new Team_BusinessFlow().verifyIfSelectedTeamsAvailableInDashboard(teams.split(","));
    }

    @When("User goes to back to the previous page from team page")
    public void goToPreviousPage() {
        new Team_BusinessFlow().navigateToPreviousScreen();
    }
}
