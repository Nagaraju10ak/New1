package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public  ViewLeadPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how =How.ID,using ="viewLead_firstName_sp")
	WebElement eleFnameVer;
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Edit')]")
	WebElement eleEditLead;
	@FindBy(how = How.LINK_TEXT, using ="Delete")
	WebElement eleDeleteLead;
	@FindBy(how = How.LINK_TEXT, using ="Duplicate Lead")
	WebElement eleDuplicateLead;
	
	@Then("verify first name")
	
	public ViewLeadPage verifyFirstName(String data)
	{
		verifyExactText(eleFnameVer, text2);
		return this;
		
	}
	
	@And("verify the title of the page as (.*)")
	public ViewLeadPage verifyTitleOfPage(String title)
	{
		verifyTitle(title);
		return this;
	}
	
	@And("click on the edit Lead button")
	public OpentapsCRM clickEditLeadButton()
	{
		click(eleEditLead);
		return new OpentapsCRM();
	}
	
	public MyLeadsPage clickDeleteLeadButton()
	{
		click(eleDeleteLead);
		return new MyLeadsPage();
	}
	
	@And("click on the Duplicate Lead button")
	public DuplicateLeadPage clickDuplicateLeadButton()
	{
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
	@FindBy(how =How.LINK_TEXT,using ="Find Leads")
	WebElement eleFindLeads;
	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
}
