package Save_Your_Progress_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_13_Pom 
{


	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Your_Reason;
	@FindBy (xpath = "(//input[@class='form-control'])[3]") private WebElement Adults_Name;
	@FindBy(id = "do_different") private WebElement Reason_For_change;
	@FindBy (xpath = "(//input[@class='form-control'])[5]") private WebElement Changes;
	@FindBy (xpath = "//div[@class='bootstrap-tagsinput']") private WebElement Hobbies;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Preferred_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Pronunciation;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Pronouns;
	
	@FindBy(xpath = "(//label[@class='custom-control-label'])[8]") private WebElement CheckBox1;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[10]") private WebElement CheckBox3;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[15]") private WebElement CheckBox5;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[16]") private WebElement CheckBox9;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[17]") private WebElement CheckBox10;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[18]") private WebElement CheckBox12;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
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

	}
	
	public void Set_Adults_Name(String adults_Name) throws InterruptedException
	{
		Adults_Name.clear();
		Thread.sleep(1000);
		Adults_Name.sendKeys(adults_Name);
		Reporter.log("The Adults Name is entered", true);

	}
	
	public void Set_Reason_For_change(String reason_For_change) throws InterruptedException
	{
		Reason_For_change.clear();
		Thread.sleep(1000);
		Reason_For_change.sendKeys(reason_For_change);
		Reporter.log("The Adults Name is entered", true);

	}
	
	public void Set_Changes(String changes) throws InterruptedException
	{
		Changes.clear();
		Thread.sleep(1000);
		Changes.sendKeys(changes);
		Reporter.log("The Changes are entered", true);

	}
	
	public void Set_Hobbies(String hobbies) throws InterruptedException
	{
		Hobbies.clear();
		Thread.sleep(1000);
		Hobbies.sendKeys(hobbies);
		Reporter.log("The Hobbies are entered", true);

	}
	
	
	
	public void Set_Preferred_Name(String preferred_Name) throws InterruptedException
	{
		Preferred_Name.clear();
		Thread.sleep(1000);
		Preferred_Name.sendKeys(preferred_Name);
		Reporter.log("The Preffered Name is entered", true);

	}
	
	public void Set_Pronunciation(String pronunciation) throws InterruptedException
	{
		Pronunciation.clear();
		Thread.sleep(1000);
		Pronunciation.sendKeys(pronunciation);
		Reporter.log("The Pronunciation is entered", true);

	}
	
	public void Set_Pronouns(String pronouns) throws InterruptedException
	{
		Pronouns.clear();
		Thread.sleep(1000);
		Pronouns.sendKeys(pronouns);
		Reporter.log("The Pronouns is entered", true);

	}
	
	public void Click_CheckBoxes()
	{
		CheckBox1.click();
		
		CheckBox3.click();
		
		CheckBox5.click();
		
		CheckBox9.click();
		
		CheckBox10.click();
		
		CheckBox12.click();
		
		
		
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 13 --> "+message,true);
		Reporter.log("	",true);
		
	}
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_13(WebDriver driver, String reason, String A_name, String change_reason, String changes, String P_name, String pronunciation, String pronouns) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Set_Your_Reason(reason);
		
		Set_Adults_Name(A_name);
		
		Set_Reason_For_change(change_reason);
		
		Set_Changes(changes);
		
//		Set_Hobbies(Utility.getdata(67,1));
		
		Set_Preferred_Name(P_name);
		
		Set_Pronunciation(pronunciation);
		
		Set_Pronouns(pronouns);
		
		Click_CheckBoxes();
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
		
		
	}

}
