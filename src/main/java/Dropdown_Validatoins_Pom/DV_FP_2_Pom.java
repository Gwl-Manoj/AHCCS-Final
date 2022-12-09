package Dropdown_Validatoins_Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class DV_FP_2_Pom
{

	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement School_District;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement School_District_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[1]") private WebElement School_District_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Former_School_Type;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[504]") private WebElement Former_School_Type_1;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name_Of_Former_School;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Previous_Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[513]") private WebElement Previous_Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public DV_FP_2_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_School_District(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(School_District).click().perform();
		act.moveToElement(School_District_2).click().perform();
		
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
				 Reporter.log("School_District : "+"--->"+" School_District Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(3).getCell(7).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(3,7);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(School_District).click().perform();
					act.moveToElement(School_District_1).click().perform();
				 
				 Thread.sleep(2000);
				 Next_Btn.click();
				 Thread.sleep(2000);
				 
				

		 }
		 }

		 
		 
		 
		 catch(Exception e)
		 {
//			 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//			 if(Student_District==true)
//			 {
//				 result= "Pass";
//			
//			 }
//			 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//			 Reporter.log(" ", true);
//			 Thread.sleep(2000);
////			 driver.navigate().back();
//			 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//			 Thread.sleep(2000);
			 
			 
		 }
		
		
		
	
	}
	
	public void set_Former_School_Type(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Former_School_Type).click().perform();
		act.moveToElement(Former_School_Type_1).click().perform();
	
	}
	
	public void Set_Name_Of_Former_School(String name_Of_Former_School) throws InterruptedException
	{
		Name_Of_Former_School.clear();
		Name_Of_Former_School.sendKeys(name_Of_Former_School);
		
	}
	
	public void set_Previous_Grade(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Previous_Grade).click().perform();
		act.moveToElement(Previous_Grade_1).click().perform();
	
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_2(WebDriver driver, String f_school_name) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		set_School_District(driver);
		
		set_Former_School_Type(driver);
		
		Set_Name_Of_Former_School(f_school_name);
		
		set_Previous_Grade(driver);
		
		Click_Next_Btn();
	}
	
	
	
	
	
}
