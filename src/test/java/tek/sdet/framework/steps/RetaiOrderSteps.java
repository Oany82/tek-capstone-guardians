package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetaiOrderSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	// Add Items to the Cart

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		Assert.assertTrue(pomFactory.homePage().tekschoolLogo.isDisplayed());
		logger.info("TEKSCHOOL logo is displayed");
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(pomFactory.loginPage().signInLink);
		logger.info("User clicked on sign in option");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(pomFactory.loginPage().loginButton);
		logger.info("User clicked on login button");
	}

	@When("User should be logged in in to Account")
	public void userShouldBeLoggedInInToAccount() {
		Assert.assertTrue(pomFactory.loginPage().logoutButton.isDisplayed());
		logger.info("User sees the logout button");
	}

	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		selectByVisibleText(pomFactory.retailOrderPage().allDepartmentDropdown, category);
		logger.info("Category was selected successfully from dropdown: " + category);
	}

	@Then("User search for an item {string}")
	public void userSearchForAnItem(String itemToSearch) {
		sendText(pomFactory.retailOrderPage().searchInputField, itemToSearch);
		logger.info("Search item name was entered successfully: " + itemToSearch);
	}

	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(pomFactory.retailOrderPage().searchBttn);
		logger.info("Search button was clicked successfully");
	}

	@When("User click on item {string}")
	public void userClickOnItem(String foundItem) {
		WebElement element = getDriver().findElement(By.xpath("//img[@alt='" + foundItem + "']"));
		click(element);
		logger.info("User clicked on item: " + foundItem);
	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("Item quantity was selected succcessfully: " + itemQty);
	}

	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(pomFactory.retailOrderPage().addToCartBttn);
		logger.info("Add item to the cart button was clicked successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, pomFactory.retailOrderPage().cartItemQty.getText());
		logger.info("Item qty in the cart was validated successfully as: " + itemQtyInTheCart);
	}

	// Add Items to Cart and Checkout

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(pomFactory.retailOrderPage().cartBttn);
		logger.info("User clicked on Cart option");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(pomFactory.retailOrderPage().proceedBttn);
		logger.info("User clicked on proceed to checkout successfully");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(pomFactory.retailOrderPage().placeOrderBttn);
		logger.info("User clicked on place your order successfully");

	}
	@Then("User click on Delete button")
	public void userClickOnDeleteButton() {
		click(pomFactory.retailOrderPage().deleteCart);
		logger.info("User clicked on delete button");
	}

	// Cancel Order

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(pomFactory.retailOrderPage().ordersBttn);
		logger.info("User clicked on orders button");

	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(pomFactory.retailOrderPage().firstOrder);
		logger.info("User clicked on first order");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(pomFactory.retailOrderPage().cancelBttn);
		logger.info("User clicked on cancel the order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(pomFactory.retailOrderPage().cancelReason, reason);
		logger.info("Cancelation reason was selected succcessfully: " + reason);
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(pomFactory.retailOrderPage().orderSbmtBttn);
		logger.info("User clicked on cancel order button");
	}

	// Return Order

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(pomFactory.retailOrderPage().returnBttn);
		logger.info("User clicked on return items button");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(pomFactory.retailOrderPage().returnReason, reason);
		logger.info("Return reason was selected succcessfully: " + reason);
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String service) {
		selectByVisibleText(pomFactory.retailOrderPage().dropOff, service);
		logger.info("Drop off service was selected succcessfully: " + service);
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(pomFactory.retailOrderPage().returnSbmtBttn);
		logger.info("User clicked on return order button");
	}

	// Review Order

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(pomFactory.retailOrderPage().reviewBttn);
		logger.info("User clicked on review button");
	}
	
	@When("User write review headline {string} and written text {string}")
	public void userWriteReviewHeadlineAndWrittenText(String headlineText, String writtenText) {
		sendText(pomFactory.retailOrderPage().headlineText, headlineText);
		sendText(pomFactory.retailOrderPage().descriptionText, writtenText);
		logger.info("User entered headline and written text");
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(pomFactory.retailOrderPage().reviewSbmtBttn);
		logger.info("User clicked add review button");
	}
}
