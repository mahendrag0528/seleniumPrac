package seleniumDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectOneTravelWay {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
	}
}
