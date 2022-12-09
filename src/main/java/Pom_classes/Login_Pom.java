package Pom_classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom
{

	@FindBy(xpath="//input[@class='form-control email ']") private WebElement UN;
	@FindBy(xpath="//input[@class='form-control password ']") private WebElement PWD;
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']") private WebElement Loginbtn;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement StartEnrollmentBtn;
	
	public Login_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setLogin_PomUsername(String username) //
	{ 
		System.out.println();
		UN.sendKeys(username);
		System.out.println("The Mail ID is entered ");
		System.out.println("	");
	}
	
	public void setLogin_Pompassword(String password) //
	{
		PWD.sendKeys(password);
		System.out.println("The Password is entered ");
		System.out.println("	");
	}
	
	public void clickLogin_Pombtn() throws InterruptedException
	{
		Loginbtn.click();
		System.out.println("Clicked On Login Button ");
		System.out.println("	");
		Thread.sleep(2000);

		System.out.println("The user is successfully Logged In ");
		System.out.println("	");
		
//		StartEnrollmentBtn.click();
		
	}
	
	public void login(String username, String pass) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		try
		{
			setLogin_PomUsername(username); 
			setLogin_Pompassword(pass); 
			clickLogin_Pombtn();
		}
		catch(Exception e)
		{
			System.out.println(""+e);
			e.printStackTrace();
			
		}
	}
	
	
	
	
	
	
}
