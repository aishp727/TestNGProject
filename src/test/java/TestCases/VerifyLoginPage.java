package TestCases;
//Adding for git demo purpose
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class VerifyLoginPage extends BaseClass {
	@Test(dataProvider="Login")
	public void LaunchBrowser(String Username,String Password) throws IOException {
		driver=InitializeDriver();
		driver.get("https://login.salesforce.com/");
		LoginPageObjects obj=new LoginPageObjects(driver);
		obj.EnterUsername().sendKeys(Username);
		obj.EnterPassword().sendKeys(Password);
		obj.ClickLogin().click();
	}
	
	@DataProvider
	public Object[][] Login(){
		 //Array of object used to store values
		Object[][] data=new Object[2][2];
		data[0][0]="test1";
		data[0][1]="test123";
		data[1][0]="test2";
		data[1][1]="pass123";
		return data;
	}

}


//verify sign-up page