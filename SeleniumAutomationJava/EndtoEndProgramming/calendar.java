import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		//August 23
		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		//! is a negation, makes true false or vice versa
		while(!month.getText().contains("August 2020"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		//Webelement has to be list for driver.findElementS
		//List<WebElement> dates = driver.findElements(By.cssSelector("td[class*='day']"));
		//grab common attribute//Put into list and iterate
		int count= driver.findElements(By.cssSelector("td[class*='day']")).size();
		for (int i =0; i < count; i++)
		{
			String text = driver.findElements(By.cssSelector("td[class*='day']")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();
				break;
			}
		}
		
	}

}
