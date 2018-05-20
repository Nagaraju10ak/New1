package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	
	
	
	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.XPATH,using ="(//div[@class = 'x-form-item x-tab-item']/div/input)[2]")
	WebElement eleFirstName;
	
	@FindBy(how =How.XPATH , using ="//button[text()='Find Leads']")
	WebElement eleFindLeads;
	
	@FindBy(how =How.XPATH , using ="//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstLead;
	@FindBy(how =How.XPATH,using ="(//span[@class = 'x-tab-strip-text '])[2]")
	WebElement elePhneLink;
	@FindBy(how =How.XPATH ,using ="//td[@class = 'x-table-layout-cell']//div/input[@name = 'phoneNumber']")
	WebElement elePhoneNumber;
	@FindBy(how =How.XPATH,using ="(//span[@class = 'x-tab-strip-text '])[3]")
	WebElement eleEmailLink;
	@FindBy(how =How.NAME ,using ="emailAddress")
	WebElement eleEmail;
	
	@FindBy(how =How.XPATH ,using ="//div[@class= 'x-form-element']/input[@name= 'id']")
	WebElement eleLead;
	
	@FindBy(how =How.XPATH ,using ="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']")
	WebElement eleFirstNameOfLead;
	
	@FindBy(how =How.XPATH ,using ="//div[@class='x-paging-info']")
	WebElement eleErr;
	
	@FindBy(how =How.NAME ,using ="id")
	WebElement eleLeadID;
	@And("enter the first Name as (.*)")
	public FindLeadsPage typeFirstName(String data)
	{
		type(eleFirstName, data);
		return this;
	}
	
	@And("click on the find Leads button")
	public FindLeadsPage clickFindLeadsButton()
	{
		click(eleFindLeads);
		return this;
	}
	
	@And("click on the first resulting")
	public ViewLeadPage clickFirstLead()
	{
		click(eleFirstLead);
		return new ViewLeadPage();
	}
	public MergeLeadPage clickFirstLeadForMergeLead()
	{
		click(eleFirstLead);
		return new MergeLeadPage();
	}
	
	@And("capture first resulting lead name")
	public String getTextOfFirstName()
	{
		 text2 = getText(eleFirstNameOfLead);
		return text2;
	}
	public String getTextOfLead()
	{
		String text = getText(eleFirstLead);
		return text;
		
	}
	
	public FindLeadsPage clickPhoneNumber()
	{
		click(elePhneLink);
		return this;
	}
	
	
	public FindLeadsPage typeCapturedLead(String lead)
	{
		type(eleLead, lead);
		return this;
		
	}
	public FindLeadsPage typePhoneNumber(String data) {
		type(elePhoneNumber,data);
		return this;
	}

	@And("click on the Email tab")
	public FindLeadsPage clickEmail()
	{
		click(eleEmailLink);
		return this;
	}
	@And("enter the Email ID as (.*)")
	public FindLeadsPage typeEmail(String data)
	{
		type(eleEmail, data);
		return this;
	}
	
	public FindLeadsPage verifyNoLeadErrMsg(String data)
	{
		
		
	verifyPartialText(eleErr, data);
	return this;
	}
	
	
	public FindLeadsPage switchToSourceLeadWindow()
	{
		switchToWindow(1);
		return this;
	}
	public FindLeadsPage switchToTOLeadWindow()
	{
		switchToWindow(1);
		return this;
	}
	
	public FindLeadsPage typeLeadID(String data)
	{
		type(eleLeadID, data);
		return this;
	}
	public MergeLeadPage switchToPrimaryWindow()
	{
		switchToWindow(0);
		return new MergeLeadPage();
		
	}
}