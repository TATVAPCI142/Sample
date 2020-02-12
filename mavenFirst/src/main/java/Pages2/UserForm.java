package Pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserForm {

	public static WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"FirstName\"]")
	WebElement txt_firstName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"MiddleName\"]")
	WebElement txt_lastName;

	public UserForm(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void EnterFormDetails()
	{
		txt_firstName.sendKeys("Ankit");
		txt_lastName.sendKeys("Mehta");
	}

	
	public void waitSmall()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
