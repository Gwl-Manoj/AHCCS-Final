package Signature_Reset_Undo_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_15_Pom 
{
	@FindBy(xpath = "//input[@class='sign_reset btn btn-primary']") private WebElement Reset_Btn;	
	@FindBy(xpath = "//input[@value='Undo last stroke']") private WebElement Undo_Btn;
	@FindBy(id = "getSignature") private WebElement Next_Btn;
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-lg add_student'])[1]") private WebElement Logout;
	
	
	public Form_Page_15_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Reset_Signature(WebDriver driver) throws InterruptedException
	{
		WebElement Canvas = driver.findElement(By.xpath("//canvas[@class='jSignature']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(Canvas, 400, 0).perform();
		Reporter.log("Signature is drawn successfully ", true);
		Reporter.log("                                                                                 ", true);
		driver.findElement(By.id("signature_form")).click();
		Thread.sleep(2000);
		
		Reset_Btn.click();
		Reporter.log("Signature is Reset successfully ", true);
		Reporter.log("                                                                                ", true);
		Thread.sleep(2000);
		
		
	}
	
	public void Undo_Signature(WebDriver driver) throws InterruptedException
	{

		WebElement Canvas = driver.findElement(By.xpath("//canvas[@class='jSignature']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(Canvas, 400, 0).perform();
		Reporter.log("Signature is drawn successfully ", true);
		Reporter.log("                                                                                ", true);
		Thread.sleep(2000);
		act.dragAndDropBy(Canvas, 600, 0).perform();
		Reporter.log("Signature is drawn successfully ", true);
		Reporter.log("                                                                                ", true);
		Thread.sleep(2000);
//		act.dragAndDropBy(Canvas, 200, 0).perform();
//		Reporter.log("Signature is drawn successfully ", true);
//		Reporter.log("                                                                                ", true);
		driver.findElement(By.id("signature_form")).click();
		Thread.sleep(2000);
		
		Undo_Btn.click();
		Reporter.log("Signature is Undo successfully ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		driver.findElement(By.id("signature_form")).click();
		Thread.sleep(2000);
		
	}
	
	public void Click_Next_Btn(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Next_Btn).click().perform();
//		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Click_Logout(WebDriver driver) throws InterruptedException
	{
		Logout.click();
		Thread.sleep(2000);
		String Login_Page_URL_Actual = driver.getCurrentUrl();
		String Login_Page_URL_Expected = "https://enroll.grafik-stage.io/login";
		if(Login_Page_URL_Actual.equals(Login_Page_URL_Expected))
		{
			Reporter.log("The User is successfully logout", true);
			Reporter.log(" ", true);
			
		}
		else
		{
			Reporter.log("The user is not logout successfully", true);
			Reporter.log(" ", true);
		}
		
	}
	
//	public void Fill_Form_Page_15(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		Set_Signature(driver);
//		
//		Reset_Signature(driver);
//		
//		Undo_Signature(driver);
//		
//		Click_Next_Btn(driver);
//		
//		Click_Logout(driver);
//	}
	
	
	

}
