package orangeHrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHrm.library.AdminUtils;
import orangeHrm.library.NewEmployeeRegistration;

public class EmployeeRegistrationTest extends AdminUtils
{

	@Parameters({"Fname","Lname"})
	@Test
	public void checkEmpReg(String Fname,String Lname) {

		NewEmployeeRegistration emp = new NewEmployeeRegistration();


		boolean res = emp.addEmployee(Fname,Lname);

		Assert.assertTrue(res);
	}
}
