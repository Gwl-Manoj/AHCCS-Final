package Hamburger_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Home_Page_Email_Verification_Pom 
{
	@FindBy (xpath="//a[@href='https://enroll.grafik-stage.io/welcome/bzwo']") private WebElement Home_Page_Name_Link;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement StartEnrollmentBtn;
	@FindBy(id = "email") private WebElement email;
	@FindBy(id = "profile-tab") private WebElement profile_tab;
	
	@FindBy(xpath = "//span[@class='navbar-toggler-icon']") private WebElement Hamburger_Menu;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[1]") private WebElement Step_1;
	
	public Home_Page_Email_Verification_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Verify_Email(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Reporter.log("Click on Hamburger Menu Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);	
		Step_1.click();
		Reporter.log("Click on My Account ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);	
		profile_tab.click();
		Reporter.log("Click on Profile tab ", true);
		Reporter.log(" ", true);
		
//		String email1 = email.getText();
		String Actual_email = email.getAttribute("value");
		String Expected_email = "abcd@mailinator.com";
		if(Actual_email.equals(Expected_email))
		{
			Reporter.log("The actual and Expected Emails For Student are same "+Actual_email, true);
			Reporter.log("   ", true);
			
		}
		
		else
		{
			Reporter.log("The actual and Expected Emails For Student are Different "+Actual_email, true);
			Reporter.log("   ", true);
		}
		
		
		
	}
	

}
