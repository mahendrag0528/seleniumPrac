package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		
		/*
		 step 1 : Invoking browser
		 every browser has its own driver 
		 Chrome - ChromeDriver -> methods, Methods help to automate the browser..
		 Safari, edge, opera, etc.. but the methods name is same in every browser and functionality also same. only starting step is like Opera for OperaDriver only.
		 on to of the ChromeDriver has An Interface is WebDriver which provide methods..
		*/
		
		
		/*
		 selenium has selenium Manager so it can automatically invoke by just write above second step and run
		 WebDriver driver=new ChromeDriver();
		*/
		
		
		/*
		 must download chromebrowser.exe
		 by manually invoke
		 System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
         WebDriver driver=new ChromeDriver();  // initial step.
		*/
		
		
		System.setProperty("Web.Driver.chrome","C:\\Users\\MahendraReddyGaddam\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.selenium.dev/");  // Go for page in chrome browser use "get("path") method...
		System.out.println(driver.getTitle());  // driver.getTitle() used for get title of current page
		System.out.println(driver.getCurrentUrl()); // driver.getCurrentUrl() used for get url of current page
		driver.close(); // driver.close() used for close browser of current window
		driver.quit(); //driver.quit() used for close browser of all window with associated with selenium
		

	}
}
