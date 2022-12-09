package Save_Your_Progress_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_9_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Student_Language;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
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
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 9 --> "+message,true);
		Reporter.log("	",true);
		
	}
	
	
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_9(String language) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		
		Set_Student_Language(language);
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
		
	}
	
	
}
