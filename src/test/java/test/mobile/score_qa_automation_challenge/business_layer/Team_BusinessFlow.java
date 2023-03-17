package test.mobile.score_qa_automation_challenge.business_layer;

import org.junit.Assert;
import test.mobile.score_qa_automation_challenge.page_objects.PageObjectFactory.PageObjectProvider;
import test.mobile.score_qa_automation_challenge.page_objects.common.Leagues;
import test.mobile.score_qa_automation_challenge.page_objects.common.Teams;

public class Team_BusinessFlow {

    public void verifyIfTheScreenIsTeamSelectionScreen() {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        Assert.assertEquals("Choose your favorite teams", teams.getScreenTitle());
    }

    public void selectTab(String tabName){
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        teams.selectTab(tabName);
    }

    public void selectTeam(String[] teamNames){
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        for(String teamName : teamNames){
            teams.selectTeam(teamName.trim());
        }
    }

    public void verifyTheTeamsSelection(String[] teamNames) {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        Assert.assertEquals(teamNames.length, teams.getTotalTeamSelected());
    }

    public void goToNotificationSettingsPage() {
        Teams teams = (Teams) PageObjectProvider.getPageObject("Teams");
        teams.continueNext();
    }

    }
