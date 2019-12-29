package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
By iframe = By.tagName("iframe");
By accountOptions = By.id("userNav-arrow");
By logoutOption = By.cssSelector("a[title='Logout']");
By myAccounts = By.xpath("//a[contains(text(),'My Accounts')]");
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/* This method selects the wanted account in the My Accounts list */
	public void selectMyAccount(String userAccount) throws InterruptedException
	{
		/* Selects the My Accounts Tab */
		driver.findElement(myAccounts).click();
		
		/* Uses thread.sleep in order for the webdriver to successfully switch iframes */
		Thread.sleep(1000);
		
		/* Switches to the iframe of where the accounts are located */
		driver.switchTo().frame(driver.findElement(iframe));
		
		/* Selects the wanted account in the list */
		driver.findElement(By.xpath("//a[contains(text(),'"+userAccount+"')]")).click();
		
		/* Switches out of the iframe */
		driver.switchTo().defaultContent();
	}
	
	/* This method selects the wanted Account Options */
	public void selectAccountOption(String option)
	{
		driver.findElement(By.cssSelector("input[title='"+option+"']")).click();
	}
	
	/* This methods logs out the user */
	public void logoutUser()
	{
	/* Selects the user navigation arrow in the top right */
	driver.findElement(accountOptions).click();
	
	/* Selects log out in the user navigation list */
    driver.findElement(logoutOption).click();
    
	}
	
	

}
