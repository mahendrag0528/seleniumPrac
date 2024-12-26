package mouseRelatedActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Must need actions class to perform mouse related actions

public class MouseOverToPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Actions class
		Actions act=new Actions(driver);
		
		//mouseover on element to show something
		act.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute' and @data-csa-c-type=\"link\" ]"))).build().perform();
		
		
	}

}
