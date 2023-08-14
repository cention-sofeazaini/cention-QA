package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accounts {
	
	WebDriver driver; 
	
	public Accounts(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html/body/div[1]/div/main/div[2]/div/div/section/div[1]/div[2]/div/div/div/div/div[1]")
	WebElement MainMenu;
	
	@FindBy(how = How.CSS, using="[data-qa-id='menu_with_subAdministration']")
	WebElement AdministrationMenu;
	
	
	@FindBy(how = How.CSS, using="[data-qa-id='menu_with_subOrganizations']")
	WebElement OrganizationMenu;
	
	@FindBy(how = How.CSS, using="[data-qa-id='menu_Accounts']")
	WebElement AccountsMenu;
	
	@FindBy(how = How.XPATH, using="/html/body/div[1]/div/main/div[2]/div/div/section/div[2]/div[2]/div/div[1]/h2")
	WebElement AccounTitle;
	
	
	public void clickAccountMenu(){
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.MainMenu)).click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.AdministrationMenu)).click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.OrganizationMenu)).click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.AccountsMenu)).click();
	}
	
	public String verifyAccountPage(){
		String actual = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(this.AccounTitle)).getText();
		return actual;
	}
}
