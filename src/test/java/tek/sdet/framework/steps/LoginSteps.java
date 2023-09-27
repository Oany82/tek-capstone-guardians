package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class LoginSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	@Given("User is on retail website homepage")
	public void userIsOnRetailWebsiteHomepage() {
		Assert.assertTrue(pomFactory.homePage().tekschoolLogo.isDisplayed());
		logger.info("TEKSCHOOL logo is displayed");
	}

	@When("User clicks on the Sign in link")
	public void userClicksOnTheSignInLink() {
		click(pomFactory.loginPage().signInLink);
		logger.info("User clicked on sign in link");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String username, String password) {
		sendText(pomFactory.loginPage().emailText, username);
		logger.info("User entered email address");
		sendText(pomFactory.loginPage().passwordText, password);
		logger.info("User entered password");
	}

	@When("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
		click(pomFactory.loginPage().loginButton);
		logger.info("User clicked on login button");
	}

	@Then("User should be logged in to the Account")
	public void userShouldBeLoggedInToTheAccount() {
		Assert.assertTrue(pomFactory.loginPage().logoutButton.isDisplayed());
		logger.info("User sees the logout button");
	}

	@When("User clicks on the create new account link")
	public void userClicksOnTheCreateNewAccountLink() {
		click(pomFactory.loginPage().newAccountLink);
		logger.info("User clicked on create new account button");
	}

	@When("User fills the signUp information with below data")
	public void userFillsTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<List<String>> signupDetails = dataTable.asLists(String.class);
		sendText(pomFactory.loginPage().nameInput, signupDetails.get(1).get(0));
		logger.info("User entered name: " + signupDetails.get(1).get(0));
		sendText(pomFactory.loginPage().emailInput, signupDetails.get(1).get(1));
		logger.info("User entered email: " + signupDetails.get(1).get(1));
		sendText(pomFactory.loginPage().passwordInput, signupDetails.get(1).get(2));
		logger.info("User entered password: " + signupDetails.get(1).get(2));
		sendText(pomFactory.loginPage().confirmPasswordInput, signupDetails.get(1).get(3));
		logger.info("User entered confirm password: " + signupDetails.get(1).get(3));
	}

	@When("User clicks on the signUp button")
	public void userClicksOnTheSignUpButton() {
		click(pomFactory.loginPage().signupButton);
		logger.info("User clicked on signup button");
	}

	@Then("User should be logged into the account page")
	public void userShouldBeLoggedIntoTheAccountPage() {
		Assert.assertTrue(pomFactory.loginPage(). accountInfoUsernamelabel.isDisplayed());
		logger.info("User sees the  account info Username");
	}

	}

