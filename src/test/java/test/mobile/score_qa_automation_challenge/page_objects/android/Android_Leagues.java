package test.mobile.score_qa_automation_challenge.page_objects.android;

import org.openqa.selenium.By;
import test.mobile.score_qa_automation_challenge.page_objects.common.Leagues;

public class Android_Leagues extends Leagues {

    @Override
    public void selectLeague(String leagueCode) {
        click(By.xpath("//android.widget.TextView[contains(@text,'"+leagueCode+"')]"));
    }

    @Override
    public boolean isLeagueSelected(String leagueCode) {
        return isElementPresent(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.widget.TextView[contains(@text,'"+leagueCode+"')]"));
    }

    @Override
    public int getTotalLeaguesSelected() {
        return getTotalMatchedNoOfElements(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.view.ViewGroup")) - 1;
    }

    @Override
    public void continueNext() {
        click(By.xpath("//*[@text='Continue']"));
        handleLocationPopUp();
    }

    public void handleLocationPopUp(){
        waitAndSoftClick(By.id("com.fivemobile.thescore:id/btn_allow"));
        waitAndSoftClick(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    }

}
