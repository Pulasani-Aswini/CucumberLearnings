package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/linkedinlearning/cucumbercourse/features"},
		glue={"stepdefinitions"},
//		tags= {"@NightlyBuildTest","@RegularTest"},
//		tags= {"@ListofStrings"},
//		tags= {"@ListofListofStrings"},
//		tags= {"@ListofMaps"},
		tags= {"@ScenarioOutlineExample"},
		plugin= {"pretty",
				"html:target/SystemTestReports/html",
				"json:target/SystemTestReports/json/report.json",
				"junit:target/SystemTestReports/junit/report.xml"}
		         //dryRun=true // step methods won't run this is to check all scenarios are linked with step definitions or not
		)
public class MenuManagementTest {

}
