package test.mobile.score_qa_automation_challenge.page_objects.common;

public abstract class Teams extends BasePage{

    public abstract String getScreenTitle();

    public abstract void selectTab(String leagueCode);

    public abstract void selectTeam(String teamName);

    public abstract boolean isTeamSelected(String teamName);

    public abstract int getTotalTeamSelected();

    public abstract void continueNext();

}
