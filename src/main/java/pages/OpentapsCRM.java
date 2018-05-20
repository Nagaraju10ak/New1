package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class OpentapsCRM extends ProjectMethods {
	
	public  OpentapsCRM() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how =How.ID,using ="updateLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(how =How.NAME ,using ="submitButton")
	WebElement eleUpdate;
	@FindBy(how =How.ID ,using ="viewLead_companyName_sp")
	WebElement eleCompanyUpdate;
	
	@And("change the company as (.*)")
	public OpentapsCRM typeCompanyName(String data)
	{
		type(eleCompanyName, data);
		return this;
		
	}
	
	@When("click on the update button")
	public OpentapsCRM clickUpdateButton()
	{
		click(eleUpdate);
		return this;
	}
	
	@Then("confirm the change name appear as (.*)")
	public OpentapsCRM verifyCompanyNameUpdated(String data)
	{
		verifyExactText(eleCompanyUpdate, data);
		
		return this;
	}
	
	
	
}
