package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/BasicCalculator.feature",
glue={"stepsDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/Reports/HtmlReports.html",
		"json:target/Reports/JsonReports.json",
		"junit:target/Reports/JUnitReports.xml"},
publish = true
)
public class TestRunner {

}
