package HomePage_Logo_Pom;

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
	
	public void Click_Form_Page_1(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_1.click();
		Thread.sleep(2000);	
		profile_tab.click();
		
		String email1 = email.getText();
		Reporter.log("The Student Email is "+email1, true);
		Reporter.log("   ", true);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
