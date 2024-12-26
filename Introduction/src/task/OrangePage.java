package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangePage {

	public static void main(String[] args) throws InterruptedException{
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
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
        List<WebElement> rows=driver.findElements(By.xpath("//div[@class='oxd-table-card']"));
        //System.out.println(rows.size());
        for(int i=2;i<=50;i++) {
        	if(driver.findElement(By.xpath("(((//div[@class=\"oxd-table-card\"]["+i+"])//div[@class='oxd-table-cell oxd-padding-cell'])[2])")).getText().equals("0301"))
        	{
        		//click the edit button
        		driver.findElement(By.xpath("(((//div[@class=\"oxd-table-card\"]["+i+"])//div[@class='oxd-table-cell oxd-padding-cell'])[9]//button/i[@class='oxd-icon bi-pencil-fill'])")).click();
        		Thread.sleep(2000);
        		driver.navigate().back();
        		//click delete button
        		driver.findElement(By.xpath("(((//div[@class=\"oxd-table-card\"]["+i+"])//div[@class='oxd-table-cell oxd-padding-cell'])[9]//button/i[@class='oxd-icon bi-trash'])")).click();
        		Thread.sleep(1000);
        		driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[text()=' No, Cancel ']")).click();
        		break;
        	}
        }
        //driver.close();
        
	}

}
