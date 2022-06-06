package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_PolicyPage {
	WebDriver driver;

	public Select_PolicyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"AdditionalInfo\"]/div[1]/table/tbody/tr[2]/td[2]")
	WebElement QuoteNo;

	public WebElement QuoteNo() {
		return QuoteNo;

	}

	@FindBy(xpath = "//*[@id=\"AdditionalInfo\"]/div[1]/table/tbody/tr[3]/td[2]")
	WebElement Civilid_Verify;

	public WebElement Civilid_Verify() {
		return Civilid_Verify;

	}

	@FindBy(xpath = "//*[@id=\"AdditionalInfo\"]/div[1]/table/tbody/tr[3]/td[4]")
	WebElement Maker_Verify;

	public WebElement Maker_Verify() {
		return Maker_Verify;

	}

	@FindBy(xpath = "//div[@id='cvrDiv0']")
	WebElement TotalGross;

	public WebElement TotalGross() {
		return TotalGross;

	}

	@FindBy(xpath = "//div[@id='netPrmAmtDiv0']")
	WebElement NetPremium;

	public WebElement NetPremium() {
		return NetPremium;

	}

	@FindBy(xpath = "(//img[@id='rateChk'])[1]")
	WebElement PersonalAccident_Checkbox;

	public WebElement PersonalAccident_Checkbox() {
		return PersonalAccident_Checkbox;

	}

	@FindBy(xpath = "//input[@class='btn_next pull-right']")
	WebElement Proceed_Button;

	public WebElement Proceed_Button() {
		return Proceed_Button;
	}
}
