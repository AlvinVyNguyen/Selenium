import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//TestNG is one of the testing framework
import org.testng.Assert;

public class Test_Assertions_54 {

	public static void main(String[] args) throws InterruptedException {
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
		
		//count the number of checkboxes
		//remember if you need multiple, you need findelementS not findelement
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("hrefIncAdt")).click();
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++; 
		}
		//to write the for loop in a line
		//for(int i=1, i<5, i++)
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		//System.out below is for testing purposes to get text
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
