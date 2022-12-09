package Other_Alternate_Options_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_9_Pom 
{

	@FindBy(name = "first_language") private WebElement Student_Language;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement other_language_RadioBtn;
	@FindBy(name = "language") private WebElement Student_Language1;
	@FindBy(name = "home_language") private WebElement home_language;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement other_language_RadioBtn1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_9_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Set_Student_Language(String student_Language) throws InterruptedException
	{
		Student_Language.clear();
		Student_Language.sendKeys(student_Language);
		
	}
	
	public void Click_other_language_RadioBtn() throws InterruptedException
	{
		other_language_RadioBtn.click();
		Reporter.log("other_language_Radio_Button Yes selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
		Student_Language1.clear();
		Thread.sleep(2000);
		Student_Language1.sendKeys("Marathi");
		home_language.clear();
		Thread.sleep(2000);
		home_language.sendKeys("Marathi, Hindi");
		Thread.sleep(2000);
		
	}
	
	public void Click_other_language_RadioBtn1() throws InterruptedException
	{
		other_language_RadioBtn1.click();
		Reporter.log("other_language_Radio_Button No selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	
	
	
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
}
