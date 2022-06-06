package TestFunctions;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.JiraPolicy;
import Common.WriteExcelData;
import Pages.LandingPage;
import Pages.LoginPage;


public class ApplicationLoginNegative_FailedSample extends BaseClass {

	public static WebDriverWait wait;
	public static Actions actions;
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void Login_Employee_NegativeValidation() throws Exception {

		LoginPage objects = new LoginPage(driver);
		wait = new WebDriverWait(driver, 10);
		WriteExcelData report = new WriteExcelData();
		report.SetStatus(5, "Status", "Not Executed");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(objects.LoginDrpDown()));
		
		objects.LoginDrpDown().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.option_Employee()));
		objects.option_Employee().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Username_Field()));
		objects.Username_Field().sendKeys(prop.getProperty("Incorrect_username"));
		objects.Password_Field().sendKeys(prop.getProperty("Password"));
		Thread.sleep(2000);
		objects.Password_Field().sendKeys(Keys.TAB);
		objects.Login_Btn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.get_user_Name()));
		String getUsersName = objects.get_user_Name().getText();
		
		if(getUsersName.contains(prop.getProperty("ProfileName"))) {
			Assert.assertEquals(getUsersName, prop.getProperty("ProfileName"));
			System.out.println("Test case verification passed");
			System.out.println("Employee named" +prop.getProperty("ProfileName")+" signed in into the application successfully" );
			report.SetStatus(5, "Status", "Pass");
		}
		else
		{
			Assert.fail();
			System.out.println("Test case verification failed");
			System.out.println("User is unable to login into the application");
			report.SetStatus(5, "Status", "Fail");
		}
		
	}
}
