package testCasesArea;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseSetup;
import pageFactory.Accounts;
import pageFactory.LoginPage;
import pageFactory.Search;

public class SearchAndStatisticTC extends BaseSetup {
	
	String SearchPage = "https://cloud-qa.cention.com/ng/v5/search";

	@BeforeClass
	public void loginToApplication() 
	{
		//Log in to application
		LoginPage objLogin = new LoginPage(driver);
		objLogin.loginToApplication("tobias","fitri2","987654321");			
	}
	
	@Test(priority=0)
	public void verifySearchPage_01(){
		Search sch = new Search(driver);
		sch.clickMainMenu();
		sch.clickSearchMenu();
	}
	
	@Test(priority=1)
	public void verifySearchErrand_02(){
		Search sch = new Search(driver);
		sch.searchSpecificErrand();
		sch.clickReloadButton();
	}
	
	@Test(priority=2)
	public void verifyOpenSearchedErrand_03(){
		Search sch = new Search(driver);
		sch.OpenSpecificErrand();
		sch.backToSearchPage();
		sch.removeSearchInput();
	}
	
	@Test(priority=3)
	public void verifySearchDateFilter_04(){
		Search sch = new Search(driver);
		driver.navigate().to(SearchPage);
	
		sch.selectStartDate();
		sch.selectEndDate();
		sch.clickReloadButton();
	}
	
	@Test(priority=4)
	public void verifyCollaborationSearchFilter_05(){
		Search sch = new Search(driver);

		sch.collaborationFilter();
		sch.clickReloadButton();
		sch.selectCollaborationErrand();
		sch.openCollabToggle();
	}
	
	@Test(priority=5)
	public void verifySearchAttachmentFile_06(){
		Search sch = new Search(driver);
		driver.navigate().to(SearchPage);
		
		sch.clickSearchInput();
		sch.searchAttachmentFile();
		sch.clickReloadButton();
		sch.OpenSpecificErrand();
	}
	
	@Test(priority=6)
	public void verifyOpenAndDownloadAttachmentFile_06(){
		Search sch = new Search(driver);
		sch.viewAttachmentButton();
	}
}
