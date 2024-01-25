package Steps;

import Pages.OrangeHRMDashboardPage;
import net.thucydides.core.annotations.Step;

public class DashBoardSteps {
	OrangeHRMDashboardPage dashboard;
	
	@Step
	public void verifyAdmin() {
		dashboard.loginVerified();
		
	}
	@Step
	public void verifyDashboard() {
		dashboard.checkDashboard();
		
	}

}
