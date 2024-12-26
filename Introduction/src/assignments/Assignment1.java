package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/*
 * 
 * Click the first check box and uncheck it in rahulshetty automation practice
 * 
 * find no. of check box in page
 * 
 */

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//select the check box
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		// deselect the check box
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		//find no. of check box in page
		List<WebElement> TotalCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total count of check box in page :"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
