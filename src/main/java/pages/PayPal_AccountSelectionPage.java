package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPal_AccountSelectionPage extends ProjectMethods {

	public  PayPal_AccountSelectionPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID , using ="radio-personal")
	WebElement eleBusiness;
	
	@FindBy(how = How.LINK_TEXT , using ="Next")
	WebElement eleNext;
	
	
	
	public PayPal_AccountSelectionPage verifyRadioButton()
	{
		if(verifySelected(eleBusiness))
			System.out.println("Element already selected");
		else
			click(eleBusiness);
		
		return this;
	}
	
	
	public PayPal_AccountPage clickNextButton()
	{
		click(eleNext);
		return new PayPal_AccountPage();
	}
	
	
}
