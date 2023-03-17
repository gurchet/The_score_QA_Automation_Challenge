package test.mobile.score_qa_automation_challenge.business_layer;

import org.junit.Assert;
import test.mobile.score_qa_automation_challenge.page_objects.PageObjectFactory.PageObjectProvider;
import test.mobile.score_qa_automation_challenge.page_objects.common.Home;
import test.mobile.score_qa_automation_challenge.page_objects.common.Leagues;

/**
 * @author gurchet.singh
 * @since 15 March 2023 
 * Description : This class is a business layer(A generic
 *        platform script to perform sequence actions)
 */

public class Home_BusinessFlow {

	public void verifyIfTheScreenIsHomeScreen() {
		Home home = (Home) PageObjectProvider.getPageObject("Home");
		Assert.assertTrue(home.isHomeScreen());
	}

	public void goToLeageSelectionPage() {
		Home homePageObject = (Home) PageObjectProvider.getPageObject("Home");
		homePageObject.goToLeagueSelectionPage();
	}

}