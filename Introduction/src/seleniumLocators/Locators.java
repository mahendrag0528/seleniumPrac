/*
  Locators help to find the HTML element on web page.
   
  Different locators are
  1.ID
  2.Xpath
  3.CSS Selector
  4.name
  5.Class Name
  6.Tag Name
  7.Link Text
  8. Partial Link test
  
 */
 // how give user name & password to web page login and Check the login success or fail.


package seleniumLocators;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		// testing happens on rahulshetty website
		
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver= new ChromeDriver();
		
		//use implicit timeout mechanism to wait for some seconds then shows error if not find
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		
//		// automate the sign in page
//		
//		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
//		driver.findElement(By.className("submit")).click();
//		
//		//error because page is load and after some seconds error message is shown so add implicit timeout
//		
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		
//		//LinkTest locator for forgot password in page
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		
//		//fill the forgot form using Xpath locators
//		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("rahul");
//		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("rahul@gcm.com");
//		
		
		driver.findElement(By.xpath("//button[@id=\"visitUsTwo\"]")).click();
		
	}

}
