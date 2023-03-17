package test.mobile.score_qa_automation_challenge.page_objects.android;
import org.openqa.selenium.By;
import test.mobile.score_qa_automation_challenge.page_objects.common.Home;

public class Android_Home extends Home {

	By continueButton = By.id("com.fivemobile.thescore:id/action_button_text");

	@Override
	public void goToLeagueSelectionPage() {
		click(continueButton);
	}

	@Override
	public boolean isHomeScreen() {
		return isElementPresent(continueButton);
	}

}
