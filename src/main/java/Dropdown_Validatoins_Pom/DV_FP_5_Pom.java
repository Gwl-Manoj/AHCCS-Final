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

public class DV_FP_5_Pom 
{
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Ethinicity;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Ethinicity_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[1]") private WebElement Ethinicity_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Race;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Race_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Race_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement State_Of_Birth;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[16]") private WebElement State_Of_Birth_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[11]") private WebElement State_Of_Birth_2;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public DV_FP_5_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Year(String year) throws InterruptedException
	{
		Year.clear();
		Year.sendKeys(year);
		
	}
	
	public void set_Ethinicity(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Ethinicity).click().perform();
		act.moveToElement(Ethinicity_2).click().perform();
		
		Thread.sleep(2000);
		 Next_Btn.click();
		 Thread.sleep(2000);
		
		String result = null;
		 try
		 {

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-48")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-48")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("Ethinicity : "+"--->"+" Ethinicity Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(1).getCell(19).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(1,19);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(Ethinicity).click().perform();
					act.moveToElement(Ethinicity_1).click().perform();
				 
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
	
	public void set_Race(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Race).click().perform();
		act.moveToElement(Race_2).click().perform();
		
		Thread.sleep(2000);
		 Next_Btn.click();
		 Thread.sleep(2000);
		
		String result = null;
		 try
		 {

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-52")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-52")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("Race : "+"--->"+" Race Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(2).getCell(19).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(2,19);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(Race).click().perform();
					act.moveToElement(Race_1).click().perform();
				 
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
	
	public void set_State_Of_Birth(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State_Of_Birth).click().perform();
		act.moveToElement(State_Of_Birth_2).click().perform();
		
		Thread.sleep(2000);
		 Next_Btn.click();
		 Thread.sleep(2000);
		
		String result = null;
		 try
		 {

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-56")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-56")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("Child_Lives_with : "+"--->"+" Child_Lives_with Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(3).getCell(19).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(3,19);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(State_Of_Birth).click().perform();
					act.moveToElement(State_Of_Birth_1).click().perform();
				 
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
		
		Click_Next_Btn();
	}
	

	
}
