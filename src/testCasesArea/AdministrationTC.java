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
	
	@Test
	public void verifyCreateNewEmail_02(){
		Accounts account = new Accounts(driver);
		account.clickCreateNewAccount();
		account.selectArea();
		account.enterName("Email QA");
		account.enterServer("mail.cust.cention.se");
		account.enterUsername("fitriAutomationQA");
		account.enterPassword("Pass1234");
		Assert.assertEquals(account.verifyCreateNewEmailAcc(), true); // need revise code again
	}
	
	
	@Test
	public void verifyTestEmailAccount_03(){
		Accounts account = new Accounts(driver);
		driver.navigate().to("https://cloud-qa.cention.com/ng/v5/admin/accounts");
		account.clickTestButton();
		//add assertion

	}
	
	@Test
	public void verifyEditButtonAccount_04(){
		Accounts account = new Accounts(driver);
		driver.navigate().to("https://cloud-qa.cention.com/ng/v5/admin/accounts");
		account.clickEditButton();
		account.enterFieldName("QA Email Account");
		account.clickSaveButton();
		//add assertion
	}
	
}
