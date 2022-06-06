package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
	
	
	@FindBy(xpath = "//li[@class='tpl_upgrade']/following-sibling::li[5]/child::a")
	WebElement LoginDrpDown;

	public WebElement LoginDrpDown() {
		return LoginDrpDown;

	}
	
	@FindBy(xpath = "//a[text()='Employee']")
	WebElement option_Employee;

	public WebElement option_Employee() {
		return option_Employee;

	}
	
	@FindBy(xpath = "//form[@id='EmployeeLoginForm']/child::div[2]/child::div[1]/input[@name='userId']")
	WebElement Username_Field;

	public WebElement Username_Field() {
		return Username_Field;

	}
	
	@FindBy(xpath = "//form[@id='EmployeeLoginForm']/child::div[2]/child::div[2]/input[@name='password']")
	WebElement Password_Field;

	public WebElement Password_Field() {
		return Password_Field;

	}
	
	
	@FindBy(xpath = "//form[@id='EmployeeLoginForm']/child::div[2]/child::div[5]/input[@value='Login']")
	WebElement Login_Btn;

	public WebElement Login_Btn() {
		return Login_Btn;	
 }
	
	@FindBy(xpath = "//span[@class='hidden-xs']")
	WebElement get_user_Name;

	public WebElement get_user_Name() {
		return get_user_Name;	
 }
	
	@FindBy(xpath = "//div[@id='EmployeeLoginErrorDiv']")
	WebElement get_Login_Error;

	public WebElement get_Login_Error() {
		return get_Login_Error;	
 }
}