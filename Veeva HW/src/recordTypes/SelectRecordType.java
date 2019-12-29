package recordTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRecordType {
	
	
By recordSelect = By.id("RecordTypeId");
By save = By.cssSelector("input[name='Save']");
By checkPageSubmission = By.cssSelector("h2[class='pageDescription ng-binding']");

	
	WebDriver driver;

	public SelectRecordType (WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void selectRecord (String recordToBeSelected)
	{
		Select recordTypeDropdown = new Select(driver.findElement(recordSelect));
		recordTypeDropdown.selectByVisibleText(recordToBeSelected);
	}
	
	public void saveRecordPage()
	{
		driver.findElement(save).click();
	    //checks for successful save using the generated Call ID that gets displayed when you save
	    driver.findElement(checkPageSubmission).isDisplayed();
	}
}
