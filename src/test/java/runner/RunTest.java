package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features= {"src/test/java/feaature/CreateLead.feature"},glue= {"pages","tests"})
/*@CucumberOptions(features= {"src/test/java/feaature/EditLead.feature"},glue= {"pages","tests"},monochrome=true)*/
@CucumberOptions(features= {"src/test/java/feaature/DuplicateLead.feature"},glue= {"pages","tests"},monochrome=true)
//@CucumberOptions(features= {"src/test/java/feaature"},glue= {"pages","tests"},monochrome=true,tags= {"@smoke or @sanity"})

public class RunTest {

	
	
}
