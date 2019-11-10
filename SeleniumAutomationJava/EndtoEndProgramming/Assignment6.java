import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//1. select any checkbox in checkbox example
		//2. grab label of selected checkbox, hint: put it in a variable
		//3. Select an option in dropdown. This option should come from step 2. No hard code
		//4. Enter the step 2 grabbed label text into Switch To Alert Example textbox. DO NOT use sendkeys("option2"). no hard code.
		//5. Click Alert and then verify if text grabbed from step 2 is present in the pop up message
		WebElement checkboxclick = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkboxclick.click();
		String text = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropdown.selectByValue(text.toLowerCase());
		WebElement SwitchToAlert = driver.findElement(By.xpath("//input[@id='name']"));
		SwitchToAlert.sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertext = driver.switchTo().alert().getText();
		if(alertext.contains(text))
		{
			Assert.assertTrue(true);
		}
		
	}

}
/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment {
public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropdown);
        s.selectByVisibleText(opt);
        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();
     if(text.contains(opt))
     {
    System.out.println("Alert message success");
     }
    else
    System.out.println("Something wrong with execution");

}

}
*/
