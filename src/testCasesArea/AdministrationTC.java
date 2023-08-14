package testCasesArea;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseSetup;
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
	public void testCase_01(){
		
		
	}
	
}
