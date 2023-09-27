package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {
	POMFactory pomFactory = new POMFactory();

	// Update Profile

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(pomFactory.retailAccountPage().accountLink);
		logger.info("Account link was clicked successfully");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		clearTextUsingSendKeys(pomFactory.retailAccountPage().nameField);
		sendText(pomFactory.retailAccountPage().nameField, name);
		logger.info("Name was entered successfully");
		clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneField);
		sendText(pomFactory.retailAccountPage().phoneField, phoneNumber);
		logger.info("Phone Number was entered successfully");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(pomFactory.retailAccountPage().updateBttn);
		logger.info("Update button was clicked successfully");
	}

	// Add Payment Method

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(pomFactory.retailAccountPage().addAPaymentMethodLink);
		logger.info("Add Payment Method link was clicked successfully");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(pomFactory.retailAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
		sendText(pomFactory.retailAccountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(pomFactory.retailAccountPage().expirationMonthField,
				paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(pomFactory.retailAccountPage().expireationYearField,
				paymentInfo.get(0).get("expirationYear"));
		sendText(pomFactory.retailAccountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
		logger.info("Payment Information was entered successfully");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(pomFactory.retailAccountPage().paymentSubmitBtn);
		logger.info("Payment Method Submit bttn clicked successfully");
	}

	// Edit Payment Method

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(pomFactory.retailAccountPage().editCardButton);
		logger.info("User clicked on Edit option of card section");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
		Map<String, String> cardData = cardInfo.get(0);
		WebElement cardNumberInput = pomFactory.retailAccountPage().addNewCardNumber;
		WebElement nameOnCardInput = pomFactory.retailAccountPage().addNewName;
		WebElement expirationMonthInput = pomFactory.retailAccountPage().addNewExpirationMonth;
		WebElement expirationYearInput = pomFactory.retailAccountPage().addNewExpirationYear;
		WebElement securityCodeInput = pomFactory.retailAccountPage().addNewSecurityCode;

		waitTillPresence(cardNumberInput);
		cardNumberInput.clear();
		sendText(cardNumberInput, cardData.get("cardNumber"));
		nameOnCardInput.clear();
		sendText(nameOnCardInput, cardData.get("nameOnCard"));
		sendText(expirationMonthInput, cardData.get("expirationMonth"));
		sendText(expirationYearInput, cardData.get("expirationYear"));
		securityCodeInput.clear();
		sendText(securityCodeInput, cardData.get("securityCode"));

		logger.info("User edited card information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(pomFactory.retailAccountPage().updateCardButton);
		logger.info("User clicks on Update Your Card button");
	}

	// Remove Payment Method

	@When("User click on debit or credit card ending in {string}")
	public void userClickOnDebitOrCreditCardEndingIn(String cardLastDigits) {
		WebElement cardLink = getDriver().findElement(By.xpath("//p[text()='" + cardLastDigits + "']"));
		click(cardLink);
		logger.info("User clicked on card ending in " + cardLastDigits);
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(pomFactory.retailAccountPage().removeButton);
		logger.info("User clicked on remove button");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(pomFactory.retailAccountPage().cardNumberField));
		logger.info("Payment details have been removed");
	}

	// Add Address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(pomFactory.retailAccountPage().addAddressLink);
		logger.info("Add Address Link was clicked successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(pomFactory.retailAccountPage().addressCountryDropdown, addressInfo.get(0).get("country"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressNameField);
		sendText(pomFactory.retailAccountPage().addressNameField, addressInfo.get(0).get("fullName"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressPhoneField);
		sendText(pomFactory.retailAccountPage().addressPhoneField, addressInfo.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressStreetField);
		sendText(pomFactory.retailAccountPage().addressStreetField, addressInfo.get(0).get("streetAddress"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressApartmentNum);
		sendText(pomFactory.retailAccountPage().addressApartmentNum, addressInfo.get(0).get("apt"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressCityField);
		sendText(pomFactory.retailAccountPage().addressCityField, addressInfo.get(0).get("city"));
		selectByVisibleText(pomFactory.retailAccountPage().addressStateDropdown, addressInfo.get(0).get("state"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().addressZipCodeField);
		sendText(pomFactory.retailAccountPage().addressZipCodeField, addressInfo.get(0).get("zipCode"));
		logger.info("Address form was filled out successfully");
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(pomFactory.retailAccountPage().addYourAddressButton);
		logger.info("Add Address Button was clicked successfully");
	}

	// Edit Address

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(pomFactory.retailAccountPage().editAddressButton);
		logger.info("User clicked on edit adress option");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(pomFactory.retailAccountPage().updateAddressButton);
		logger.info("User clicks on update Your Address button");
	}

	// Remove Address

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(pomFactory.retailAccountPage().removeAddressButton);
		logger.info("User clicked on remove option of Address section");

	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		if (!isElementDisplayed(pomFactory.retailAccountPage().removeAddressButton)) {
			logger.info("Address details were removed");
		} else {
			logger.info("Address details were not removed");
		}
	}
}