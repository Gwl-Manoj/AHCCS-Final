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

public class Form_Page_11_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Service_Provider;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Type_Of_Connection;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Type_Of_Connection_1;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Internet_Speed;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Internet_access;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_11_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Service_Provider(String service_Provider) throws InterruptedException
	{
		Service_Provider.clear();
		Service_Provider.sendKeys(service_Provider);
		
		
		
	}
	
	public void set_Type_Of_Connection(WebDriver driver)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Type_Of_Connection).click().perform();
		act.moveToElement(Type_Of_Connection_1).click().perform();
	
	}
	
	public void Set_Internet_Speed(String internet_Speed) throws InterruptedException
	{
		Internet_Speed.clear();
		Internet_Speed.sendKeys(internet_Speed);
		
	}
	
	public void Set_Internet_access(String internet_access) throws InterruptedException
	{
		Internet_access.clear();
		Internet_access.sendKeys(internet_access);
		
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 11 --> "+message,true);
		Reporter.log("	",true);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_11(WebDriver driver, String provider, String I_speed, String I_access) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Service_Provider(provider);
		
		set_Type_Of_Connection(driver);

		Set_Internet_Speed(I_speed);
		
		Set_Internet_access(I_access);
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
		
	}
	
	
}
