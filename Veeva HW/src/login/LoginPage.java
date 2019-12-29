package login;
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
	
	/* This method logs into the page using the userID and userPass */
	public void salesForceLogin(String userID, String userPass)
	{
		/* Sets the user and pass on the login page */
		driver.findElement(username).sendKeys(userID);
		driver.findElement(password).sendKeys(userPass);
		/* Clicks the login button after the user and pass are set */
		driver.findElement(loginButton).click();
	}
	
}
