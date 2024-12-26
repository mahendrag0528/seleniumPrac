package seleniumDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
        //Automate the static drop down button
        //for this use need Select class
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticDropDown);
        dropdown.selectByIndex(2);
        //for get the selected option as out put
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //select by value -> <option value="IND">IND<?option>
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
	}
}
