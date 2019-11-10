package test;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver = null; //this makes it so you dont have to do WebDriver driver all the time
	 
	@Test
	public void Login() throws IOException
	{
		//USED AS A GLOBAL METHOD
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Alvin Nguyen\\git\\Selenium\\TestNG\\src\\test\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("chrome"))
		{
			//WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver(); //defined public WebDriver driver = null on top, so dont have to retype WebDriver
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			//WebDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
			
	}

}
