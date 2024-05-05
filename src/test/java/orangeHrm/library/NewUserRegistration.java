package orangeHrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class NewUserRegistration extends AppUtils
{


	public boolean addUser(String role, String Emapname,String Username,String Password) throws InterruptedException {

		driver.findElement(By.linkText("Admin")).click();

		driver.findElement(By.linkText("User Management")).click();

		driver.findElement(By.linkText("Users")).click();

		driver.findElement(By.id("btnAdd")).click();

		Select rolelist = new Select(driver.findElement(By.id("systemUser_userType")));
		rolelist.selectByVisibleText(role);

		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Emapname);

		driver.findElement(By.id("systemUser_userName")).sendKeys(Username);

		driver.findElement(By.id("systemUser_password")).sendKeys(Password);

		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(Password);

		Thread.sleep(3000);

		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(Username);

		driver.findElement(By.id("searchBtn")).click();


		WebElement Usertable = driver.findElement(By.id("resultTable"));

		List<WebElement> rows = Usertable.findElements(By.tagName("tr"));

		boolean isuserexits = false;
		for(int i=1;i<rows.size();i++) {

			List<WebElement> colms = rows.get(i).findElements(By.tagName("td"));

			if(colms.get(1).getText().equals(Username)) {

				isuserexits = true;
				break;
			}



		}
		
		return isuserexits;




	}



}





