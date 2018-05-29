package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPal_AccountPage extends ProjectMethods {

	public  PayPal_AccountPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID , using ="country")
	WebElement eleCountry;
	@FindBy(how = How.ID , using ="email")
	WebElement eleEmail;
	@FindBy(how = How.ID , using ="password")
	WebElement elePassword;
	@FindBy(how = How.ID , using ="confirmPassword")
	WebElement eleConfrmPass;
	@FindBy(how = How.ID , using ="_eventId_personal")
	WebElement eleNextButton;
	
	
	public PayPal_AccountPage enterCountryName(String data)
	{
		selectDropDownUsingText(eleCountry, data);
		return this;
	}
	
	public PayPal_AccountPage enterEmail(String data)
	{
		type(eleEmail, data);
		return this;
	}
	public PayPal_AccountPage enterPassword(String data)
	{
		type(elePassword, data);
		return this;
	}
	public PayPal_AccountPage enterConfirmPassword(String data)
	{
		type(eleConfrmPass,data);
		return this;
	}
	public PayPal_Success clickNextButton()
	{
		click(eleNextButton);
		return new PayPal_Success();
	}
}
