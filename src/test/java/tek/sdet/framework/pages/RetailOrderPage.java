package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchBttn;

	@FindBy(tagName = "img")
	public WebElement kasaOutdoorSmartPlug;

	@FindBy(xpath = "//select[starts-with(@class,'product')]")
	public WebElement qtyDropdown;

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn;

	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartItemQty;

	@FindBy(id = "search")
	public WebElement searchDropDown;

	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedBttn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMssg;
	
	@FindBy(linkText="Orders")
	public WebElement ordersBttn;

	@FindBy(xpath="(//p[text()='Show Details'])[1]")
	public WebElement firstOrder;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancelReason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderSbmtBttn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelledMssg;
	
	@FindBy(id="returnBtn")
	public WebElement returnBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement returnReason;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOff;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement returnSbmtBttn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnSuccessMssg;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBttn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineText;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionText;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSbmtBttn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewAddMssg;
	
	@FindBy(xpath="//span[text()='Delete']")
	public WebElement deleteCart;
	
	@FindBy(xpath="//h1[text()='Your Shopping Cart is Empty']")
	public WebElement emptyCartMssg;
	
}