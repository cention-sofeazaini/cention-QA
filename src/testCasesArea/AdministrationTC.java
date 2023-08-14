package testCasesArea;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseSetup;
import pageFactory.Accounts;
import pageFactory.LoginPage;

public class AdministrationTC extends BaseSetup{

	@BeforeClass
	public void loginToApplication() 
	{
		//Log in to application
		LoginPage objLogin = new LoginPage(driver);
		objLogin.loginToApplication("tobias","fitri","123456789");			
	}
	

	@Test
	public void verifyAccountsPage_01(){
		Accounts account = new Accounts(driver);
		account.clickAccountMenu();
		Assert.assertEquals(account.verifyAccountPage(), "Accounts");
	}
}
