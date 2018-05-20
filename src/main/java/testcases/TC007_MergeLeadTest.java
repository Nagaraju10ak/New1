package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLeadTest extends ProjectMethods {

	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merges Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Nagarj";
		browserName="chrome";
		dataSheetName="TC007";
		
		
		
	}
	@Test(dataProvider="fetchData")
	public void duplicateLeadTest(String uName,String pwd,String fromLead, String toLead, String errMsg) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickSourceLeadIcon()
		.switchToSourceLeadWindow()
		.typeLeadID(fromLead)
		.clickFindLeadsButton()
		.clickFirstLeadForMergeLead()
		.switchToPrimaryWindow()
		.clickToLeadIcon()
		.switchToTOLeadWindow()
		.typeLeadID(toLead)
		.clickFirstLeadForMergeLead()
		.switchToPrimaryWindow()
		.clickMergeButton()
		.acceptTheAlertForMerge()
		.clickFindLeads()
		.typeLeadID(fromLead)
		.clickFindLeadsButton()
		.verifyNoLeadErrMsg(errMsg);
		
		
		
		
		 
		
		

	}

}


