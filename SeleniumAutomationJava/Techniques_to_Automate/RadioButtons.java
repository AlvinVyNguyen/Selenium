import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.manage().window().maximize(); //1 solution for not clickable at point(x,y) errors
		Thread.sleep(1000); //2 solution for not clickable at point(x,y) errors
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		//to use .size, you need to use findElements not findelement. need the plural verison
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(2).click(); //this will choose 3rd option, starts from index 0
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			//below prints out milk, butter, cheese. Which are the values of the attribute "value"
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//if(text == "Cheese") - this if statement does not work
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		

	}

}
