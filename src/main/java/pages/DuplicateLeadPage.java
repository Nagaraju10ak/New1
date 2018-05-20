package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	
	public  DuplicateLeadPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how =How.NAME , using ="submitButton")
	WebElement eleCreateLead;
	@And("verify the title of the page of Duplicate as (.*)")
	public DuplicateLeadPage verifyTitleOfPage(String title)
	{
		verifyTitle(title);
		return this;
	}
	
	
	@When("click on the create Lead of Duplicate")
	public ViewLeadPage clickCreateLeadOfDuplicate()
	{
		click(eleCreateLead);
		return new ViewLeadPage();
	}
}
