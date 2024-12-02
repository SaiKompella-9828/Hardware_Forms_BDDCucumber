package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinitions_HardwareServices",monochrome=true,tags="@SimpleServiceRequests")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
