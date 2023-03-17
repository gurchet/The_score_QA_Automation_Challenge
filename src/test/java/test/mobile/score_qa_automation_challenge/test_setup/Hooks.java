package test.mobile.score_qa_automation_challenge.test_setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

public class Hooks {

    @BeforeTest
    public void setUp(){
        PropertiesUtils.putAll(System.getProperties());
    }

    @AfterTest
    public void cleanUp(){
    }
}
