package Pom_classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_9_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Student_Language;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_9_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Set_Student_Language(String student_Language) throws InterruptedException
	{
		Student_Language.clear();
		Student_Language.sendKeys(student_Language);
		Reporter.log("Entered student language", true);
		Reporter.log(" ", true);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Reporter.log("Click On Next Button", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_9(String language) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Student_Language(language);
		
		Click_Next_Btn();
		
	}
}
