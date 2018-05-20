package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {

	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deletes Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Nagarj";
		browserName="chrome";
		dataSheetName="TC005";
		
		
		
	}
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName,String pwd,String phoneNumber, String errMsg) {
		
		
		
		 FindLeadsPage objFindLeads = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneNumber()
		.typePhoneNumber(phoneNumber)
		.clickFindLeadsButton();
		 String textOfLead = objFindLeads.getTextOfLead();
		
		 objFindLeads.clickFirstLead()
		.clickDeleteLeadButton()
		.clickFindLeads()
		.typeCapturedLead(textOfLead)
		.clickFindLeadsButton()
		.verifyNoLeadErrMsg(errMsg);
		
		
		

	}

}


