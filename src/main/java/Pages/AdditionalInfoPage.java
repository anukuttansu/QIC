package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalInfoPage {
	WebDriver driver;

	public AdditionalInfoPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='id_additionalInfo_chasisNo']")
	WebElement ChasisNo_Field;

	public WebElement ChasisNo_Field() {
		return ChasisNo_Field;

	}

	@FindBy(xpath = "//input[@id='registrationNoId']")
	WebElement PlateNo_Field;

	public WebElement PlateNo_Field() {
		return PlateNo_Field;

	}

	@FindBy(xpath = "//select[@id='plateCharacter']")
	WebElement PlateType_Dropdown;

	public WebElement PlateType_Dropdown() {
		return PlateType_Dropdown;

	}

	@FindBy(xpath = "//select[@id='id_additionalInfo_vehicleShape']")
	WebElement VehicleType_DropDown;

	public WebElement VehicleType_DropDown() {
		return VehicleType_DropDown;

	}

	@FindBy(xpath = "//select[@id='id_additionalInfo_city']")
	WebElement City_Field;

	public WebElement City_Field() {
		return City_Field;

	}

	@FindBy(xpath = "//input[@id='id_additionalInfo_poBox']")
	WebElement POBox_Field;

	public WebElement POBox_Field() {
		return POBox_Field;

	}

	@FindBy(xpath = "//input[@id='uploadedFile1']")
	WebElement UploadFile;

	public WebElement UploadFile() {
		return UploadFile;

	}

	@FindBy(xpath = "//input[@class='btn_next']")
	WebElement Proceed_Button;

	public WebElement Proceed_Button() {
		return Proceed_Button;
	}
}
