package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	
	WebDriver driver; 
	
public Search(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[1]/div[2]/div/div/div")
	WebElement mainMenu;
	
	@FindBy(how = How.CSS, using="[data-qa-id='menu_Search']")
	WebElement searchMenu;
	
	@FindBy(how = How.CSS, using="[data-qa-id='search-input']")
	WebElement searchInput;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/a")
	WebElement errand9724;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[1]/div[2]/div/div/button")
	WebElement reloadButton;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[1]/div[2]/div/ul[1]/li[2]")
	WebElement backToSearch;
	
	@FindBy(how = How.XPATH, using="//*[@id='container']/div/div/div[3]/div/div[2]")
	WebElement closePopUp;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[1]/div[2]/div/div/ul/li[1]/div/div/div/div[1]/div/span/a")
	WebElement startDate;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[1]/div[2]/div/div/ul/li[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div[5]")
	WebElement day1;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[1]/div[2]/div/div/ul/li[2]/div/div/div/div/div/span/a")
	WebElement endDate;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[1]/div[2]/div/div/ul/li[2]/div/div/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	WebElement day30;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[1]/div[2]/div/ul/li[2]/a")
	WebElement schCollaborationFilter;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/a")
	WebElement firstCollaboraionErrand;
	
	@FindBy(how = How.XPATH, using="//*[@id='page-wrapper']/section/div[3]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/button")
	WebElement collabToggle;
	
	@FindBy(how = How.CSS, using="[data-qa-id='QA_showErrandAttachment']")
	WebElement eyeIcon;
	
	@FindBy(how = How.XPATH, using="//*[@id='reply']/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/i/img")
	WebElement AttchFile;
	
//	@FindBy(how = How.LINK_TEXT, using="Download")
//	WebElement downloadBttn;
	
	@FindBy(how = How.XPATH, using="/html/body/div[5]/div/div[2]/div/div[2]/a")
	WebElement downloadBttn;
	
	
	public void clickMainMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.mainMenu)).click();
	}
	
	public void clickSearchMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchMenu)).click();
	}
	
	public void clickSearchInput(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchInput)).click();
	}
	
	public void searchSpecificErrand(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchInput)).click();
		searchInput.sendKeys("9724-1");
	}
	
	public void OpenSpecificErrand(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.errand9724)).click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.closePopUp)).click();
		
	}
	
	public void clickReloadButton(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.reloadButton)).click();
	}
	
	public void backToSearchPage(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.backToSearch)).click();
	}
	
	public void removeSearchInput(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.searchInput)).click();
		searchInput.clear();
	}
	
	public void selectStartDate(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.startDate)).click();
		day1.click();
	}
	
	public void selectEndDate(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.endDate)).click();
		day30.click();
	}
	
	public void collaborationFilter(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.schCollaborationFilter)).click();
	}
	
	public void selectCollaborationErrand(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.firstCollaboraionErrand)).click();
	}
	
	public void openCollabToggle(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.collabToggle)).click();
	}
	
	public void searchAttachmentFile(){
		searchInput.sendKeys("Good Job 2");
	}
	
//	public void openAttachmentErrand(){
//		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.errand9724)).click();
//		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.closePopUp)).click();
//	}
	
	public void viewAttachmentButton(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.eyeIcon)).click();
		AttchFile.click();
		downloadBttn.click();
	}
	
	
}
