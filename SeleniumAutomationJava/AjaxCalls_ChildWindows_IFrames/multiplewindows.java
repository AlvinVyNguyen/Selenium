import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles(); //identifies parent, stores it in 1st slot
		//in a string set
		//child windows get stored 2nd, 3rd, etc slot of table. 
		//In this case We only have 2 slots.
		Iterator<String> it = ids.iterator(); //This ID object is on the top of the string set
		//it.next(); //goes to first row, in this case parent window
		String parentid = it.next();
		String childid = it.next();
		//switches to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		//switch back to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}

}
