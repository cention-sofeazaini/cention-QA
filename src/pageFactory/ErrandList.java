package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrandList {
/* Collection of Elements */
	
	WebDriver driver;
	
	//Conversation View
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_ErrandCb_Manual']")
	WebElement allErrandCheckBox;
	
	@FindBy(how = How.ID, using = "QA_change_view")
	WebElement switchView;
	
	@FindBy(how = How.CLASS_NAME, using = "icon-mail")
	WebElement errandIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[2]/div[2]")
	WebElement secondErrand;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[3]/div[2]/div[1]/span")
	WebElement thirdErrand;
	
	@FindBy(how = How.ID, using = "ErrandList")
	WebElement scrollErrandList;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[2]/div[1]/div/div/div")
	WebElement secondErrandCheckBox;
		
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[4]/div[1]/div/div/div")
	WebElement thirdErrandCheckBox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@cssSelector,'[data-qa-id='QA_Errand0']') and @class='icon-mail']")
	WebElement errandListPriorityIcon;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@cssSelector,'[data-qa-id='QA_Errand0']') and @class='icon-member light-bulb-on']")
	WebElement errandListCollaborationIcon;
	
	@FindBy(how = How.XPATH, using = "[data-qa-id='QA_errandList_contact_name']")
	WebElement contactCardNameonErrandPageList;
	
	//@FindBy(how = How.CSS, using = "div.app-header > div.jq-selectbox.jqselect.conversations-sort-select > div.jq-selectbox__select > div.jq-selectbox__trigger > div.jq-selectbox__trigger-arrow")
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_list_sort']")
	WebElement sortByDateIcon;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='select-list-DESC']")
	WebElement sortByDescendingOrder;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[2]")
	WebElement firstErrand;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Errand0']")
	WebElement errandFirst;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_closeAcquireErrand']")
	WebElement closeAcquireErrand;
	
	
	/* Methods */
	public ErrandList(WebDriver driver)
	{
		this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}
	
	public void changeErrandView(){
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.switchView)).click();
	}
	
	public void closeAcquireErrandPopup(){
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.closeAcquireErrand)).click();
	}
	
	public void clickFirstErrand(){
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.errandFirst)).click();
	}
	
}
