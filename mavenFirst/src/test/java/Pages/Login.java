package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.*;

public class Login {
	public static WebDriver driver;
	// http://executeautomation.com/demosite/Login.html
	@FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]/p[1]/input")
	WebElement txt_userName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]/p[2]/input")
	WebElement txt_password;
	
	@FindBy(how = How.XPATH, using = "//*[@name=\"Login\"]/p[3]/input")
	WebElement btn_Login;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String username, String password) {

		txt_userName.sendKeys(username);
		txt_password.sendKeys(password);
		btn_Login.click();

	}

}
