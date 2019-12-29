package testCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import homePage.HomePage;
import login.LoginPage;
import recordTypes.MassAddPromoCall;
import recordTypes.SelectRecordType;

public class TestNG_Call_Report {
	
	static WebDriver driver;
	
	/* Runs before all test methods in this class have been run */
	@BeforeMethod
	public void beforeMethod()
	{
		/* Initializes the Chrome Driver using the location of where the chromedriver.exe is stored*/
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/* Sets implicit wait to 40secs, as some steps of the testcase take awhile to load */
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		/* Maximizes the window and gets the url */
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}
	
	/* @Test marks this method as part of the test */
	@Test
	public void callReport() throws InterruptedException
	{
		/* Logins to the url page with the given user and pass */
		LoginPage login = new LoginPage(driver);
		login.salesForceLogin("bb67@bb2.com", "bugb1234");
		
		
		/* HomePage has multiple methods that navigates through the website's homepage */
		HomePage homePage = new HomePage(driver);
		
		
		/* Clicks the MyAccounts Tab and selects the wanted account */
		homePage.selectMyAccount("Adams, Bob");
		
		/* Selects the wanted option present to each account  */
		homePage.selectAccountOption("Record a Call");
		
		/* Verifies if a Call Report Page is displayed */
		driver.findElement(By.xpath("//h2[contains(text(), 'New Call Report')]")).isDisplayed();
		
		/* Selects the wanted record type in the Record Type dropdown box */
		SelectRecordType recordType = new SelectRecordType(driver);
		recordType.selectRecord("Mass Add Promo Call");		
		
		/* MassAddPromoCall has methods which navigate through the Mass Add Promo Call page when that record type has been selected */
		MassAddPromoCall massAddPromoCall = new MassAddPromoCall(driver);
		
		/* This list has the wanted items to be checked off in Detailing Priority in the Mass Add Promo Call page */
		String[] detailPriorityList = {"Cholecap", "Labrinone"};
		
		/* Goes through the detailPriorityList and selects the checkbox for each item in the list */
		massAddPromoCall.selectDetailPriorityItems(detailPriorityList);
		
		/* Verifies that the order of the items selected in the detailPrioritylist
		 * matches the order that items appear in the Call Discussion Products section 
		 */
		massAddPromoCall.verifyOrderOfCallDiscussionProducts(detailPriorityList);
		
		/* Selects the QNASL Co-Pay Card option in Samples And Promotional Items 
		 * and is passed the amount of the item that it needs
		 */
		massAddPromoCall.selectQNASLCoPayAmount("2");
		
		/* Saves the record Page */
		recordType.saveRecordPage();
		
		/* Logouts the user */
		homePage.logoutUser();
		
	}
	
	/* Runs after all tests in this suite have been run */
	@AfterMethod
	public void afterMethod()
	{
		/* Quits the WebDriver */
		driver.quit();
	}

}
