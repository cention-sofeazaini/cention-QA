package testCasesArea;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseSetup;
import pageFactory.LoginPage;

public class LoginTC extends BaseSetup{
	
	//@BeforeClass
	@Test(enabled=true)
	public void loginToApplication() 
	{
		//Log in to application
		
		LoginPage objLogin = new LoginPage(driver);
		String actual = objLogin.loginToApplication("tobias","fitri2","987654321");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    Assert.assertEquals(actual, "Cention Contact Center");
	}
	
	
	@Test(enabled=true)
	public void VerifyLogout_02()throws AWTException
	{
		LoginPage objLogin = new LoginPage(driver);
		
		objLogin.clickLogout();
		boolean actual = objLogin.verifyLogout();
	    Assert.assertTrue(actual);
	}
	
	@Test(enabled=true)
	public void VerifyResetPassword_03()throws AWTException
	{
		LoginPage objLogin = new LoginPage(driver);
		
		objLogin.clickForgotPass();
		String actual = objLogin.resetPassForm("tobias","fitri2","centionqa@gmail.com");
		Assert.assertEquals(actual, "Cention Contact Center");
	}
	
	
}
