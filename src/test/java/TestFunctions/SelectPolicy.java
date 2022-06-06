package TestFunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.Select_PolicyPage;
import Pages.Underwriting_MotorFleet_FleetDirectPage;

public class SelectPolicy extends BaseClass {

	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;

	@Test
	public void SelectPolicys() throws Exception {
		Select_PolicyPage objects = new Select_PolicyPage(driver);
		wait = new WebDriverWait(driver, 10);
		// Quote No getting
		String QuoteNO = objects.QuoteNo().getText();
		// verification civil id is same
		String CivilId_SelectPolicy = objects.Civilid_Verify().getText();
		System.out.println(CivilId_SelectPolicy);
		System.out.println(prop.getProperty("CivilId"));
		if (CivilId_SelectPolicy.contains(prop.getProperty("CivilId"))) {
			Assert.assertEquals(CivilId_SelectPolicy, prop.getProperty("CivilId"));
			System.out.println("Test case CivilId verification passed");

		} else {
			System.out.println("Test case verification failed");
			System.out.println("Civil is not same as entered");

		}
		// Verification Make
		String Maker_SelectPolicy = objects.Maker_Verify().getText();
		if (Maker_SelectPolicy.contains(prop.getProperty("Make"))) {
			Assert.assertEquals(Maker_SelectPolicy, prop.getProperty("Make"));
			System.out.println("Test case Make verification passed");

		} else {
			System.out.println("Test case verification failed");
			System.out.println("make is not same as entered");

		}
		String TotalGross_Amount = objects.TotalGross().getText();

		String NetPremium_AMount = objects.NetPremium().getText();
		wait.until(ExpectedConditions.elementToBeClickable(objects.PersonalAccident_Checkbox()));
		objects.PersonalAccident_Checkbox().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.PersonalAccident_Checkbox()));
		objects.PersonalAccident_Checkbox().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Proceed_Button()));
		objects.Proceed_Button().click();
	}
}
