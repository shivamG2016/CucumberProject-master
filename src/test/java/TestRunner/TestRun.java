package TestRunner;

import org.junit.runner.RunWith;
import  cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue ="stepDefinitions",
        dryRun = false,
        plugin = {"pretty",
        "html:test-output"}
)
public class TestRun extends AbstractTestNGCucumberTests{



}


// Eclipse Photon 
