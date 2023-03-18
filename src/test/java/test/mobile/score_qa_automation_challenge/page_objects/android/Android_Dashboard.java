package test.mobile.score_qa_automation_challenge.page_objects.android;

import org.openqa.selenium.By;
import test.mobile.score_qa_automation_challenge.page_objects.common.Dashboard;

public class Android_Dashboard extends Dashboard {

    By imgProfile = By.className("android.widget.ImageButton");

    @Override
    public boolean isDashboardScreen() {
        return isElementPresent(imgProfile);
    }

    @Override
    public boolean isChosenTeamDisplayed(String team) {
        return isElementPresent(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.widget.TextView[@text='"+team+"']"));
    }
}
