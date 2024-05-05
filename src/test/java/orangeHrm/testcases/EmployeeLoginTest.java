package orangeHrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHrm.library.EmpUtils;
import orangeHrm.library.LoginPage;



public class EmployeeLoginTest extends EmpUtils
{

	@Parameters({"userid","userpwd"})
	@Test
	public void checkNewUserLogin( ) {

		LoginPage lp = new LoginPage();
		
		boolean res = lp.isEmployeeModuleDisplayed();

		Assert.assertTrue(res);
		
		
		
	

	}
	
}
