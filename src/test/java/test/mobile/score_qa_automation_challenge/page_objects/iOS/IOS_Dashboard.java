package test.mobile.score_qa_automation_challenge.page_objects.iOS;

import test.mobile.score_qa_automation_challenge.page_objects.common.Dashboard;

public class IOS_Dashboard extends Dashboard {
    @Override
    public boolean isDashboardScreen() {
        return false;
    }

    @Override
    public boolean isChosenTeamDisplayed(String team) {
        return false;
    }
}
