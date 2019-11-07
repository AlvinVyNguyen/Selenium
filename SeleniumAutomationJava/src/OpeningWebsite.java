import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//selenium code - 
		
		//Create Driver object
		
		//We will strictly implement methods of webdriver
		
		/* Class name = X
		 
		 	X driver = new X(); <- object for class name X
		 	 */
		
		//invoke .exe file first
		//to set property
		
		//get gecko driver
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\A T\\Desktop\\Eclipse\\GeckoDriver\\Geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mozilla.org");
		//webdriver.chrome.driver, webdriver.gecko.driver, etc
		//ex: webdriver.chrome.driver, with path C:\Users\A T\Desktop\Eclipse\ChromeDriver\chromedriver.exe
		System.out.println(driver.getTitle());
		//rahulonlinetutor@gmail.com
	}

}

