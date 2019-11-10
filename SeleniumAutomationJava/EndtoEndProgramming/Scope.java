import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//1. Give count of links on the page.
		//any link on a page will have the tag "a"
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. Give count of links on footer section
		//below is how to specify specific areas you watn to count, in  this case the footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limits webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. Give count of links on the first column of footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on each link in the column and check if the pages are opening
		//use i=1 instead of =0 because we just want the links under the title of footer section
		for(int i = 1; i< columndriver.findElements(By.tagName("a")).size(); i++)
		{
			//keys.chord allows you to do multiple keys presses
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			//passes the string clickonlinktab, which ctrl clicks to each link
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(2000);
		}
			Set<String> abc = driver.getWindowHandles(); //gets 4
			Iterator<String> it = abc.iterator(); //moves to each window
			while(it.hasNext()) //while there is still a next index, move to next one
			{
				driver.switchTo().window(it.next()); //switches to windows, and navigates to next one
				System.out.println(driver.getTitle());
			}
		
	}

}
