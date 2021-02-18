package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature", 
		tags = "@AcessarMoradaMorumbi", 
		glue = "step", 
		plugin = {  
				"pretty",
				"html: target/cucumber-reports/cucumber.html",
				"json: target/cucumber-reports/cucumber.json" 
				}, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, publish = false
)
public class Runner {

}
