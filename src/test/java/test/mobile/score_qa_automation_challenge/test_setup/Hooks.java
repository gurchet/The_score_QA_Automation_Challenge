package test.mobile.score_qa_automation_challenge.test_setup;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import test.mobile.score_qa_automation_challenge.base.AppiumService;
import test.mobile.score_qa_automation_challenge.base.DriverManager;
import java.io.IOException;


/**
 * @author gurchet.singh
 * @since 18 March 2023
 * @description This
 */
public class Hooks {

    @BeforeAll
    public static void setUp(){
        try {
            AppiumService.startAppiumDriverService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public static void cleanUpAfterTestScenario(Scenario scenario){
        DriverManager.quitCurrentDriver();
    }

    @AfterAll
    public static void cleanUp(){
        try {
            AppiumService.stopAppiumDriverService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
