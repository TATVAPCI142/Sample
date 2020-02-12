package Test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import Pages.Login;
import Pages2.UserForm;

public class LoginTest {

	public static WebDriver driver;
	public ExtentReports extent = new ExtentReports();

	@BeforeTest
	public void beforeTest() {
		
		

		System.setProperty("webdriver.gecko.driver","E:\\Utility\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://executeautomation.com/demosite/Login.html");
		driver.manage().window().maximize();

	}

	@Test
	public void LoginTest() {

		
		ExtentTest test = extent.createTest("Test Name", "Sample description");

		Login login = PageFactory.initElements(driver, Login.class);
		login.login("admin", "admin");
		
		UserForm uderForm = PageFactory.initElements(driver, UserForm.class);
		uderForm.waitSmall();
		uderForm.EnterFormDetails();
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
