package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinBtn")
	public WebElement signIn;

	@FindBy(xpath = "//div[@class = 'sidebar_content-item']/span")
	List<WebElement> sideBar;

}
