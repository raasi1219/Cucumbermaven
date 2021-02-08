package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Login\\Login.feature"},
glue={"StepDefinition"},// this is to run the step files
monochrome=true,  // to make console output in better format
dryRun=false,    //  to check all the methods have been implemented properly
strict=true,     //  to check did i miss any steps is all fine in the step definition 
plugin = {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
) 


public class Test_Runner {

}
