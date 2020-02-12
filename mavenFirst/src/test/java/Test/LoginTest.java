package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.Login;
import Pages2.UserForm;

public class LoginTest {

	public static WebDriver driver;
	public ExtentReports extent = new ExtentReports("E:\\Utility\\Selenium\\geckodriver-v0.26.0-win32\\Report.html");

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Utility\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://executeautomation.com/demosite/Login.html");
		driver.manage().window().maximize();

	}

	@Test
	public void LoginTest() {

		Login login = PageFactory.initElements(driver, Login.class);
		ExtentTest test = extent.startTest("Test Name", "Sample description");
		login.login("admin", "admin");

		UserForm uderForm = PageFactory.initElements(driver, UserForm.class);
		uderForm.waitSmall();
		uderForm.EnterFormDetails();
		test.log(LogStatus.PASS, "Step details");
		extent.endTest(test);
	}

	@AfterTest
	public void afterTest() {
		// driver.close();

		extent.flush();
	}

}
