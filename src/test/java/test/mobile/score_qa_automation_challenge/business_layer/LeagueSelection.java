package test.mobile.score_qa_automation_challenge.business_layer;

import test.mobile.score_qa_automation_challenge.page_objects.PageObjectFactory.PageObjectProvider;
import test.mobile.score_qa_automation_challenge.page_objects.common.Dashboard;

/**
 * @author gurchet.singh
 * @since 15 March 2023 
 * Description : This class is a business layer(A generic
 *        platform script to perform sequence actions)
 */

public class LeagueSelection {

	public void goToLeageSelectionPage() {
		Dashboard dashboard = (Dashboard)PageObjectProvider.getPageObject("Dashboard");
		dashboard.goToLeagueSelectionPage();
	}
	
}
