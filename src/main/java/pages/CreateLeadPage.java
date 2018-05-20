package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wdMethods.ProjectMethods;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage()
	{
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.ID,using ="createLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(how =How.ID,using ="createLeadForm_firstName")
	WebElement eleFirstName;
	@FindBy(how =How.ID,using ="createLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(how =How.NAME ,using ="submitButton")
	WebElement eleCreateLeadButton;
	
	@And("enter the companyName as (.*)")
	public CreateLeadPage typeCmpName(String data)
	{
		
		type(eleCompanyName, data);
		return this;
	}
	@And("enter the firstName as (.*)")
	public CreateLeadPage typeFirstName(String data)
	{
		
		type(eleFirstName, data);
		return this;
	}
	@And("enter the lastName as (.*)")
	public CreateLeadPage typeLastName(String data)
	{
		type(eleLastName, data);
		return this;
	}
	
	@When("click on the createLead button")
	public ViewLeadPage clickCreateLeadSubmitButton()
	{
		click(eleCreateLeadButton);
		return new ViewLeadPage();
		
		
	}
	
}
