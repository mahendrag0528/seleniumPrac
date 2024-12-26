package seleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


/*
 * Write automation code link https://rahulshettyacademy.com/locatorspractice/ page
 * login with success when give valid user name & password
 * Assert the successful message
 * logout successfully
 * close
 * 
 * username = rahul
 * password = rahulshettyacademy
 */

public class Task1 {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		String username="rahul";
		String password="rahulshettyacademy";
		
		//establish chrome browser
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//open link
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//enter the login details and click submit
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		//Asset the success message is true or false
		//System.out.print(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");
		//click logout
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		//close the driver
		driver.close();
	}
}
