package endToEndPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksCount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//find links in footer
		WebElement footer=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
	}
}
