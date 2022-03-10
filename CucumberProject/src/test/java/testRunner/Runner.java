package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".//Features/Login.feature",
	monochrome=true,
	glue={"stepDefinations"},
	dryRun=false,
	//plugin= {"pretty","html:target/cucumber-reports"}
	plugin = {
            "pretty",
            "json:target/cucumber-report/cucumber.json",
            "html:target/cucumber-report/cucumber.html"}

		)


public class Runner {

}
