package TestFunctions;

import java.util.Random;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.JiraPolicy;
import Common.WriteExcelData;
import Pages.LandingPage;


public class ApplicationLandingPage extends BaseClass {

	public static WebDriverWait wait;
	public static Actions actions;
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifyLandingPage() throws Exception {

		LandingPage objects = new LandingPage(driver);
		WriteExcelData report = new WriteExcelData();
		report.SetStatus(1, "Status", "Not Executed");
		driver.get(prop.getProperty("URL"));
		wait = new WebDriverWait(driver, 10);
		Thread.sleep(3000);
		if(objects.CloseBtnCount().size()>0) {
			objects.closeBtn().click();	
		}
		wait.until(ExpectedConditions.elementToBeClickable(objects.LoginDrpDown()));
		
		if(objects.LoginDrpDownCount().size()>0) {
			Assert.assertTrue(true);
			System.out.println("Application landing page displayed successfully and test case passed, status added to the report");
			report.SetStatus(1, "Status", "Pass");
		}
		else {
			Assert.fail();
			System.out.println("Application landing page not displayed and hence test case failed, status added to the report");
			report.SetStatus(1, "Status", "Fail");
		}
		
		
	}
}
