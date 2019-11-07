import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSeggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.id("fromCity")).click();
		//source is a variable
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='fromCity']")).clear();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");
		//driver.findElement(By.id("fromCity")).sendKeys("Mum");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		source.sendKeys("Mum");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.sendKeys("Bang");
		Thread.sleep(1000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
	
	}

}
