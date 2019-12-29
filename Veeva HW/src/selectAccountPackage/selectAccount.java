package selectAccountPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectAccount {
	
	By iframe = By.tagName("iframe");
	
	WebDriver driver;
	public selectAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectMyAccount(String userAccount) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'My Accounts')]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(By.xpath("//a[contains(text(),'"+userAccount+"')]")).click();
		driver.switchTo().defaultContent();
	}
	

}
