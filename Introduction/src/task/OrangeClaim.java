package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeClaim {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //Get the user name and password from page
        String username=(driver.findElements(By.xpath("//p[@class=\"oxd-text oxd-text--p\"]"))).get(0).getText();
        String password=(driver.findElements(By.xpath("//p[@class=\"oxd-text oxd-text--p\"]"))).get(1).getText();
        
        //enter details
        driver.findElement(By.xpath("//input[@name=\"username\" ]")).sendKeys(username.split(":")[1].trim());
        driver.findElement(By.xpath("//input[@name=\"password\" ]")).sendKeys(password.split(":")[1].trim());
        
        //submit the login
        driver.findElement(By.cssSelector("button.oxd-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']//span[text()='Claim']")).click();
        
        List<WebElement> rows=driver.findElements(By.cssSelector("div.oxd-table-card div.oxd-table-row"));
        for(WebElement row:rows) {
        	System.out.println(driver.findElement(By.cssSelector("div.oxd-table-card div.oxd-table-row div")));
        }
        
	}

}
