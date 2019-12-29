package selectOptionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectOption {
	
	WebDriver driver;
	
	public SelectOption(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectAccountOption(String option)
	{
		driver.findElement(By.cssSelector("input[title='"+option+"']")).click();
		
	}
	
}
