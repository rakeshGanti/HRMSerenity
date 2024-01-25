package Steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.OrangeHRMHomePage;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class HomePageSteps extends PageObject {
	
	OrangeHRMHomePage homePage;

	
	@Step
	public void enterUsername(String userName) {
		homePage.enterUName(userName);
	}
	
	@Step
	public void enterPassword(String passWord) {
		homePage.enterPassword(passWord);
	}
	
	@Step
	public void clickLoginButton() {
		homePage.clickSubmit();
		
	}

	@Step
	public void openApplication() {
		homePage.open();
	}

	@Step
	public void enterCorrectPassword(String correctPass) {
		homePage.enterCorrectPassword(correctPass);
		
	}


	
}
