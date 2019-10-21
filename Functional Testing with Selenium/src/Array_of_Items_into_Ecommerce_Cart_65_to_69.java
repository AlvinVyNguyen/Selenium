import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array_of_Items_into_Ecommerce_Cart_65_to_69 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//expected list of veggies, can declare an array so you can add multiple veggies
		//Below is declaring a variable
		//String names="Cucumber";
		//Below is delcaring an array; need String[] because the veggies are string, and need {} not ()
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		//h4.product-name (div then class name for css)
		//findelements finds all 30 with this product name, find element singular would only give you one
		//List<WebElement> to get a list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		//need this int to break properly
		int j = 0;
			
		for (int i=0; i<products.size();i++)
		{
			//Brocolli - 1 Kg, if split by -(hyphen) will become:
			//Brocolli, 1 Kg
			//using split will create an array, because it has 2 values
			//gets text of the ith card (gets product-name card)
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//name[0] is now Brocolli and name[1] is 1 Kg (careful of the space before n after hyphen)
			//the space can be trimmed using: name[0].trim() (trims all white spaces);
			//format it to get actual vegetable name
			// check whether name you extracted is present in the array or not
			//convert array into array list for easy search
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				//click on Add to Cart, use findElementS, grab the current i and click
				//below line is bad code, text can change anytime
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//below gets the block to click, not the text, so doesnt matter what the text changes too
				//driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//we took the parent class in order to select the block, so now we need to traverse to child
				//we can do this by adding /tagname to the end of the parent
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//use size() to get size of ArrayList, itemsNeededList is an array LIST
				//use length() to get size of array, itemsNeeded is an array
				if(j==itemsNeeded.length)
				{
					break;
				}
				
			}
			/*
			if (name.contains("Cucumber"))
			{
				//click on Add to Cart, use findElementS, grab the current i and click
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			*/
		}
	}

}
