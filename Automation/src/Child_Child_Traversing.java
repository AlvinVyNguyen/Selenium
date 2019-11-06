import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Child_Traversing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A T\\Desktop\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/en-us/p/surface-pro-6/8ZCNC665SLQ5?activetab=pivot:techspecstab");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'email-newsletter-dialog\']/div[3]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='pivot-tab-OverviewTab']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='pivot-tab-OverviewTab']/following-sibling::a[1]")).click();
		*/
		//below is teacher way, above is mine with thread.sleep
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		//

	}

}
