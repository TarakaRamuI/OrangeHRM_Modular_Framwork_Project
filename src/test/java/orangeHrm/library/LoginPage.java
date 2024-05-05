package orangeHrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils
{

	public void login(String uid, String pwd) {


		//		AppUtils.driver.findElement(By.id("txtUsername")).sendKeys(uid);
		//		
		//		AppUtils.driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		//		
		//		AppUtils.driver.findElement(By.name("Submit")).click();

		driver.findElement(By.id("txtUsername")).sendKeys(uid);

		driver.findElement(By.id("txtPassword")).sendKeys(pwd);

		driver.findElement(By.name("Submit")).click();

	}

	public boolean isAdminModuleDisplayed() 
	{

		try 
		{

			driver.findElement(By.linkText("Admin")).isDisplayed();

			return true;

		}catch(Exception e) {

			return false;
		}
	}

	public boolean isErrormessageDisplayed() {


		String  errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();

		if(errmsg.contains("invalid") || errmsg.contains("empty")) {

			return true;
		}else {

			return false;
		}
	}
	public void logOut() {

		driver.findElement(By.partialLinkText("Welcome")).click();

		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	public boolean isEmployeeModuleDisplayed() {
		
		try {
			
			driver.findElement(By.linkText("Admin")).isDisplayed();
			
			return false;		
			
		}catch(Exception e) {
			
			
			return true;
		}
		
		
	}
	
	
}




