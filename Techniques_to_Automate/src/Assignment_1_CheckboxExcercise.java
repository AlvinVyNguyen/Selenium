import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_1_CheckboxExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//Below commented is cleaner way to do .click
		//WebElement FCB = driver.findElement(By.id("checkBoxOption1"));
		//FCB.click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		//to get count, if multiple do findelementS and size
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}

//instructor solution
//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
//driver.findElement(By.id("checkBoxOption1")).click();
//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
//driver.findElement(By.id("checkBoxOption1")).click();
//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

//How to get the Count of number of check boxes present in the page
//driver.findElements(By.cssSelector("input[value='checkbox']")).size();


