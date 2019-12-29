import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import loginPagePackage.LoginPage;
import selectAccountPackage.SelectAccount;
import selectOptionPackage.SelectOption;

public class TestNG_Call_Report {

	@Test
	public void callReport() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		
		LoginPage login = new LoginPage(driver);
		login.loginToSalesForce("bb67@bb2.com", "bugb1234");
		
		
		SelectAccount account = new SelectAccount(driver);
		account.selectMyAccount("Adams, Bob");
		
		
		SelectOption option = new SelectOption(driver);
		option.selectAccountOption("Record A Call");
		
		/* Verifies if a Call Report Page is displayed */
		driver.findElement(By.xpath("//h2[contains(text(), 'New Call Report')]")).isDisplayed();
		
	}

}
