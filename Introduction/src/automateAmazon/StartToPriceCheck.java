package automateAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class StartToPriceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		// open Amazon web site
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		// click the cart on top right
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")).click();
		
		// check the cart is empty
		String actual = driver.findElement(By.cssSelector("div[class='a-column a-span8 a-span-last'] h3")).getText()
				.trim();
		Assert.assertEquals(actual, "Your Amazon Cart is empty");
		
		driver.navigate().back();
		
		// search for items related to text
		driver.findElement(By.cssSelector("div.ac-input-container input")).sendKeys("Phone");
		
		// click the search button
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		// add to cart
		driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
		
		
		// click the cart on top right
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")).click();
		
		String str=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")).getText();
		Assert.assertTrue(str!=null);
		
		//proceed to buy
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	}

}
