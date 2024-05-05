package orangeHrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminUtils  extends AppUtils
{
	
	LoginPage lp;
	
	String AdminUid = "Admin";
	String AdminPwd = "Qedge123!@#";
	
	@BeforeTest
	public void adminLogin() {
		
		lp = new LoginPage();
		
		lp.login(AdminUid, AdminPwd);
		
	}
	
	@AfterTest
	public void loout() {
		
		lp.logOut();
	}

}
