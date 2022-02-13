package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	public WebDriver driver;
	
	By Fname=(By.xpath("//input[@name='UserFirstName']"));
	By Lname=(By.xpath("//input[@name='UserLastName']"));
	By JbTitle=(By.xpath("//input[@name='UserTitle']"));
	By Email=(By.xpath("//input[@name='UserEmail']"));
	By PhoneNo=(By.xpath("//input[@name='UserPhone']"));
	By Employees=(By.xpath("//select[@id='CompanyEmployees-jh2D']"));
	By Company=(By.xpath("//input[@name='CompanyName']"));
	By Country=(By.xpath("//input[@name='CompanyCountry']"));
	By Check=(By.xpath("//input[@name='SubscriptionAgreement']"));
	By signup=(By.xpath("//button[@type='submit']"));
	
	
	

		public SignupPageObjects(WebDriver driver2) {
			this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
		public WebElement EnterFName() {
			return driver.findElement(Fname);
		}
		public WebElement EnterLname() {
			return driver.findElement(Lname);
		}
		
		public WebElement EnterJobTitle() {
			return driver.findElement(JbTitle);
		}
		
		public WebElement EnterEmail() {
			return driver.findElement(Email);
		}
		public WebElement EnterPhone() {
			return driver.findElement(PhoneNo);
		}
		public WebElement EmployeeNo() {
			return driver.findElement(Employees);
		}
		public WebElement CompanyName() {
			return driver.findElement(Company);
		}
		public WebElement SelectCountry() {
			return driver.findElement(Country);
		}
		public WebElement CheckBox() {
			return driver.findElement(Check);
		}
		public WebElement ClickSignup() {
			return driver.findElement(signup);
		}

	}



