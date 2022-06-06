package TestFunctions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.JiraPolicy;
import Common.WriteExcelData;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.Underwriting_MotorFleet_FleetDirectPage;

public class Underwriting_MotorFleet_FleetDirect extends BaseClass {

	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;

	@JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void CreateMotorIndividual() throws Exception {

		Underwriting_MotorFleet_FleetDirectPage objects = new Underwriting_MotorFleet_FleetDirectPage(driver);
		WriteExcelData report = new WriteExcelData();
		report.SetStatus(4, "Status", "Not Executed");
		wait = new WebDriverWait(driver, 10);
		Thread.sleep(2000);
		// UnderWriting Menu
		objects.UnderwritingBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.MotorIndividual_SubMenu()));
		objects.MotorIndividual_SubMenu().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Skip_Button()));
		objects.Skip_Button().click();
		// ProductType Selection
		wait.until(ExpectedConditions.elementToBeClickable(objects.ProductType_ThirdParty_Radiobutton()));
		objects.ProductType_ThirdParty_Radiobutton().click();

		wait.until(ExpectedConditions.elementToBeClickable(objects.CustomerType_Dropdown()));
		select = new Select(objects.CustomerType_Dropdown());
		// Customer Company selectiom
		select.selectByValue(prop.getProperty("CustType_Company"));
		// customer Individual selection
		select.selectByValue(prop.getProperty("CustType_Individual"));
		select = new Select(objects.select_ModeofPay());
		// Select Mode of payment Cash
		select.selectByValue(prop.getProperty("Cash_mode"));
		// Select Mode of payment Creditcard
		select.selectByValue(prop.getProperty("Credit_mode"));

		// Click the small Icon for selecting Customer name
		wait.until(ExpectedConditions.elementToBeClickable(objects.CustomerSmall_Button()));
		objects.CustomerSmall_Button().click();

		wait.until(ExpectedConditions.elementToBeClickable(objects.Cust_SearchField()));
		objects.Cust_SearchField().click();
		// Entering Customer Id
		objects.Cust_SearchField().sendKeys(prop.getProperty("CustomerCode"));
		// Select Customer
		wait.until(ExpectedConditions.elementToBeClickable(objects.Cust_Select_RadioButton()));
		objects.Cust_Select_RadioButton().click();

		objects.CivilID_Field().sendKeys(prop.getProperty("InvalidCivilId"));
		objects.MobileNo_Field().sendKeys(prop.getProperty("Mobile"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.PolicyStartDate_Field()));
		objects.PolicyStartDate_Field().click();
		objects.PolicyStartDate_Field().clear();
		objects.PolicyStartDate_Field().sendKeys(prop.getProperty("PolicyStartDate"));
		objects.Email_Field().sendKeys(prop.getProperty("EmailId"));

		wait.until(ExpectedConditions.elementToBeClickable(objects.Proceed_Button()));
		objects.Proceed_Button().click();
		// Verification Invalid Civil id
		String VerifyErrorInvalidCivilId = objects.ErorMessage_InvalidCivildID().getText();
		System.out.println("The Error message showing is" + VerifyErrorInvalidCivilId);
		if (VerifyErrorInvalidCivilId.contains(prop.getProperty("EroorInvalidCivilId"))) {
			Assert.assertEquals(VerifyErrorInvalidCivilId, prop.getProperty("EroorInvalidCivilId"));
			System.out.println("Test case Inavlidcivild Id Error verification passed");

		} else {
			Assert.fail();
			System.out.println("Test case verification failed");
			System.out.println("User is unable to See the error while enterimg invalid id");

		}
		objects.CivilID_Field().clear();
		objects.CivilID_Field().sendKeys(prop.getProperty("CivilId"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.MobileNo_Field()));
		objects.MobileNo_Field().clear();
		objects.MobileNo_Field().sendKeys(prop.getProperty("InvalidMobileNo"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.Proceed_Button()));
		objects.Proceed_Button().click();
		Thread.sleep(3000);
		// verification invalid mobile no
		String VerifyErrorInvalidMobileNo = objects.ErorMessage_InvalidMobileNO().getText();
		System.out.println("The Error message showing is" + VerifyErrorInvalidMobileNo);
		if (VerifyErrorInvalidMobileNo.contains(prop.getProperty("ErrorInvalidMobileNo"))) {
			Assert.assertEquals(VerifyErrorInvalidMobileNo, prop.getProperty("ErrorInvalidMobileNo"));
			System.out.println("Test case InavlidMobileNo Id Error verification passed");

		} else {
			Assert.fail();
			System.out.println("Test case verification failed");
			System.out.println("User is unable to See the error while enterimg invalid MobileNo");

		}
		objects.MobileNo_Field().clear();
		objects.MobileNo_Field().sendKeys(prop.getProperty("Mobile"));
		// Vehicle Information
		Thread.sleep(3000);
		select = new Select(objects.VehicleMake_Dropdown());
		select.selectByValue(prop.getProperty("VehicleMake_BMW"));
		select = new Select(objects.VehicleModel_Dropdown());
		Thread.sleep(3000);
		select.selectByValue(prop.getProperty("VehicleModel_530i"));
		// objects.MnfYear_Field().clear();

		// objects.MnfYear_Field().sendKeys(prop.getProperty("mfgYear"));
		// select vehicle body type
		select = new Select(objects.VehicleBodyType_Dropdown());
		select.selectByValue(prop.getProperty("VehicleBodyTyoe_Hatch"));
        //select vehicle Usage Type
		select = new Select(objects.VehicleUsage_Dropdown());
		select.selectByValue(prop.getProperty("VehicleUsage_Private"));
		 //select No of cylinders 
		select = new Select(objects.NoOfCylinders_Dropdown());
		select.selectByValue(prop.getProperty("Cylinders_4"));
		//select area
		select = new Select(objects.GeographicalArea_Dropdown());
		select.selectByValue(prop.getProperty("GArea_AL"));
		//Enter seating capacity
		objects.Seating_Field().sendKeys(prop.getProperty("Seating"));
		//Enter registration year
		objects.RegYear_Field().sendKeys(prop.getProperty("RegYear"));
		objects.Proceed_Button().click();

	}
}
