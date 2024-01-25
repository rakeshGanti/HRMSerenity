package StepDefinitions;

import Steps.DashBoardSteps;
import Steps.HomePageSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class loginPageDefinitions {
	
	@Steps
	HomePageSteps homepagesteps;
	
	@Steps
	DashBoardSteps dashboardsteps;

	@Given("OrangeHRM website is launched in browser")
	public void orange_hrm_website_is_launched_in_browser() {
		homepagesteps.openApplication();
	}


	@Given("user enters the username {}")
	public void user_enters_the_username(String userName) {
	    homepagesteps.enterUsername(userName);
	}

	@Given("user enters the wrong password {}")
	public void user_enters_the_wrong_password(String enterPassword) {
	    homepagesteps.enterPassword(enterPassword);
	}

	@Then("user clicks submit button")
	public void user_clicks_submit_button() {
	    homepagesteps.clickLoginButton();
	}
	@Given("user enters the correct password {}")
	public void user_enters_the_correct_password(String correctPass) {
	    // Write code here that turns the phrase above into concrete actions
	    homepagesteps.enterCorrectPassword(correctPass);
	}

	@Given("user verifies whether dashboard page opened.")
	public void user_verifies_whether_dashboard_page_opened() {
	    // Write code here that turns the phrase above into concrete actions
		dashboardsteps.verifyDashboard();
	}

	@Given("user verifies the error message.")
	public void user_verifies_the_error_message() {
		dashboardsteps.verifyAdmin();
	}
}
