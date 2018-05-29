

	package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
import pages.PayPal_HomePage;
import wdMethods.ProjectMethods;

	public class TC001_PayPal_SignUp extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC001_PayPal_SignUp";
			testDescription="SignUp for the PayPal";
			testNodes="PayPal";
			category="Smoke";
			authors="Nagaraj";
			browserName="chrome";
			dataSheetName="TC008";
		}
		@Test(dataProvider="fetchData")
		public void loginAndLogout(String cName,String cEmail,String cPass,String cCnfrmPass) {
			
			new PayPal_HomePage()
			.clickSignUp()
			.verifyRadioButton()
			.clickNextButton()
			.enterCountryName(cName)
			.enterEmail(cEmail)
			.enterPassword(cPass)
			.enterConfirmPassword(cCnfrmPass)
			.clickNextButton()
			.PayPal_SuccessLogin();
		}

	}


