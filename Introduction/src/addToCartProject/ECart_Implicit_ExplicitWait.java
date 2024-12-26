package addToCartProject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ECart_Implicit_ExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Store the items you want to purchase
		String[] items = { "Cucumber - 1 Kg", "Carrot - 1 Kg" };
		List<String> names = Arrays.asList(items);

		// add items to cart method
		addToCart(driver, names);

		// top cart for view added items
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		// proceed to checkout for price
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		// type promo code and click apply
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class=\"promoBtn\"]")).click();

		// check and proceed to place order
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		//select country India
		WebElement selectCountry=driver.findElement(By.cssSelector("select[style=\"width: 200px;\"]"));
		Select dropdown=new Select(selectCountry);
		dropdown.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		
		//proceed to place order
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		

	}

	public static void addToCart(WebDriver driver, List<String> names) {

		// Get all the product in Website for order and store in list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// traverse and find element and click add to cart
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();

			if (names.contains(name)) {
				
				// use this addto card xpath and click
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
	}

}
