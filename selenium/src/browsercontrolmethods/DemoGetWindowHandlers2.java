package browsercontrolmethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This Class Is Used To Close only Parent Browser Without close the Child browser.
 * @author Sunil
 *
 */

public class DemoGetWindowHandlers2 {
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
	     
		
		for(String window:allwindows)
		{
			driver.switchTo().window(window);
			
			if(parentwindow.equals(window))
			{
				driver.close();
			}
			else
			{				
				String s = driver.getTitle();
				System.out.println("The Child window Title is "+s);
			}
			
		}

	}

}