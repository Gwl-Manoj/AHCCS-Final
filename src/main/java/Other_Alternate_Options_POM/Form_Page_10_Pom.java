package Other_Alternate_Options_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_10_Pom
{
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement release_form_Radio_Btn;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement release_form_Radio_Btn1;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_10_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_release_form_Radio_Btn() throws InterruptedException
	{
		release_form_Radio_Btn1.click();
		Reporter.log("release_form_Radio_Button 2 selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_release_form_Radio_Btn1() throws InterruptedException
	{
		release_form_Radio_Btn.click();
		Reporter.log("release_form_Radio_Button 1 selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
}
