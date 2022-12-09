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

public class Form_Page_7_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_Name;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Grade_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[11]") private WebElement Year_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Month;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[35]") private WebElement Month_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[4]") private WebElement Day;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[48]") private WebElement Day_1;
	
	@FindBy(xpath = "//a[@class='add_button']") private WebElement Add_Student_Button;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Student_Name1;
	@FindBy(xpath = "(//div[@class='fs-label'])[5]") private WebElement Grade1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[78]") private WebElement Grade_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[6]") private WebElement Year1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[87]") private WebElement Year_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[7]") private WebElement Month1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[101]") private WebElement Month_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[8]") private WebElement Day1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[117]") private WebElement Day_2;
	
	
	@FindBy(xpath = "(//label[@class='custom-control-label'])[2]") private WebElement Earning_from_weges;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[4]") private WebElement Earning_from_weges1;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[5]") private WebElement Earning_from_weges2;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[9]") private WebElement Earning_from_weges9;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[11]") private WebElement Earning_from_weges13;
	@FindBy(xpath = "(//label[@class='custom-control-label'])[13]") private WebElement Earning_from_weges15;
	@FindBy(id = "save_progress") private WebElement Save_Progress_Btn;
	@FindBy(xpath = "//div[@class='alert alert-success progess_alert']") private WebElement Success_message;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_7_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Set_Student_Name(String student_Name) throws InterruptedException
	{
		Student_Name.clear();
		Student_Name.sendKeys(student_Name);
		Reporter.log("Student Name is entered "+student_Name, true);
		
	}
	
	public void set_Grade(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act = new Actions(driver);
		act.moveToElement(Grade).click().perform();
		act.moveToElement(Grade_1).click().perform();
		Thread.sleep(2000);
		
	}
	
	public void set_Year(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year).click().perform();
		act.moveToElement(Year_1).click().perform();
		
	}
	
	public void set_Month(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month).click().perform();
		act.moveToElement(Month_1).click().perform();
		
	}
	
	public void set_Day(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day).click().perform();
		act.moveToElement(Day_1).click().perform();
		
	}
	
	public void Click_Add_Student_Button(WebDriver driver) throws InterruptedException
	{
		Add_Student_Button.click();
		Thread.sleep(2000);
	
	}
	
	public void Set_Student_Name1(String student_Name1) throws InterruptedException
	{
		Student_Name1.clear();
		Student_Name1.sendKeys(student_Name1);
		Reporter.log("Student Name is entered "+student_Name1, true);
		
	}
	
	public void set_Grade1(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Grade1).click().perform();
		act.moveToElement(Grade_2).click().perform();
		
	}
	
	public void set_Year1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year1).click().perform();
		act.moveToElement(Year_2).click().perform();
		
	}
	
	public void set_Month1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month1).click().perform();
		act.moveToElement(Month_2).click().perform();
		
	}
	
	public void set_Day1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day1).click().perform();
		act.moveToElement(Day_2).click().perform();
		
	}
	
	
	public void Click_CheckBoxes()
	{
		Earning_from_weges.click();
		
		Earning_from_weges1.click();
		
		Earning_from_weges2.click();
		
		Earning_from_weges9.click();
		
		Earning_from_weges13.click();
		
		Earning_from_weges15.click();
		
		
		
	}
	
	public void Click_Save_Your_Progress_Btn() throws InterruptedException
	{
		Save_Progress_Btn.click();
		Reporter.log("Click On Save Your Progress Button ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String message = Success_message.getText();
		Reporter.log("The Progress is saved of Form Page 7 --> "+message,true);
		Reporter.log("	",true);
		
	}
 
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_7(WebDriver driver, String S_name) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Student_Name(S_name);
		
		set_Grade(driver);
		
		set_Year(driver);
		
		set_Month(driver);
		
		set_Day(driver);
		
		Click_CheckBoxes();
		
		Click_Save_Your_Progress_Btn();
		
		Click_Next_Btn();
		
	}
	
	
}
