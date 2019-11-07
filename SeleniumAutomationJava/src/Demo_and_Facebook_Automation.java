import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_and_Facebook_Automation {

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
	    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\A T\\Desktop\\Eclipse\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		/*
		driver.get("http://google.com");
		//webdriver.chrome.driver, webdriver.gecko.driver, etc
		//ex: webdriver.chrome.driver, with path C:\Users\A T\Desktop\Eclipse\ChromeDriver\chromedriver.exe
		//rahulonlinetutor@gmail.com
		driver.getCurrentUrl(); //hit url on browser
		System.out.println(driver.getTitle()); //validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); // validate if you are landed on the correct url
		
		//System.out.println(driver.getPageSource()); //how to print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.close(); //closes current browser
		//driver.quit(); //Closes all browsers opened by Selenium Script
		*/
		
		 //Auto filling text boxes, etc
		 System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://facebook.com"); //URL in the browser
		 driver.findElement(By.id("email")).sendKeys("This is my first code");
		 driver.findElement(By.name("pass")).sendKeys("Test");
		 driver.findElement(By.linkText("Forgot account?")).click();
		 //driver.close();
		
	}

}
