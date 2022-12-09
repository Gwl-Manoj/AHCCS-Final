package Library_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Achievement_Charter_Excel_Data_BaseClass 
{

	public WebDriver driver;
	public void open_browser(String browsername)     // Open the Browser
	{
		
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup(); 
			
			try
			{
				
				ChromeOptions option = new ChromeOptions();
				
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(ChromeOptions.CAPABILITY, option);
				option.merge(capabilities);
				
				
				
				option.addArguments("acceptInsecureCerts");			
				option.addArguments("--no-sandbox");
//				option.addArguments("--headless");
				option.addArguments("--disable-dev-shm-usage");
				option.addArguments("--disable-setuid-sandbox");
				
				driver= new ChromeDriver(option);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();// Maximize the browser
				driver.get("https://enroll.grafik-stage.io/login");  
			}
			catch(Exception e)
			{
				System.out.println(""+e);
				e.printStackTrace();
				
			}
		}
	
		else if(browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			try
			{
//				System.setProperty("webdriver.gecko.driver", "C:\\Selenium Softwares\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			 	
				 FirefoxOptions options = new FirefoxOptions();
				 options.setCapability("marionette", true);
//				 options.addArguments("acceptInsecureCerts");
//				 options.addArguments("--headledd");
//				 options.setHeadless(true);
				 driver = new FirefoxDriver(options);
				 driver.manage().deleteAllCookies();
				 driver.manage().window().maximize();
				 driver.get("https://enroll.grafik-stage.io/login");
			}
			catch(Exception e)
			{
				System.out.println(""+e);
				e.printStackTrace();
				
			}	
		}
		
		else if (browsername.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			try
			{
				EdgeOptions option = new EdgeOptions();
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(EdgeOptions.CAPABILITY, option);
				option.merge(capabilities);
//				System.setProperty("webdriver.edge.driver", "C:\\Selenium Softwares\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver(option);
//				option.addArguments("--headless");
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();// Maximize the browser
				driver.get("https://enroll.grafik-stage.io/login");  
				
			}
			catch(Exception e)
			{
				System.out.println(""+e);
				e.printStackTrace();
				
			}	
			
		}
		
		
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//		driver.manage().window().maximize();// Maximize the browser
//		driver.get("https://enroll.grafik-stage.io/login");  

//		driver.get("https://enroll.achievementcharter.com/login");
	
	}	
}
