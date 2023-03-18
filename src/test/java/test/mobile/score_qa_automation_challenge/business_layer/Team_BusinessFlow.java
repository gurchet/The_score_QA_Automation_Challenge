package test.mobile.score_qa_automation_challenge.business_layer;

import org.json.simple.JSONObject;
import org.junit.Assert;
import test.mobile.score_qa_automation_challenge.page_objects.PageObjectFactory.PageObjectProvider;
import test.mobile.score_qa_automation_challenge.page_objects.common.Alerts;
import test.mobile.score_qa_automation_challenge.page_objects.common.Dashboard;
import test.mobile.score_qa_automation_challenge.page_objects.common.Teams;
import test.mobile.score_qa_automation_challenge.utilities.JSONUtils;

public class Team_BusinessFlow {

    public void verifyIfTheScreenIsTeamSelectionScreen() {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        Assert.assertEquals("Choose your favorite teams", teams.getScreenTitle());
    }

    public void selectTab(String tabName){
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        teams.selectTab(tabName);
    }

    public void selectTeam(String[] teamCodes, String league){
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        for(String teamCode : teamCodes){
            teams.selectTeam((String)((JSONObject)JSONUtils.getLeaguesObject(league).get("teams")).get(teamCode));
        }
    }

    public void verifyTheTeamsSelection(String[] teamNames) {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        Assert.assertEquals(teamNames.length, teams.getTotalTeamSelected());
    }

    public void goToAlertsSettingsPage() {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        teams.continueNext();
    }

    public void verifyIfTheScreenIsAlertsSettingsScreen() {
        Alerts alerts = (Alerts) PageObjectProvider.getPageObject("Alerts");
        Assert.assertEquals("Never miss a game", alerts.getScreenTitle());
    }

    public void makeItDone() {
        Alerts alerts = (Alerts) PageObjectProvider.getPageObject("Alerts");
        alerts.makeItDone();
    }

    public void verifyIfTheScreenIsDashboardScreen() {
        Dashboard dashboard = (Dashboard) PageObjectProvider.getPageObject("Dashboard");
        Assert.assertTrue(dashboard.isDashboardScreen());
    }

    public void verifyIfSelectedTeamsAvailableInDashboard(String[] teams) {
        Dashboard dashboard = (Dashboard) PageObjectProvider.getPageObject("Dashboard");
        for(String team : teams){
            Assert.assertTrue(dashboard.isChosenTeamDisplayed(team.trim()));
        }
    }

    public void navigateToPreviousScreen(){
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        teams.navigateBack();
    }

    }
