package Runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "F:\\Work Space\\CucumberBDDFramework\\src\\main\\java\\Feature\\Login.feature"
		,glue = {"StepDefinitions"}
		,format = {"pretty","html:test-outout"})




public class TestRunner {
	
	
}
