package orangeHrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHrm.library.AdminUtils;
import orangeHrm.library.NewUserRegistration;



public class UserRegistrationTest extends AdminUtils
{
	@Parameters({"rol","Emapname","Username","Password"})
	@Test
	public  void checkUserRegistration(String role, String Emapname,String Username,String Password) throws InterruptedException  {
		
		NewUserRegistration usr = new NewUserRegistration();
	
		boolean results = usr.addUser(role, Emapname, Username, Password);
		
		Assert.assertTrue(results);
	}
	
	

}
