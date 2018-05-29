package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPal_HomePage extends ProjectMethods {

	public  PayPal_HomePage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID , using ="signup-button")
	WebElement eleSignUp;
	
	public PayPal_AccountSelectionPage clickSignUp()
	{
		click(eleSignUp);
		return new PayPal_AccountSelectionPage();
	}
}
