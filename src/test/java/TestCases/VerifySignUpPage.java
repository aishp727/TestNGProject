package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjects;
import Resources.BaseClass;

public class VerifySignUpPage extends BaseClass {
	

	@Test
	public void LaunchBrowser1() throws IOException {
		driver = InitializeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		SignupPageObjects obj1 = new SignupPageObjects(driver);
		obj1.EnterFName().sendKeys("Aishwarya");
		obj1.EnterLname().sendKeys("Patil");
		obj1.EnterJobTitle().sendKeys("Intern");
		obj1.EnterEmail().sendKeys("ap12@gmail.com");
		obj1.EnterPhone().sendKeys("1234565434");
		// Select sel = new  Select(EmployeeNo);
		// sel.selectByVisibleText("1-20 employees");
		obj1.CompanyName().sendKeys("absc");
		//obj1.CheckBox().click();
		obj1.ClickSignup().click();
		
	}
}
