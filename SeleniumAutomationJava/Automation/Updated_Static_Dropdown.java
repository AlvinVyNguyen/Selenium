import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_Static_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Eclipse\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		//System.out below is for testing purposes to get text
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
		//System.out below is for testing purposes to get text
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
