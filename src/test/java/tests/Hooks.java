package tests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods {

	@Before
	public void beforeMethod(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getId());
		test.assignCategory("smoke");
		test.assignAuthor("Nagaraj");
		startApp("chrome");		
	}
	@After
	public void afterMethod()

	{
		closeAllBrowsers();
		endResult();
	}
}
