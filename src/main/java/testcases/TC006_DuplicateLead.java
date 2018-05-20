package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods {

	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicates Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Nagarj";
		browserName="chrome";
		dataSheetName="TC006";
		
		
		
	}
	@Test(dataProvider="fetchData")
	public void duplicateLeadTest(String uName,String pwd,String email,String title) {
		
		
		 FindLeadsPage objFindLeads = new LoginPage()
		 .enterUserName(uName)
		 .enterPassword(pwd)
		 .clickLogIn()
		 .clickCRMSFA()
		 .clickLeads()
		 .clickFindLeads()
		 .clickEmail()
		 .typeEmail(email)
		 .clickFindLeadsButton();
		 
		 String textOfFirstName =objFindLeads.getTextOfFirstName();
		 
		 
		 objFindLeads.clickFirstLead()
		 .clickDuplicateLeadButton()
		 .verifyTitleOfPage(title)
		 .clickCreateLeadOfDuplicate()
		 .verifyFirstName(textOfFirstName);
		 
		
		

	}

}


