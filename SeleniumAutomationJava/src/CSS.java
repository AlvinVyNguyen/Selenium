import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax for XPath = //tagname[@attribute='value']
		//Syntax for CSS == tagnam[attribute='value']
		// div[class='identity first'] - CSS
		// [class='identity first'] - this will also identify in CSS if you dont need tag name
		// div[@class='identity first'] - XPath
		// //*[@class='identity first'] - will identify in XPath
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("username");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("[id='Login']")).click();
	}

}
