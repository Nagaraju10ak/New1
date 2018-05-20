package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	
	public  MergeLeadPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(how = How.XPATH, using ="//img[@alt='Lookup']")
	WebElement eleSourceLead;
	@FindBy(how = How.XPATH, using ="(//img[@alt='Lookup'])[2]")
	WebElement eleToLead;
	@FindBy(how = How.LINK_TEXT, using ="Merge")
	WebElement eleMerge;
	public FindLeadsPage clickSourceLeadIcon()
	{
		click(eleSourceLead);
		return new FindLeadsPage();
	}
	public FindLeadsPage clickToLeadIcon()
	{
		click(eleToLead);
		return new FindLeadsPage();
	}
	public MergeLeadPage clickMergeButton()
	{
		click(eleMerge);
		return this;
		
	}
	
	public ViewLeadPage acceptTheAlertForMerge()
	{
		acceptAlert();
		return new ViewLeadPage();
	}
	
	public MergeLeadPage switchToPrimaryWindow()
	{
		switchToWindow(0);
		return this;
	}
	
	
}
