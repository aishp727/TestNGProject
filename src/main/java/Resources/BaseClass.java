package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver InitializeDriver() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Aishu\\eclipse-workspace\\EndToEndDemo\\src\\main\\java\\Resources\\data.properties");
		Properties pro=new Properties();
		pro.load(file);
		String Browsername=pro.getProperty("Browser");
		if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Aishu\\OneDrive\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browsername.equals("Firefox")) {
			//Firefox Code
		}
		else if(Browsername.equals("Internet Explorer")) {
			//IE Code
		}
		return driver;
	}

}
