package massAddPromoItemsPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class massAddPromoItems {
	
	WebDriver driver;

	public massAddPromoItems (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void addItems(String[] itemsList)
	{
		for(int i=0; i < itemsList.length ;i++)
		{
			WebElement checkBoxTest = driver.findElement(By.cssSelector("input[name='"+itemsList[i]+"']"));
			checkBoxTest.click();
			//below checks subsection/detail priority if it appears, this xpath only points to the subsections, using td
			driver.findElement(By.xpath("//td[contains(text(),'"+itemsList[i]+"')]")).isDisplayed();
		}
	}
	
	/*
	 * Select recordTypeDropdown = new Select(driver.findElement(By.id("RecordTypeId")));
		recordTypeDropdown.selectByVisibleText("Mass Add Promo Call");
		String[] itemsToBeSelected = {"Cholecap", "Labrinone"};
		for(int i=0; i < itemsToBeSelected.length ;i++)
		{
			WebElement checkBoxTest = driver.findElement(By.cssSelector("input[name='"+itemsToBeSelected[i]+"']"));
			checkBoxTest.click();
			//below checks subsection/detail priority if it appears, this xpath only points to the subsections, using td
			driver.findElement(By.xpath("//td[contains(text(),'"+itemsToBeSelected[i]+"')]")).isDisplayed();
		}
		
		
		//checks if the product in call Discussion matches the index of the selected values
		List<WebElement> callDiscussion = driver.findElements(By.cssSelector("select[ng-model='discussion.productKey']"));
		for(int i=0; i < itemsToBeSelected.length ; i++)
		{
			Select callDiscussionProduct = new Select(callDiscussion.get(i));
			WebElement option = callDiscussionProduct.getFirstSelectedOption();
			String defaultSelection = option.getText();
			if(defaultSelection.equals(itemsToBeSelected[i]))
			{
				continue;
			}
			else
			{
				throw new java.lang.RuntimeException("The product selected did not match the order it was selected in");
			}
		}
	 */

}
