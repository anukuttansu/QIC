package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Underwriting_MotorFleet_FleetDirectPage {
	WebDriver driver;

	public Underwriting_MotorFleet_FleetDirectPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li/ul/child::a[1]")
	WebElement UnderwritingBtn;

	public WebElement UnderwritingBtn() {
		return UnderwritingBtn;

	}

	@FindBy(xpath = "//a[@class='menuItem'][2]")
	WebElement MotorIndividual_SubMenu;

	public WebElement MotorIndividual_SubMenu() {
		return MotorIndividual_SubMenu;

	}

	@FindBy(xpath = "//input[@id='Skip']")
	WebElement Skip_Button;

	public WebElement Skip_Button() {
		return Skip_Button;
	}

	@FindBy(xpath = "(//input[@id='prodTypeThird'])[2]")
	WebElement ProductType_ThirdParty_Radiobutton;

	public WebElement ProductType_ThirdParty_Radiobutton() {
		return ProductType_ThirdParty_Radiobutton;
	}

	@FindBy(xpath = "//select[@id='customerTypeId']")
	WebElement CustomerType_Dropdown;

	public WebElement CustomerType_Dropdown() {
		return CustomerType_Dropdown;
	}

	@FindBy(xpath = "//span[@id='companyText']")
	WebElement CustomerType_CompanyVerification;

	public WebElement CustomerType_CompanyVerification() {
		return CustomerType_CompanyVerification;
	}

	@FindBy(xpath = "//select[@id='modeOfPay']")
	WebElement select_ModeofPay;

	public WebElement select_ModeofPay() {
		return select_ModeofPay;
	}

	@FindBy(xpath = "//input[@name='custName']")
	WebElement CustomerSmall_Button;

	public WebElement CustomerSmall_Button() {
		return CustomerSmall_Button;
	}

	@FindBy(xpath = "//input[@type='search']")
	WebElement Cust_SearchField;

	public WebElement Cust_SearchField() {
		return Cust_SearchField;
	}

	@FindBy(xpath = "//input[@name='select']")
	WebElement Cust_Select_RadioButton;

	public WebElement Cust_Select_RadioButton() {
		return Cust_Select_RadioButton;
	}

	@FindBy(xpath = "//input[@name='civilId']")
	WebElement CivilID_Field;

	public WebElement CivilID_Field() {
		return CivilID_Field;
	}

	@FindBy(xpath = "//input[@name='mobileNo']")
	WebElement MobileNo_Field;

	public WebElement MobileNo_Field() {
		return MobileNo_Field;
	}

	@FindBy(xpath = "//input[@name='policyStartDate']")
	WebElement PolicyStartDate_Field;

	public WebElement PolicyStartDate_Field() {
		return PolicyStartDate_Field;
	}

	@FindBy(xpath = "//input[@name='emailId']")
	WebElement Email_Field;

	public WebElement Email_Field() {
		return Email_Field;
	}

	@FindBy(xpath = "//input[@class='btn_next pull-right']")
	WebElement Proceed_Button;

	public WebElement Proceed_Button() {
		return Proceed_Button;
	}

	@FindBy(xpath = "//div[@id='PageErrorDivId']//li")
	WebElement ErorMessage_InvalidCivildID;

	public WebElement ErorMessage_InvalidCivildID() {
		return ErorMessage_InvalidCivildID;
	}

	@FindBy(xpath = "//div[@id='PageErrorDivId']//li")
	WebElement ErorMessage_InvalidMobileNO;

	public WebElement ErorMessage_InvalidMobileNO() {
		return ErorMessage_InvalidMobileNO;
	}

	@FindBy(xpath = "//select[@id='vehicleMake'] ")
	WebElement VehicleMake_Dropdown;

	public WebElement VehicleMake_Dropdown() {
		return VehicleMake_Dropdown;
	}

	@FindBy(xpath = "(//select[@name='vehicleModel'])[1]")
	WebElement VehicleModel_Dropdown;

	public WebElement VehicleModel_Dropdown() {
		return VehicleModel_Dropdown;
	}

	@FindBy(xpath = "//select[@id='bodyType']")
	WebElement VehicleBodyType_Dropdown;

	public WebElement VehicleBodyType_Dropdown() {
		return VehicleBodyType_Dropdown;
	}

	@FindBy(xpath = "//select[@id='usageCode']")
	WebElement VehicleUsage_Dropdown;

	public WebElement VehicleUsage_Dropdown() {
		return VehicleUsage_Dropdown;
	}

	@FindBy(xpath = "//select[@id='noOfCylinders']")
	WebElement NoOfCylinders_Dropdown;

	public WebElement NoOfCylinders_Dropdown() {
		return NoOfCylinders_Dropdown;
	}

	@FindBy(xpath = "//select[@id='preInfo_geoArea']")
	WebElement GeographicalArea_Dropdown;

	public WebElement GeographicalArea_Dropdown() {
		return GeographicalArea_Dropdown;
	}

	@FindBy(xpath = "//input[@id='mfgYear']")
	WebElement MnfYear_Field;

	public WebElement MnfYear_Field() {
		return MnfYear_Field;
	}

	@FindBy(xpath = "//input[@id='seatingCapacity']")
	WebElement Seating_Field;

	public WebElement Seating_Field() {
		return Seating_Field;
	}

	@FindBy(xpath = "//input[@id='regYear']")
	WebElement RegYear_Field;

	public WebElement RegYear_Field() {
		return RegYear_Field;
	}
}