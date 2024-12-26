package mouseRelatedActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterCapitalsAsText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Actions class
		Actions act=new Actions(driver);
		WebElement searchElement=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		//hold shift to enter caps -> method is keyDown();
		act.moveToElement(searchElement).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
	}

}
