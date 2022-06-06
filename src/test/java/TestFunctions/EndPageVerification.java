package TestFunctions;

import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.StringHelper;
import Pages.AdditionalInfoPage;
import Pages.EndPage;

public class EndPageVerification extends BaseClass {
	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;

	@Test
	public void EndPageDetails() throws Exception {
		EndPage objects = new EndPage(driver);
		wait = new WebDriverWait(driver, 10);
		//Back to previous page
		wait.until(ExpectedConditions.elementToBeClickable(objects.Back_Button()));
		objects.Back_Button().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Proceed_Button()));
		objects.Proceed_Button().click();
		
		//Verification Total and net premium
		String TotalGrossAmount = objects.TotalPremium_Verify().getText();
		double Totalamt = StringHelper.getDoubleValue(TotalGrossAmount);
		
		String NetPremiumAmount = objects.NetPremium_Verify().getText();
		double Netamt = StringHelper.getDoubleValue(NetPremiumAmount);
		
		if (Totalamt == Netamt) {
			
			System.out.println("Test case Amount verification passed");

		} else {
			System.out.println("Test case verification failed");
			System.out.println("Amount is not same");

		}
		// Click Save as Quote
		wait.until(ExpectedConditions.elementToBeClickable(objects.SaveAsQuote_Button()));
		objects.SaveAsQuote_Button().click();
		// Getting Quote no and Final verification
		String QuoteNoEndVerify = objects.QuoteNoEnd_Verify().getText(); 
		System.out.println("The Quote no " + QuoteNoEndVerify);
		
		// Approve as policy
		wait.until(ExpectedConditions.elementToBeClickable(objects.ApproveAsPolicy_Button()));
		objects.ApproveAsPolicy_Button().click();
		String PolicyNo = objects.PolicyNo_Text().getText();
		// Printing Policy No
		System.out.println("The policy number is" + PolicyNo);
		// LogOUT
		wait.until(ExpectedConditions.elementToBeClickable(objects.Logout_Button()));
		objects.Logout_Button().click();
	}
}
