package addToCartProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

	    WebDriverWait d=new WebDriverWait(driver, Duration.ofSeconds(5));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		// Thread.sleep(5000L);

		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();

	}

}
