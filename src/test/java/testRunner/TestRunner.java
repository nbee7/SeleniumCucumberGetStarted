package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/Features/",glue={"stepDefinition"},
        monochrome = true,
        plugin = {"pretty", "junit:target/reports/cucumber.xml", "json:target/reports/report.json"}
)

public class TestRunner {

}
