import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Java_Alerts_Using_Selenium_Webdriver_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Alvin";
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		//can also do sysout + ctrl+space to do system.out.println easier
		//prints out the alert text
		System.out.println(driver.switchTo().alert().getText());
		//accepts the alert click
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//dismiss the alert by clicking cancel or no
		driver.switchTo().alert().dismiss();
		
	}

}
