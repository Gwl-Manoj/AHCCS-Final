package Dropdown_Validatoins_Pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Library_Files.Utility;

public class DV_FP_3_Pom 
{
	
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Child_Lives_with;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Child_Lives_with_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[1]") private WebElement Child_Lives_with_2;
	@FindBy(xpath = "//input[@class='form-control tag-field']") private WebElement Father_First_last_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Home_address;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement City;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[15]") private WebElement State_1;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Zip_Code;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Cell_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Work_Number;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public DV_FP_3_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void set_Child_Lives_with(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_2).click().perform();
		
		Thread.sleep(2000);
		 Next_Btn.click();
		 Thread.sleep(2000);
		
		String result = null;
		 try
		 {

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-7")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-7")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("Child_Lives_with : "+"--->"+" Child_Lives_with Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(3).getCell(11).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(3,11);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(Child_Lives_with).click().perform();
					act.moveToElement(Child_Lives_with_1).click().perform();
				 
				 Thread.sleep(2000);
				 Next_Btn.click();
				 Thread.sleep(2000);
				 
					

			 }
			 }

			 
			 
			 
			 catch(Exception e)
			 {
//				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//				 if(Student_District==true)
//				 {
//					 result= "Pass";
//				
//				 }
//				 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//				 Reporter.log(" ", true);
//				 Thread.sleep(2000);
////				 driver.navigate().back();
//				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//				 Thread.sleep(2000);
				 
				 
			 }
	}
	
	public void Set_Father_First_last_Name(String father_First_last_Name) throws InterruptedException
	{
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		
	}
	
	public void Set_Home_address(String home_address) throws InterruptedException
	{
		Home_address.clear();
		Home_address.sendKeys(home_address);
		
	}
	
	public void Set_City(String city) throws InterruptedException
	{
		City.clear();
		City.sendKeys(city);
		
	}
	
	public void set_State(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State).click().perform();
		act.moveToElement(State_1).click().perform();
		
	}
	
	public void Set_Zip_Code(String zip_Code) throws InterruptedException
	{
		Zip_Code.clear();
		Zip_Code.sendKeys(zip_Code);
		
	}
	
	public void Set_Cell_Number(String cell_Number) throws InterruptedException
	{
		Cell_Number.clear();
		Cell_Number.sendKeys(cell_Number);
		
	}
	
	public void Set_Work_Number(String work_Number) throws InterruptedException
	{
		Work_Number.clear();
		Work_Number.sendKeys(work_Number, Keys.TAB);
		
	}
	
	public void click_Next_Btn(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn btn-primary btn-lg']")));
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_3(WebDriver driver, String fname, String h_address, String city, String zipcode, String phone, String work_number) throws InterruptedException, EncryptedDocumentException, IOException
	{
		set_Child_Lives_with(driver);
		
		Set_Father_First_last_Name(fname);
		
		Set_Home_address(h_address);
		
		Set_City(city);
		
		set_State(driver);
		
		Set_Zip_Code(zipcode);
		
		Set_Cell_Number(phone);
		
		Set_Work_Number(work_number);
		
		click_Next_Btn(driver);
		
		
	}
	
	
	
	
}
