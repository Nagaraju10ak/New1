package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {

	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edits company name of a Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Nagarj";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName,String pwd,String firstName,String cName, String vCmp, String title) {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstLead()
		.verifyTitleOfPage(title)
		.clickEditLeadButton()
		.typeCompanyName(cName)
		.clickUpdateButton()
		.verifyCompanyNameUpdated(vCmp);
		
		

	}

}


