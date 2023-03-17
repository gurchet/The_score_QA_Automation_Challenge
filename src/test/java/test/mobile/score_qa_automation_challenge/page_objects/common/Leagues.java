package test.mobile.score_qa_automation_challenge.page_objects.common;

public abstract class Leagues extends BasePage {

    public abstract String getScreenTitle();

    public abstract void selectLeague(String leagueName);

    public abstract boolean isLeagueSelected(String leagueName);

    public abstract int getTotalLeaguesSelected();

    public abstract void continueNext();

}
