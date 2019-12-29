package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Call_Report_Main {

	public static void main(String[] args) throws InterruptedException {
		//need to set where your chromedriver is located, dont need the line 8 if your using firefox
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		//initializes the chromedriver
		WebDriver driver = new ChromeDriver();
		//sets implicit wait to 20seconds, as some pages of the website take awhile to load.
		//This wait is applied globally.
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//gets the url and opens it in the chrome browser
		driver.get("https://login.salesforce.com/");
		//line 16 is not needed, but I like to have my windows maximized
		driver.manage().window().maximize();
		//locates both the username and password box using xpath and sends in the information needed to login
		driver.findElement(By.id("username")).sendKeys("bb67@bb2.com");
		driver.findElement(By.id("password")).sendKeys("bugb1234");
		//finds the login button and clicks it
		driver.findElement(By.id("Login")).click();
		//after logging in, locates the my accounts tab and clicks it.
		driver.findElement(By.xpath("//a[contains(text(),'My Accounts')]")).click();
		//below is needed, implicit explicit wont work
		Thread.sleep(1000);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//a[contains(text(), 'Adams, Bob')]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("input[title='Record a Call']")).click();
		driver.findElement(By.xpath("//h2[contains(text(), 'New Call Report')]")).isDisplayed();
		
		
		//Selects the record type dropdown
		Select recordTypeDropdown = new Select(driver.findElement(By.id("RecordTypeId")));
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
		
	    WebElement qnaslCoPay = driver.findElement(By.id("chka00U0000006DqzyIAC"));
	    qnaslCoPay.click();
	    //selects qnaslcopay box and sends the required number in
	    driver.findElement(By.cssSelector("input[ng-model='row.data.Quantity_vod__c']")).sendKeys("2");
	    driver.findElement(By.cssSelector("input[name='Save']")).click();
	    //checks for successful save using the generated Mass Add Promo Call ID that gets displayed when you save
	    driver.findElement(By.cssSelector("h2[class='pageDescription ng-binding']")).isDisplayed();
	    driver.findElement(By.id("userNav-arrow")).click();
	    driver.findElement(By.cssSelector("a[title='Logout']")).click();

	}

}
