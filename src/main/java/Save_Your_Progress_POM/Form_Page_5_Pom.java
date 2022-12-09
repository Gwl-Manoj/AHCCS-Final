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

public class Form_Page_5_Pom 
{
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Ethinicity;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Ethinicity_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Race;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Race_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement State_Of_Birth;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[16]") private WebElement State_Of_Birth_1;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public Form_Page_5_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Year(String year) throws InterruptedException
	{
		Year.clear();
		Year.sendKeys(year);
		
	}
	
	public void set_Ethinicity(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Actions act = new Actions(driver);
		act.moveToElement(Ethinicity).click().perform();
		act.moveToElement(Ethinicity_1).click().perform();
		
	}
	
	public void set_Race(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Race).click().perform();
		act.moveToElement(Race_1).click().perform();
		
	}
	
	public void set_State_Of_Birth(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State_Of_Birth).click().perform();
		act.moveToElement(State_Of_Birth_1).click().perform();
		
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 5 --> "+message,true);
		Reporter.log("	",true);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_5(WebDriver driver, String year) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Year(year);
		
		set_Ethinicity(driver);
		
		set_Race(driver);
		
		set_State_Of_Birth(driver);
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
	}
	
}
