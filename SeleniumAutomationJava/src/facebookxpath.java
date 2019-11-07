import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://facebook.com");
//		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my ownxpath");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("[value='Log in']")).click(); //no tag name is like /* in XPath
	}

}
