package test.mobile.score_qa_automation_challenge.page_objects.android;

import org.openqa.selenium.By;
import test.mobile.score_qa_automation_challenge.page_objects.common.Teams;

import java.util.concurrent.TimeUnit;

public class Android_Teams extends Teams {

    By titleText = By.id("com.fivemobile.thescore:id/title_onboarding");
    By chipsElements = By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.view.ViewGroup");

    By btnContinue = By.xpath("//*[@text='Continue']");

    public Android_Teams(){
        super();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Override
    public String getScreenTitle() {
        return getText(titleText);
    }

    @Override
    public void selectTab(String leagueCode) {
        click(By.xpath("//android.widget.HorizontalScrollView[@id,'com.fivemobile.thescore:id/tabLayout']//android.widget.LinearLayout[@content-desc='"+leagueCode+"']"));
    }

    @Override
    public void selectTeam(String teamName) {
        click(By.xpath("//android.widget.TextView[contains(@text,'"+teamName+"')]"));
    }

    @Override
    public boolean isTeamSelected(String teamName) {
        return isElementPresent(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/chips_container']//android.widget.TextView[contains(@text,'"+teamName+"')]"));
    }

    @Override
    public int getTotalTeamSelected() {
        return getTotalMatchedNoOfElements(chipsElements) - 1;
    }

    @Override
    public void continueNext() {
        click(btnContinue);
    }
}
