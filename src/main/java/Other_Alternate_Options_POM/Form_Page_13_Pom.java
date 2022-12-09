package Other_Alternate_Options_POM;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_13_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Your_Reason;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement previous_student_RadioBtn;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement previous_student_RadioBtn1;
	@FindBy(name = "about_experience") private WebElement about_experience;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[3]") private WebElement absent_time_RadioBtn;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[4]") private WebElement absent_time_RadioBtn1;
	@FindBy(name = "absent_reason") private WebElement absent_reason;
	@FindBy (xpath = "(//input[@class='form-control'])[3]") private WebElement Adults_Name;
	@FindBy(id = "do_different") private WebElement Reason_For_change;
	@FindBy (xpath = "(//input[@class='form-control'])[5]") private WebElement Changes;
	@FindBy (xpath = "//div[@class='bootstrap-tagsinput']") private WebElement Hobbies;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Preferred_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Pronunciation;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Pronouns;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[5]") private WebElement very_comfortable_RadioBtn;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[6]") private WebElement somewhat_comfortable_RadioBtn1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[7]") private WebElement not_comfortable_RadioBtn;
	
	
	
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement Other;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;

	public Form_Page_13_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Set_Your_Reason(String your_Reason) throws InterruptedException
	{
		Your_Reason.clear();
		Thread.sleep(1000);
		Your_Reason.sendKeys(your_Reason);
		Reporter.log("The reason is entered", true);
		Reporter.log("																", true);

	}
	
	public void Click_previous_student_RadioBtn() throws InterruptedException
	{
		previous_student_RadioBtn.click();
		Thread.sleep(2000);
		about_experience.clear();
		about_experience.sendKeys("Unsuitable Methods of Teaching That Are Not Specific to Your Child");
		Reporter.log("previous_student_RadioBtn Yes is selected", true);
		Reporter.log("																", true);
	}
	
	public void Set_Adults_Name(String adults_Name) throws InterruptedException
	{
		Adults_Name.clear();
		Thread.sleep(1000);
		Adults_Name.sendKeys(adults_Name);
		Reporter.log("The Adults Name is entered", true);
		Reporter.log("																", true);

	}
	
	public void Click_absent_time_RadioBtn() throws InterruptedException
	{
		absent_time_RadioBtn.click();
		Thread.sleep(2000);
		absent_reason.clear();
		absent_reason.sendKeys("Due to health Issues");
		Reporter.log("absent_time_RadioBtn Yes is selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_previous_student_RadioBtn1() throws InterruptedException
	{
		previous_student_RadioBtn1.click();
		Thread.sleep(2000);
		Reporter.log("previous_student_RadioBtn No is selected", true);
		Reporter.log("																", true);
	}
	
	
	public void Click_absent_time_RadioBtn1() throws InterruptedException
	{
		absent_time_RadioBtn1.click();
		Thread.sleep(2000);
		
		Reporter.log("absent_time_RadioBtn No is selected", true);
		Reporter.log("																", true);
	}
	
	
	public void Set_Reason_For_change(String reason_For_change) throws InterruptedException
	{
		Reason_For_change.clear();
		Thread.sleep(1000);
		Reason_For_change.sendKeys(reason_For_change);
		Reporter.log("The Adults Name is entered", true);
		Reporter.log("																", true);

	}
	
	public void Set_Changes(String changes) throws InterruptedException
	{
		Changes.clear();
		Thread.sleep(1000);
		Changes.sendKeys(changes);
		Reporter.log("The Changes are entered", true);
		Reporter.log("																", true);

	}
	
	public void Set_Hobbies(String hobbies) throws InterruptedException
	{
		Hobbies.clear();
		Thread.sleep(1000);
		Hobbies.sendKeys(hobbies);
		Reporter.log("The Hobbies are entered", true);
		Reporter.log("																", true);

	}
	
	
	
	public void Set_Preferred_Name(String preferred_Name) throws InterruptedException
	{
		Preferred_Name.clear();
		Thread.sleep(1000);
		Preferred_Name.sendKeys(preferred_Name);
		Reporter.log("The Preffered Name is entered", true);
		Reporter.log("																", true);

	}
	
	public void Set_Pronunciation(String pronunciation) throws InterruptedException
	{
		Pronunciation.clear();
		Thread.sleep(1000);
		Pronunciation.sendKeys(pronunciation);
		Reporter.log("The Pronunciation is entered", true);
		Reporter.log("																", true);

	}
	
	public void Set_Pronouns(String pronouns) throws InterruptedException
	{
		Pronouns.clear();
		Thread.sleep(1000);
		Pronouns.sendKeys(pronouns);
		Reporter.log("The Pronouns is entered", true);
		Reporter.log("																", true);
	}
	
	public void Click_very_comfortable_RadioBtn() throws InterruptedException
	{
		very_comfortable_RadioBtn.click();
		Reporter.log("very_comfortable_RadioBtn is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_somewhat_comfortable_RadioBtn1() throws InterruptedException
	{
		somewhat_comfortable_RadioBtn1.click();
		Reporter.log("somewhat_comfortable_RadioBtn is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_not_comfortable_RadioBtn() throws InterruptedException
	{
		not_comfortable_RadioBtn.click();
		Reporter.log("not_comfortable_RadioBtn is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	
	
	public void Click_CheckBoxes(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		int length = driver.findElements(By.xpath("//label[@class='custom-control-label']")).size();
		
		System.out.println(length);
		for(int i=8; i<=length; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])["+i+"]")).click();
			Reporter.log("The checkbox is selected No. "+i+" ", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
			Next_Btn.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])["+i+"]")).click();
			Reporter.log("The checkbox is Deselected No. "+i+" ", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
		}


	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	

}
