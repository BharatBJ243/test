package gt;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	public class BaseTest {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
		public static WebDriver driver;
		
		@BeforeClass
		@Parameters("sBrowserName")
		public void openBrowser(String sBrowserName) {
			if(sBrowserName.equals("chrome")) {
				 driver =new ChromeDriver();
			}
			else if(sBrowserName.equals("firefox")) {
				 driver=new FirefoxDriver();
			}
			else if(sBrowserName.equals("ie")) {
				driver = new InternetExplorerDriver();
			}
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		@BeforeMethod
		public void openApplication() {
			driver.get("http://localhost:8082/login.do");
		}
		@AfterClass
		public void closeBrowser() {
			driver.close();
		}

	}


