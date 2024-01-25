package Pages;

import java.time.Duration;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class OrangeHRMHomePage extends PageObject {

	@FindBy(xpath="//input[@name='username']")
	WebElementFacade inputUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElementFacade inputPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElementFacade btnSubmit;
	@FindBy(xpath="//h6")
	WebElementFacade dashboardTitle;
	
	public void enterUName(String userName) {
		inputUserName.sendKeys(userName);
	}
	public void enterPassword(String passWord) {
		inputPassword.sendKeys(passWord);
	}
	public void clickSubmit() {
		btnSubmit.click();
	}
	public void enterCorrectPassword(String correctPass) {
		inputPassword.sendKeys(correctPass);
		
	}
	
	
	
}
