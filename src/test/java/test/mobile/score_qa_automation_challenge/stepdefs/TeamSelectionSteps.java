package test.mobile.score_qa_automation_challenge.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.mobile.score_qa_automation_challenge.business_layer.Team_BusinessFlow;

import java.util.Arrays;

public class TeamSelectionSteps {

    @Then("Team selection page should get opened")
    public void verifyIfTeamsPageOpened(){
        new Team_BusinessFlow().verifyIfTheScreenIsTeamSelectionScreen();
    }

    @When("User selects the tab {string}")
    public void selectTabInTeams(String tabName){
        new Team_BusinessFlow().selectTab(tabName);
    }

    @Then("User should be able to select the teams {string}")
    public void selectTeam(String teamName){
        new Team_BusinessFlow().selectTeam(teamName.split(","));
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


    @When("User goes to notification settings page")
    public void goToNotificationSettingsPage(){
        new Team_BusinessFlow().goToNotificationSettingsPage();
    }

}
