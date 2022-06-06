package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
	
@FindBy(xpath= "//button[@class='close']")List<WebElement> CloseBtnCount;
	
	public List<WebElement> CloseBtnCount()
	{
		return CloseBtnCount;
	}
	
	@FindBy(xpath = "//button[@class='close']")
	WebElement closeBtn;

	public WebElement closeBtn() {
		return closeBtn;

	}
	
	@FindBy(xpath = "(//button[@class='btn dropdown-toggle btn-default'])[1]")
	WebElement chooseLanguage;

	public WebElement chooseLanguage() {
		return chooseLanguage;

	}
	
	@FindBy(xpath = "(//li[@class='dropdown']/a[@class='dropdown-toggle'])[4]")
	WebElement LoginDrpDown;

	public WebElement LoginDrpDown() {
		return LoginDrpDown;

	}
	
	@FindBy(xpath = "(//li[@class='dropdown']/a[@class='dropdown-toggle'])[4]")
	List<WebElement> LoginDrpDownCount;

	public List<WebElement> LoginDrpDownCount() {
		return LoginDrpDownCount;

	}
	
	

	
 }