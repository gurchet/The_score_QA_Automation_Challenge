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

public class League_BusinessFlow {

	public void verifyIfTheScreenIsLeagueSelectionScreen() {
		Leagues league = (Leagues) PageObjectProvider.getPageObject("Leagues");
		Assert.assertEquals("choose your favorite leagues", league.getScreenTitle());
	}

	public void verifyTheLeaguesSelection(String[] leaguesArray) {
		Leagues leaguesPageObject = (Leagues) PageObjectProvider.getPageObject("Leagues");
		for (String league : leaguesArray) {
			leaguesPageObject.selectLeague(league);
			Assert.assertTrue(leaguesPageObject.isLeagueSelected(league));
		}
		Assert.assertEquals(leaguesArray.length, leaguesPageObject.getTotalLeaguesSelected());
	}


	public void goToTeamsSelectionPage() {
		Leagues leaguesPageObject = (Leagues) PageObjectProvider.getPageObject("Leagues");
		leaguesPageObject.continueNext();
	}
}