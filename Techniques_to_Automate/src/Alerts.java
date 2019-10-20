import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//div[@class='display']//form//input")).click();
		//use alerts if the popups are html (where you can get the xpath of them instead of using alerts
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //switch driver element to alert
		// .accept() clicks ok, yes, etc.
		// for cancelling use .dismiss()

	}

}
