package Save_Your_Progress_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_6_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Full_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Primary_Parent_Email;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Primary_Parent_Phone;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Primary_Parent_Employeer;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement Work_number;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Work_Email;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Contact_Option;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[27]") private WebElement Contact_Option_1;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Contact_Language;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Name;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement Email;
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Relationship_With_Student;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[13]") private WebElement Name1;
	@FindBy(xpath = "(//input[@class='form-control'])[14]") private WebElement Email1;
	@FindBy(xpath = "(//input[@class='form-control'])[15]") private WebElement Relationship_With_Student1;
	@FindBy(xpath = "(//input[@class='form-control'])[16]") private WebElement Phone_Number1;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public Form_Page_6_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Set_Full_Name(String full_Name) throws InterruptedException
	{
	
		Full_Name.clear();
		Full_Name.sendKeys(full_Name);
		
	}
	
	public void Set_Primary_Parent_Email(String primary_Parent_Email) throws InterruptedException
	{
		Primary_Parent_Email.clear();
		Primary_Parent_Email.sendKeys(primary_Parent_Email);
		
	}
	
	public void Set_Primary_Parent_Phone(String primary_Parent_Phone) throws InterruptedException
	{
		Primary_Parent_Phone.clear();
		Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
		
	}
	
	public void Set_Primary_Parent_Employeer(String primary_Parent_Employeer) throws InterruptedException
	{
		Primary_Parent_Employeer.clear();
		Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
		
	}
	
	public void Set_Work_number(String work_number) throws InterruptedException
	{
		Work_number.clear();
		Work_number.sendKeys(work_number);
		
	}
	
	public void Set_Work_Email(String work_Email) throws InterruptedException
	{
		Work_Email.clear();
		Work_Email.sendKeys(work_Email);
		
	}
	
	public void set_Contact_Option(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act = new Actions(driver);
		act.moveToElement(Contact_Option).click().perform();
		act.moveToElement(Contact_Option_1).click().perform();
		
	}
	
	public void Set_Contact_Language(String contact_Language) throws InterruptedException
	{
		Contact_Language.clear();
		Contact_Language.sendKeys(contact_Language);
		
	}
	
	public void Set_Name(String name) throws InterruptedException
	{
		Name.clear();
		Name.sendKeys(name);
		
	}
	
	public void Set_Email(String email) throws InterruptedException
	{
		Email.clear();
		Email.sendKeys(email);
		
	}
	
	public void Set_Relationship_With_Student(String relationship_With_Student) throws InterruptedException
	{
		Relationship_With_Student.clear();
		Relationship_With_Student.sendKeys(relationship_With_Student);
		
	}
	
	public void Set_Phone_Number(String phone_Number) throws InterruptedException
	{
		Phone_Number.clear();
		Phone_Number.sendKeys(phone_Number);
		
	}
	
	public void Set_Name1(String name1) throws InterruptedException
	{
		Name1.clear();
		Name1.sendKeys(name1);
		
	}
	
	public void Set_Email1(String email1) throws InterruptedException
	{
		Email1.clear();
		Email1.sendKeys(email1);
		
	}
	
	public void Set_Relationship_With_Student1(String relationship_With_Student1) throws InterruptedException
	{
		Relationship_With_Student1.clear();
		Relationship_With_Student1.sendKeys(relationship_With_Student1);
		
	}
	
	public void Set_Phone_Number1(String phone_Number1) throws InterruptedException
	{
		Phone_Number1.clear();
		Phone_Number1.sendKeys(phone_Number1);
		
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 6 --> "+message,true);
		Reporter.log("	",true);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_6(WebDriver driver, String F_name, String P_mail, String P_phone, String P_employeer, String W_number, String W_mail, String language, String name, String email, String relationship, String phone, String name1, String email1, String relationship1, String phone1) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Full_Name(F_name);
		
		Set_Primary_Parent_Email(P_mail);
		
		Set_Primary_Parent_Phone(P_phone);
		
		Set_Primary_Parent_Employeer(P_employeer);
		
		Set_Work_number(W_number);
		
		Set_Work_Email(W_mail);
		
		set_Contact_Option(driver);
		
		Set_Contact_Language(language);
		
		Set_Name(name);
		
		Set_Email(email);
		
		Set_Relationship_With_Student(relationship);
		
		Set_Phone_Number(phone);
		
		Set_Name1(name1);
		
		Set_Email1(email1);
		
		Set_Relationship_With_Student1(relationship1);
		
		Set_Phone_Number1(phone1);
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
		
		
	}
	
	
	
}
