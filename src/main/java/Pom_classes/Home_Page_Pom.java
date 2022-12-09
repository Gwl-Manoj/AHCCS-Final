package Pom_classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Home_Page_Pom 
{
	@FindBy (xpath="//a[@href='https://enroll.grafik-stage.io/welcome/bzwo']") private WebElement Home_Page_Name_Link;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement StartEnrollmentBtn;
	
	public Home_Page_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Home_Page_Name_Link(WebDriver driver) throws InterruptedException
	{
		String Home_page_URL_Actual = driver.getCurrentUrl();
		String Home_page_URL_Expected = "https://enroll.grafik-stage.io/home";
		Reporter.log("The URL for home page is "+Home_page_URL_Actual, true);
		Reporter.log(" ", true);
		if(Home_page_URL_Actual.equals(Home_page_URL_Expected))
		{
			Home_Page_Name_Link.click();
			Reporter.log("Click on Student Name ", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("There is no data of any existing User", true);
		}
		Thread.sleep(2000);
	
		
	}
	
	public void Click_StartEnrollmentBtn(WebDriver driver) throws InterruptedException
	{
		
		StartEnrollmentBtn.click();
		Reporter.log("Click on start Enrollment ", true);
		Reporter.log(" ", true);
	
	
		Thread.sleep(2000);
	}
	
	public void Home_Page(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Click_Home_Page_Name_Link(driver);
		Click_StartEnrollmentBtn(driver);
	}
	
	
	
}
