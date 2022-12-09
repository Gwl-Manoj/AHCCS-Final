package Save_Your_Progress_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_8_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name;
	@FindBy (xpath = "(//input[@class='form-control'])[2]") private WebElement Case_Number;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement People_Count;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement People_Count_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Annual_Salary;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[14]") private WebElement Annual_Salary_1;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;

	public Form_Page_8_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void Set_Name(String student_preferredName) throws InterruptedException
	{
		Name.clear();
		Name.sendKeys(student_preferredName, Keys.TAB);
		

	}

	public void Set_Case_Number(String case_Number) throws InterruptedException
	{
		Case_Number.clear();
		Case_Number.sendKeys(case_Number, Keys.TAB);
		

	}

	public void set_People_Count(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act = new Actions(driver);
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_1).click().perform();
		Thread.sleep(2000);

	}

	public void set_Annual_Salary(WebDriver driver) throws InterruptedException
	{

		Actions act = new Actions(driver);
		act.moveToElement(Annual_Salary).click().perform();
		act.moveToElement(Annual_Salary_1).click().perform();
		Thread.sleep(2000);
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 8 --> "+message,true);
		Reporter.log("	",true);
		
	}



	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}

	public void Fill_Form_Page_8(WebDriver driver, String name, String case_number) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Name(name);
		
		Set_Case_Number(case_number);
		
		set_People_Count(driver);
		
		set_Annual_Salary(driver);
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
	}


}
