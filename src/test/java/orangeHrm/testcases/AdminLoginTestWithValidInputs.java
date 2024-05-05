package orangeHrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestWithValidInputs extends AppUtils

{
	
	@Parameters({"adminid","adminpwd"})
	@Test
	public void checkAdminLogin(String uid, String pwd) {
		
	LoginPage lp = new LoginPage();
	
	lp.login(uid, pwd);
	
	boolean res = lp.isAdminModuleDisplayed();
	
	Assert.assertTrue(res);
	
	lp.logOut();
	
	
		
		
	}

}
