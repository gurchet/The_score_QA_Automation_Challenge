package test.mobile.score_qa_automation_challenge.test_setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import test.mobile.score_qa_automation_challenge.utilities.PropertiesUtils;

public class Hooks {

    @Before
    public void setUp(){
        PropertiesUtils.putAll(System.getProperties());
    }

    @After
    public void cleanUp(){
    }
}
