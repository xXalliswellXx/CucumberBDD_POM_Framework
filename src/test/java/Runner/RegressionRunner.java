package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/main/resources/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/report/RegressionTest.html"}
)

public class RegressionRunner extends AbstractTestNGCucumberTests {
}
