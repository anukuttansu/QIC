package TestFunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.AdditionalInfoPage;
import Pages.Select_PolicyPage;

public class AdditionalInfo extends BaseClass {
	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;

	@Test
	public void AdditionalInfo() throws Exception {
		AdditionalInfoPage objects = new AdditionalInfoPage(driver);
		wait = new WebDriverWait(driver, 10);
		// Entering additional info
		wait.until(ExpectedConditions.elementToBeClickable(objects.ChasisNo_Field()));
		objects.ChasisNo_Field().click();
		objects.ChasisNo_Field().sendKeys(prop.getProperty("ChasisNo"));
		// Entering Plate no
		wait.until(ExpectedConditions.elementToBeClickable(objects.PlateNo_Field()));
		objects.PlateNo_Field().click();
		objects.PlateNo_Field().sendKeys(prop.getProperty("Plateno"));
		// Selecting plate Type
		select = new Select(objects.PlateType_Dropdown());
		// private type
		select.selectByValue(prop.getProperty("PlateType_Private"));
		// selecting vehicle shape
		select = new Select(objects.VehicleType_DropDown());
		// Select as Hatchback
		select.selectByValue(prop.getProperty("VehicleType_Hatch"));
		// Selecting city
		select = new Select(objects.City_Field());
		select.selectByValue(prop.getProperty("City_"));
		// Enter Po number
		wait.until(ExpectedConditions.elementToBeClickable(objects.POBox_Field()));
		objects.POBox_Field().click();
		objects.POBox_Field().sendKeys(prop.getProperty("poBox"));
		Thread.sleep(3000);
		objects.UploadFile().sendKeys("D:\\Anukuttan User Files\\Downloads\\logo.png");
		wait.until(ExpectedConditions.elementToBeClickable(objects.Proceed_Button()));
		objects.Proceed_Button().click();

	}

}
