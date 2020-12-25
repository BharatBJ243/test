package browsercontrolmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class Is Used to Navigate from one page to another page
 * @author Sunil
 *
 */
public class DemoNavigate {
	
	//its used to set the driver executable path before launch the browser
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		//open the chrome Browser
		 WebDriver driver = new ChromeDriver();
		//maximize the browser
		 driver.manage().window().maximize();
		//Enter the url
		 driver.get("http://www.google.com");
		//navigate from one page to another
		 Navigation nv = driver.navigate();
		 nv.to("http://www.facebook.com");
		 
		 //method chaining 
//		 driver.navigate().to("http://www.facebook.com");
		 
		 nv.back();
		 nv.forward();
		 nv.refresh();
		

	}

}
