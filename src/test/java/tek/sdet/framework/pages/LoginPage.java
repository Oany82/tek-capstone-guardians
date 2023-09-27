package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class LoginPage extends BaseSetup {

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "Sign in")
	public WebElement signInLink;
	
	@FindBy(id = "email")
	public WebElement emailText;
	
	@FindBy(id = "password")
	public WebElement passwordText;
	
	@FindBy(id = "loginBtn")
	public WebElement loginButton;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutButton;
	
	@FindBy(linkText = "Create New Account")
	public WebElement newAccountLink;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id = "signupBtn")
	public WebElement signupButton;
	
	@FindBy(xpath = "//h1[@class='account__information-username']")
	public WebElement accountInfoUsernamelabel;
}