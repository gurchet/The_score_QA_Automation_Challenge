package test.mobile.score_qa_automation_challenge.page_objects.iOS;

import test.mobile.score_qa_automation_challenge.page_objects.common.Leagues;

public class IOS_Leagues extends Leagues {

    @Override
    public String getScreenTitle() {
        return null;
    }

    @Override
    public void selectLeague(String leagueName) {

    }

    @Override
    public boolean isLeagueSelected(String leagueName) {
        return false;
    }

    @Override
    public int getTotalLeaguesSelected() {
        return 0;
    }

    @Override
    public void continueNext() {

    }
}
