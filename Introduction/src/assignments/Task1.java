package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome","C:\\\\Users\\\\MahendraReddyGaddam\\\\OneDrive - ValueMomentum, Inc\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//CSS Selectors locators  
		//Radio  Button Examples...
		String buttonTitle= driver.findElement(By.cssSelector("div#radio-btn-example fieldset legend")).getText();
		
		Assert.assertEquals(buttonTitle,"Radio Button Example");
		
		//click the radio button 1
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		
		//try to select another radio button and option should change to correct
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		
	}

}
