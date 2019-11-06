import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_Automation_using_all_UI_Elements_59 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		//selects starting destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		//selects end destination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//select calendar, dont need to fill in blank spaces with periods
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		//checks whether or not the calendar ui is enabled or is disabled by opacity
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
		{
		System.out.println("its disabled");
		Assert.assertTrue(true);
		}

		else
		{
		System.out.println("its enabled");	
		Assert.assertTrue(false);
		}
		//checks senior citizen discount 
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(1000);
		//goes through the static dropdown and selects 5 adults
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");

		//driver.findElement(By.id("btnclosepaxoption")).click();
		//checks if 5 adults was selected and prints out the vlaue of what is selected
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//same thing for adults but for USD
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("USD");
		//how to select css with id, you need # before id
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//how to select css with value
		//driver.findElement(By.cssSelector("input[value='Search']")).click();
		//how to select with xpath using value
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		

	}

}
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E_Automation_using_all_UI_Elements_59 {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='DEL']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
{
System.out.println("its disabled");
Assert.assertTrue(true);
}

else
{
Assert.assertTrue(false);
}

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000L);

for(int i=1;i<5;i++)
{
driver.findElement(By.id("hrefIncAdt")).click();
}

driver.findElement(By.id("btnclosepaxoption")).click();
Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
driver.findElement(By.cssSelector("input[value='Search']")).click();
// driver.findElement(By.xpath("//input[@value='Search']")).click();
// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
}



}
*/