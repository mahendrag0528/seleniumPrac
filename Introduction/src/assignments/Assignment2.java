package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
/*
 * 
 * switch windows
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome",
				"C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		
	   driver.switchTo().window(child);
	   System.out.println(driver.findElement(By.cssSelector("h3")).getText());
	   driver.switchTo().window(parent);
	   System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
	}

}
