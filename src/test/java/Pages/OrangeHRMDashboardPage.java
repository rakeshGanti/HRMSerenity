package Pages;

import static org.junit.Assert.assertArrayEquals;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHRMDashboardPage extends PageObject{

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElementFacade errorMsg;
	public void loginVerified() {
		String errorMessage = errorMsg.getText();
		System.out.println("error message is: "+errorMessage);
		Assert.assertEquals("Invalid credentials", errorMessage);
		 
	}
	public void checkDashboard() {
		String dashboardTitle = getDriver().getTitle();
		System.out.println("The title of dashboard is: "+dashboardTitle);
		
	}
}
