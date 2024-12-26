package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600);");
		int sum = 0;
		List<WebElement> product = driver
				.findElements(By.xpath("//div[@class=\"tableFixHead\"]/table[@id=\"product\"]//td[4]"));
		for (WebElement i : product) {
			String value = i.getText();
			sum += Integer.parseInt(value);
		}
		String str=driver.findElement(By.cssSelector("div.totalAmount")).getText();
		String[] a=str.split(":");
		int total=Integer.parseInt(a[1].trim());
		Assert.assertEquals(sum,total);
		//driver.close();
	}
}
