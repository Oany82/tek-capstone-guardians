package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {

		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(linkText = "Account")
	public WebElement accountLink;

	@FindBy(id = "nameInput")
	public WebElement nameField;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneField;

	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBttn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMssg;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthField;

	@FindBy(id = "expirationYearInput")
	public WebElement expireationYearField;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeField;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodSuccessMssg;

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addAPaymentMethodLink;

	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddressLink;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement addressCountryDropdown;

	@FindBy(id = "fullNameInput")
	public WebElement addressNameField;

	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneField;

	@FindBy(id = "streetInput")
	public WebElement addressStreetField;

	@FindBy(id = "apartmentInput")
	public WebElement addressApartmentNum;

	@FindBy(id = "cityInput")
	public WebElement addressCityField;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement addressStateDropdown;

	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeField;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeButton;

	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addAddressSuccessMsg;
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressButton;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editCardButton;
	
	@FindBy(id = "cardNumberInput")
	public WebElement addNewCardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement addNewName;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement addNewExpirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement addNewExpirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement addNewSecurityCode;
	
	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement updateCardSuccessMsg;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editAddressButton;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement updateAddressSuccessMsg;
	
}
