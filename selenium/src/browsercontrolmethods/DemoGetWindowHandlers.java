package browsercontrolmethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This Class Is Used To Close All The Browser Without using Quit().
 * @author Sunil
 *
 */

public class DemoGetWindowHandlers {
	//Its USed to set the driver executable before launch the browser
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("http://www.naukri.com");
		//get the parent window sessionID
		String parentwindow = driver.getWindowHandle();
		System.out.println("The Parent Window Session ID is :"+parentwindow);
		System.out.println("-----------------------------------------");
		//get All the Window SessionId 
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("The Number of Windows is opened is--->"+count);
		System.out.println(allwindows);
		for(String window:allwindows)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}

	}

}
