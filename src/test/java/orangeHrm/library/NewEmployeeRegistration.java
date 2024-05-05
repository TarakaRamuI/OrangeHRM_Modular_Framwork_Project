package orangeHrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class NewEmployeeRegistration extends AppUtils
{


	public boolean addEmployee(String Fname, String Lname) {


		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys(Fname);

		driver.findElement(By.id("lastName")).sendKeys(Lname);

		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.linkText("Employee List")).click();

		driver.findElement(By.id("empsearch_id")).sendKeys(empid);

		driver.findElement(By.id("searchBtn")).click();

		WebElement Emptable = driver.findElement(By.id("resultTable"));

		List<WebElement> rows =  Emptable.findElements(By.tagName("tr"));

		boolean isempexits = false;

		for(int i=1;i<rows.size();i++) 
		{

			List<WebElement> colms = rows.get(i).findElements(By.tagName("td"));

			if(colms.get(1).getText().equals(empid)) 
			{

				isempexits = true;
				break;				
			}

		}

		return isempexits;

	}
	
	
	

	//Here I am taking same method name but number of parameters are different Method overloading 

	public boolean addEmployee(String Fname,String Mname, String Lname ) {

		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Add Employee")).click();

		driver.findElement(By.id("firstName")).sendKeys(Fname);

		driver.findElement(By.id("middleName")).sendKeys(Mname);

		driver.findElement(By.id("lastName")).sendKeys(Lname);

		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.linkText("Employee List")).click();

		driver.findElement(By.id("empsearch_id")).sendKeys(empid);

		driver.findElement(By.id("searchBtn")).click();

		WebElement Emptable = driver.findElement(By.id("resultTable"));

		List<WebElement> rows =  Emptable.findElements(By.tagName("tr"));

		boolean isempexits = false;

		for(int i=1;i<rows.size();i++) 
		{

			List<WebElement> colms = rows.get(i).findElements(By.tagName("td"));

			if(colms.get(1).getText().equals(empid)) 
			{

				isempexits = true;
				break;				
			}

		}

		return isempexits;

	}


}
