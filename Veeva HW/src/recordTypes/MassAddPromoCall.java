package recordTypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MassAddPromoCall {
	
	By productBox = By.cssSelector("select[ng-model='discussion.productKey']");
	By qtyBox = By.cssSelector("input[ng-model='row.data.Quantity_vod__c']");
	By qnaslCoPay = By.id("chka00U0000006DqzyIAC");
	
	WebDriver driver;

	public MassAddPromoCall (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectDetailPriorityItems(String[] itemsList)
	{
		/* Clicks and checks subsection */
		for(int i=0; i < itemsList.length ;i++)
		{
			WebElement checkBox = driver.findElement(By.cssSelector("input[name='"+itemsList[i]+"']"));
			checkBox.click();
			driver.findElement(By.xpath("//td[contains(text(),'"+itemsList[i]+"')]")).isDisplayed();
		}
		
		
	}
	
	public void verifyOrderOfCallDiscussionProducts(String [] itemsList)
	{
		/* Grabs every product dropdown location when it appears after items are selected */
		List<WebElement> callDiscussion = driver.findElements(productBox);
		
		for(int i=0; i < itemsList.length ; i++)
		{
			Select callDiscussionProduct = new Select(callDiscussion.get(i));
			String defaultSelectedOption = callDiscussionProduct.getFirstSelectedOption().getText();
			if(defaultSelectedOption.equals(itemsList[i]))
			{
				continue;
			}
			else
			{
				throw new java.lang.RuntimeException("The product selected did not match the order it was selected in");
			}
		}
	}
	
	
	public void selectQNASLCoPayAmount(String amount)
	{
			driver.findElement(qnaslCoPay).click();
		    driver.findElement(qtyBox).sendKeys(amount);
	}
	
}
