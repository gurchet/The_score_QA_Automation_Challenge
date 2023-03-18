package test.mobile.score_qa_automation_challenge.page_objects.android;

import org.openqa.selenium.By;
import test.mobile.score_qa_automation_challenge.page_objects.common.Alerts;

public class Android_Alerts extends Alerts {

    By titleText = By.id("com.fivemobile.thescore:id/title_onboarding");
    By btnDone = By.xpath("//*[@text='Done']");

    By popupDismissButton = By.id("com.fivemobile.thescore:id/dismiss_modal");

    @Override
    public String getScreenTitle() {
        return getText(titleText);
    }

    @Override
    public void makeItDone() {
        click(btnDone);
        handleAppDownloadPopUp();
    }

    public void handleAppDownloadPopUp(){
        if(isElementPresent(popupDismissButton)){
            click(popupDismissButton);
        }
    }
}
