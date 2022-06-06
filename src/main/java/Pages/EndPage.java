package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndPage {
	WebDriver driver;

	public EndPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='save']")
	WebElement SaveAsQuote_Button;

	public WebElement SaveAsQuote_Button() {
		return SaveAsQuote_Button;

	}

	@FindBy(xpath = "//input[@name='approve']")
	WebElement ApproveAsPolicy_Button;

	public WebElement ApproveAsPolicy_Button() {
		return ApproveAsPolicy_Button;

	}

	@FindBy(xpath = "//*[@id=\"policyInfoArea\"]/div[1]/table/tbody/tr[2]/td[2]")
	WebElement QuoteNoEnd_Verify;

	public WebElement QuoteNoEnd_Verify() {
		return QuoteNoEnd_Verify;

	}

	@FindBy(xpath = "//*[@id=\"policyInfoArea\"]/div[1]/table/tbody/tr[2]/td[2]")
	WebElement PolicyNo_Text;

	public WebElement PolicyNo_Text() {
		return PolicyNo_Text;

	}

	@FindBy(xpath = "(//a[@class='dropdown-item111 nav-link br-l'])[2]")
	WebElement Logout_Button;

	public WebElement Logout_Button() {
		return Logout_Button;

	}
	@FindBy(xpath = "//td[@id='POL_TOT_PREM']")
	WebElement TotalPremium_Verify;

	public WebElement TotalPremium_Verify() {
		return TotalPremium_Verify;

	}
	@FindBy(xpath = "//td[@id='POL_NET_PREM']")
	WebElement NetPremium_Verify;

	public WebElement NetPremium_Verify() {
		return NetPremium_Verify;

	}
	@FindBy(xpath = "//input[@id='back']")
	WebElement Back_Button;

	public WebElement Back_Button() {
		return Back_Button;

	}
	@FindBy(xpath = "//input[@class='btn_next']")
	WebElement Proceed_Button;

	public WebElement Proceed_Button() {
		return Proceed_Button;
	}
}
