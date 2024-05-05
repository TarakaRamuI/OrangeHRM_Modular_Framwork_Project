package orangeHrm.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class EmpUtils extends AppUtils
{
	LoginPage lp;
	
	String Userid = "maxpayne";
	String Userpwd = "Maxpayne@123!@#";
	
	@BeforeTest
	public void empLogin() {
		
		lp = new LoginPage();
		
		lp.login(Userid, Userpwd);
		
	
	}
	
	@AfterTest
	public void logout() {
		
		lp.logOut();
	}

}
