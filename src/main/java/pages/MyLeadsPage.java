package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.LINK_TEXT,using ="Create Lead")
	WebElement eleCreateLead;
	@FindBy(how =How.LINK_TEXT,using ="Merge Leads")
	WebElement eleMergeLead;
	
	@And("click on the createLead link")
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLeadPage();
		
	}
	@FindBy(how =How.LINK_TEXT,using ="Find Leads")
	WebElement eleFindLeads;
	
	@And("click on the FindLeads link")
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
	public MergeLeadPage clickMergeLead()
	{
		click(eleMergeLead);
		return new MergeLeadPage();
	}
	

}
