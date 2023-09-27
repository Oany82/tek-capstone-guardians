package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class CommonSteps extends CommonUtility {
	POMFactory pomFactory = new POMFactory();

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
		if (expectedMssg.contains("Personal Information Updated Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Payment Method added")) {
			waitTillPresence(pomFactory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Address Added Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().addAddressSuccessMsg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().addAddressSuccessMsg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().updateCardSuccessMsg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().updateCardSuccessMsg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Address Updated Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().updateAddressSuccessMsg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().updateAddressSuccessMsg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Order Placed, Thanks")) {
			waitTillPresence(pomFactory.retailOrderPage().orderPlacedMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailOrderPage().orderPlacedMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Your Shopping Cart is Empty")) {
			waitTillPresence(pomFactory.retailOrderPage().emptyCartMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailOrderPage().emptyCartMssg.getText());
			logger.info("Expected Message: " + expectedMssg);	
		} else if (expectedMssg.contains("Your Order Has Been Cancelled")) {
			waitTillPresence(pomFactory.retailOrderPage().orderCancelledMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailOrderPage().orderCancelledMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Return was successfull")) {
			waitTillPresence(pomFactory.retailOrderPage().returnSuccessMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailOrderPage().returnSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Your review was added successfully")) {
			waitTillPresence(pomFactory.retailOrderPage().reviewAddMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailOrderPage().reviewAddMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else {
			Assert.fail("Expected message not implemented");
		}
	}
}
