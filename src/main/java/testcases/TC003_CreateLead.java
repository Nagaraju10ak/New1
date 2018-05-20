package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creates a Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Nagarj";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLeadTest(String uName,String pwd,String cName,String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCmpName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadSubmitButton()
		.verifyFirstName(fName);
		
	}

}
