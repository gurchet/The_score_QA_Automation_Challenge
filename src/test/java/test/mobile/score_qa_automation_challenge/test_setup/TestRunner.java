package test.mobile.score_qa_automation_challenge.test_setup;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json",
        "html:target/cucumber"},
        features = "src/test/resources/features/SanityTestScenarios.feature",
        glue = {"classpath:test.mobile.score_qa_automation_challenge.test_setup.Hooks", "classpath:test.mobile.score_qa_automation_challenge.stepdefs"},
        tags = "@SanityTests")
public class TestRunner {
}
