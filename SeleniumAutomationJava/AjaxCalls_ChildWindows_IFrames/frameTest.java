import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//frames are independent of its container, so you have to use switchTo().frames
		//can pass the driver id for arg0 here if it is provided. driver.switchTo().frame(arg0);
		//not provided, on website only this is provided: <iframe src="/resources/demos/droppable/default.html" class="demo-frame" xpath="1">
		//so we have to use the tagname.class
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//below gets how many iFrames there are
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//Since we only have 1, we can also do driver.switchTo().frame(0) for the 1st frame, but not recommended.
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//to go back and click on other things on the webpage
		driver.switchTo().defaultContent(); //do this after you are done with frame content
		
		
	}

}
