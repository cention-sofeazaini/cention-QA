package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sidebar {

WebDriver driver;


	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[2]/ul")
	WebElement gridBoxErrand;

	@FindBy(how = How.CSS, using = "[data-qa-id='QA_toggle_sidebar_top']")
	WebElement collapseButton;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[1]/button")
	WebElement expandButton;
	
	@FindBy(how = How.CSS, using = "div.sidebar-nav-select:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
	WebElement errandsDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_showCallErrand']")
	WebElement callButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div")
	WebElement mainMenu;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/ul/ul[1]/div[3]")
	WebElement userProfile;
	
	@FindBy(how = How.ID, using = "searcherrands")
	WebElement searchMenu;
	
	@FindBy(how = How.CSS, using = "#administration > a > i")
	WebElement administrationMenu;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Statistics']")
	WebElement statisticsMenu;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Contact cards']")
	WebElement contactCardPage;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Knowledge bases']")
	WebElement knowledgeBaseMenu;
	
	
	
	@FindBy(how = How.CSS, using = "div.sidebar-nav-select:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)")
	WebElement errandsOpenDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_folder_myErrands']")
	WebElement myErrandsMenu;
	
	//@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/ul[1]/li[3]")
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_folder_allErrands']")
	WebElement allErrandsMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/section/div[1]/div[2]/div/ul[2]/li[1]/a")
	WebElement priorityDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_toggleAreaFilter']")
	WebElement areasDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='agentFilter_swathi agent_1716']")
	WebElement agentSwathiAgent;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='agentFilter_swathi_149']")
	WebElement agentSwathi;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_areaFilter_S&G Support_46']")
	WebElement areaSGSupport;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_toggleAgentFilter']")
	WebElement agentsDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_toggleAreaFilter']")
	WebElement areaDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/section/div[1]/div[2]/div/ul[2]/li[4]/a")
	WebElement tagsDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='tagList_Automation tag_413']")
	WebElement AutomationTagFilter;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_searchFilter_search_tag']")
	WebElement searchTagFilter;
	
	@FindBy(how = How.CSS, using = "li > ul.sidebar-menu.tags")
	WebElement listOfSearchedTags;
	
	
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_showManualErrand']")
	WebElement plusErrand;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_folder_186']")
	WebElement salesFolder;
	
	@FindBy(how = How.XPATH, using = "//*[@id='47']")
	WebElement SGSalesArea;
	
	@FindBy(how = How.CLASS_NAME, using = "react-autosuggest__container")
	WebElement areaSearchField;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div[1]/div/div/div[2]/button[1]")
	WebElement confirmMoveToArea;
	
	
	@FindBy(how = How.CLASS_NAME, using = "icon-refresh")
	WebElement refresh;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_with_subOrganizations']")
	WebElement Organizations;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_with_subSystem Setup']")
	WebElement SystemSetup;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Features']")
	WebElement Features;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Agents']")
	WebElement agentsAdmin;
	
	
	@FindBy(how = How.ID, using = "workflow")
	WebElement workflow;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='menu_Contact cards']")
	WebElement contactCards;
	//"[data-qa-id='QA_pick-up_next-styler']"
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Pick-up next')]")
	WebElement pickUpNext;
	
	@FindBy(xpath="html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[2]")
	WebElement notificationMenuSideBar;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[3]")
	WebElement errandsMenuSideBar;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[4]/ul/div")
	WebElement searchMenuSideBar;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='collapse-mm-searchanswers']")
	WebElement searchAnswerSideBar;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[4]/ul/li[3]")
	WebElement statisticMenuSideBar;
	
	@FindBy(xpath="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[4]/ul/li[4]")
	WebElement liveReportMenuSideBar;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='collapse-mm-exports']")
	WebElement exportMenuSideBar;
	
	@FindBy(xpath="	/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div[4]/ul/li[6]")
	WebElement adminMenuSideBar;

	@FindBy(how = How.CSS, using = "[data-qa-id='QA_reload_list']")
	WebElement reloadButton;
	
	
	/* Methods */
	public Sidebar(WebDriver driver)
	{
		this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}
	
	public void clickAllErrandMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.allErrandsMenu)).click();
		//new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.createButton)).click();	
	}
	
	public boolean clickCollapseButton() {
		
		System.out.println("Click Collapse Button");
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.collapseButton)).click();
		Boolean actual = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.gridBoxErrand)).isDisplayed();
		return actual;	
	}
	
	public void displayNotificationMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.notificationMenuSideBar)).click();
			
	}
	
	public void displayErrandsMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.errandsMenuSideBar)).click();
			
	}
	
	public void displaySearchMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchMenuSideBar)).click();
			
	}
	
	public void displaySearchAnswerMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchAnswerSideBar)).isDisplayed();
			
	}
	
	public void displayStatisticMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.statisticMenuSideBar)).isDisplayed();
			
	}
	
	public void displayLiveReportMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.liveReportMenuSideBar)).isDisplayed();
			
	}
	
	public void displayExportMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.exportMenuSideBar)).isDisplayed();
			
	}
	
	public boolean displayAdminMenu(){
		boolean actual = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.adminMenuSideBar)).isDisplayed();
		return actual;
	}
	
	public void setDefaultView(){
		Boolean actual = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.gridBoxErrand)).isDisplayed();
		if(actual == true){
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.expandButton)).click();
		}
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.reloadButton)).click();
	}
	
}
