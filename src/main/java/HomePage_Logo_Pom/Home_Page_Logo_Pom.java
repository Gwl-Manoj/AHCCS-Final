package HomePage_Logo_Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Home_Page_Logo_Pom 
{
	@FindBy (xpath="//a[@href='https://enroll.grafik-stage.io/welcome/bzwo']") private WebElement Home_Page_Name_Link;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement StartEnrollmentBtn;
	@FindBy(xpath = "//a[@class='navbar-brand']") private WebElement HomePage_Logo;
	@FindBy(xpath = "//h3[@class='student_name']") private WebElement Student_name;
	
	public Home_Page_Logo_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Home_Page_Name_Link(WebDriver driver) throws InterruptedException
	{
		String Home_page_URL_Actual = driver.getCurrentUrl();
		String Home_page_URL_Expected = "https://enroll.grafik-stage.io/home";
		Reporter.log("The URL for home page is "+Home_page_URL_Actual, true);
		
		Reporter.log("	", true);
		if(Home_page_URL_Actual.equals(Home_page_URL_Expected))
		{
			Home_Page_Name_Link.click();
			Reporter.log("Click on Student Name ", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The New User no data found", true);
			Reporter.log(" ", true);
		}
		Thread.sleep(2000);
	
		
	}
	
	public void Click_StartEnrollmentBtn(WebDriver driver) throws InterruptedException
	{
		
		StartEnrollmentBtn.click();
		Reporter.log("Clicked On Start Enrollment Button", true);
		Reporter.log(" ", true);
	
		Thread.sleep(4000);
	}
	
	public void Verify_Homepage_Logo()
	{
		if(HomePage_Logo.isDisplayed())
		{
			Reporter.log("The homepage logo is displayed", true);
			Reporter.log("	", true);
		}
		else
		{
			Reporter.log("The homepage logo is Not displayed", true);
			Reporter.log("	", true);
		}

	}
	
	public void Verify_Homepage_Student_Name(WebDriver driver) throws InterruptedException
	{
		String student_name = Student_name.getText();
		
		Reporter.log("Get the profile Name i.e. ", true);
		Reporter.log("	", true);
		
		Thread.sleep(2000);
		
		String Expected_Student_Name = "Oliver Noah";
		
		if(student_name.equals(Expected_Student_Name))
		{
			Reporter.log("The actual and expected Student name is same i.e. "+student_name, true);
			Reporter.log("	", true);
		}
		else
		{
			Reporter.log("The actual and expected Student name is Different i.e. "+student_name, true);
			Reporter.log("	", true);
		}
		Thread.sleep(4000);
		
	}
	
	public void Click_Homepage_Logo(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		HomePage_Logo.click();
		Reporter.log("Clicked on Logo", true);
		Reporter.log("	", true);
		Thread.sleep(4000);
		
		Reporter.log("The user navigate to Home Page Successfully", true);
		Reporter.log("	", true);
		
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/home";
		
		if(ActualURL.equals(ExpectedURL))
		{
			Reporter.log("The actual and expected URL's are same and The Homepage is displayed", true);
			Reporter.log("	", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are Different and The Homepage is Not displayed", true);
			Reporter.log("	", true);
		}
		Thread.sleep(2000);
		
	}
	
	public void Verify_Home_Page_Logo(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Verify_Homepage_Logo();
		
		Click_Home_Page_Name_Link(driver);
		
		Click_StartEnrollmentBtn(driver);
		
		Click_Homepage_Logo(driver);
		
		
	}
	
	
	
	
	
}
