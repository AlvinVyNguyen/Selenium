package loginPagePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("Login");
	
	public LoginPage(WebDriver driver)
	{
		/* Initializes WebDriver */
		this.driver = driver;
	}
	
	public void loginToSalesForce(String userID, String userPass)
	{
		driver.findElement(username).sendKeys(userID);
		driver.findElement(password).sendKeys(userPass);
		driver.findElement(loginButton).click();
	}
	
}
