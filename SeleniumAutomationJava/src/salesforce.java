import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("test");
		//the following code gives error as class name has spaces
		//driver.findElement(By.className("button r4 wide primary")).click();
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("#rememberUn")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//driver.close();
		
	}

}
