package Add_Student_After_Form_15_Pom;

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
	@FindBy(xpath = "//span[@class='navbar-toggler-icon']") private WebElement Hamburger_Menu;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[15]") private WebElement Step_15;
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-lg add_student'])[2]") private WebElement Add_Student_Btn;	
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
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
			Reporter.log("Click On Student Name", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The New User no data found", true);
		}
		Thread.sleep(2000);
	
		
	}
	
	public void Click_StartEnrollmentBtn(WebDriver driver) throws InterruptedException
	{
		
		StartEnrollmentBtn.click();
		
		Reporter.log("Click On Start Enrollment Button", true);
		Reporter.log(" ", true);
	
	
		Thread.sleep(2000);
	}
	
	public void Click_Form_Page_15(WebDriver driver) throws InterruptedException
	{
//		Hamburger_Menu.click();
//		Thread.sleep(2000);	
//		
//		Step_15.click();
//		Thread.sleep(2000);	
//		
//		Next_Btn.click();
//		Thread.sleep(2000);
//		
		driver.navigate().to("https://enroll.grafik-stage.io/congrats/bzwo");
		
		Add_Student_Btn.click();
		Thread.sleep(2000);
		Reporter.log("Click On add Student Button", true);
		Reporter.log(" ", true);
		
		StartEnrollmentBtn.click();
		Reporter.log("Click On Start Enrollment Button", true);
		Reporter.log(" ", true);
		
		Thread.sleep(2000);
		
		
	}
	
	public void Home_Page(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Click_Home_Page_Name_Link(driver);
		
		Click_StartEnrollmentBtn(driver);
		
		Click_Form_Page_15(driver);
		
		
	}
	
	
	
	
	
}
