import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cleartrip.com");
		//uses select class to add adults & children because they have static drop down
		Select a = new Select(driver.findElement(By.id("Adults")));
		a.selectByValue("7");
		Select c = new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("2");
		driver.findElement(By.id("DepartDate")).click();
		//below did not work had to use xpath
		//driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active ")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("SouthWest");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
	}

}
