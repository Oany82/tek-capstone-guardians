package tek.sdet.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	@When("User click an All section")
	public void userClickOnAllSection() {
		click(pomFactory.homePage().allOptions);
		logger.info("All Options dropdowns was clicked");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {

		List<List<String>> shopByDepartment = dataTable.asLists(String.class);
		for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(
					"//div[@class='sidebar__content']//span[text()='" + shopByDepartment.get(0).get(i) + "']"))));
			logger.info("Option " + shopByDepartment.get(0).get(i) + " is displayed");
		}
	}

	@When("User on {string}")
	public void userOnElectronics(String departament) {
		List<WebElement> dept = pomFactory.homePage().sideBar;
		for (WebElement element : dept) {
			if (element.getText().equals(departament))
				element.click();
			break;
		}

	}

	@Then("Below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departamentOptions = dataTable.asLists(String.class);
		List<WebElement> dept = pomFactory.homePage().sideBar;
		for (int i = 0; i < departamentOptions.get(0).size(); i++) {

			for (WebElement element : dept) {

				if (element.getText().equals(departamentOptions.get(0).get(i))) {

					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + " is present ");
				}
			}
		}
	}
}
