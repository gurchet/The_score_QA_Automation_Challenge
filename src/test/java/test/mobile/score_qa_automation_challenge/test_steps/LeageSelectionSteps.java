package test.mobile.score_qa_automation_challenge.test_steps;


import io.cucumber.java.en.Given;
import org.junit.Assert;
import test.mobile.score_qa_automation_challenge.business_layer.LeagueSelection;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

/**
 * @author gurchet.singh
 * @since 15 March 2023 
 * Description : This class stores the test steps
 */

public class LeageSelectionSteps {
    @Given("User goes to league page")
    public void navigateToLeaguePage() {
        Assert.assertTrue(true);
        System.out.println("platform : "+PropertiesUtils.get("platform"));
        new LeagueSelection().goToLeageSelectionPage();
    }
}
