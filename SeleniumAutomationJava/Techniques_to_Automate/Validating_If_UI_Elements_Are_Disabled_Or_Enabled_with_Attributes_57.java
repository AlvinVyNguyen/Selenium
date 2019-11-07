import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Validating_If_UI_Elements_Are_Disabled_Or_Enabled_with_Attributes_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true); //test will end here because the return value is not false
		//Assert.assertFalse(false); //this test will be successful
		driver.manage().window().maximize();
		//id* = general which finds any id with the value of SeniorCitizenDiscount
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		//below checks if the return calendar is enabled (should be disabled if one-way is selected)
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		//below checks the opacity which determines if it is disabled or enabled (specific for this website though)
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		//if statements need { not (
		{
			System.out.println("its enabled");
				Assert.assertTrue(true);
				
		}
		else
		{
			Assert.assertTrue(false);
		}
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
	}

}
