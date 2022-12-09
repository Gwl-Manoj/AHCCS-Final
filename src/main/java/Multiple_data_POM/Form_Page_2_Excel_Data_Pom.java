package Multiple_data_POM;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_2_Excel_Data_Pom 
{
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement School_District;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement School_District_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Former_School_Type;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[504]") private WebElement Former_School_Type_1;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name_Of_Former_School;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Previous_Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[513]") private WebElement Previous_Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_2_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_School_District(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(School_District).click().perform();
		act.moveToElement(School_District_1).click().perform();
	
	}
	
	public void set_Former_School_Type(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Former_School_Type).click().perform();
		act.moveToElement(Former_School_Type_1).click().perform();
	
	}
	
	public void Set_Name_Of_Former_School(WebDriver driver) throws InterruptedException, IOException
	{
		Actions act = new Actions(driver);
		act.moveToElement(School_District).click().perform();
		act.moveToElement(School_District_1).click().perform();
		
		act.moveToElement(Former_School_Type).click().perform();
		act.moveToElement(Former_School_Type_1).click().perform();
		
		Sheet sh = Utility.getmultipledata("Form_Page_2");
		 String name_former_School = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 0; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==0)
				 {
					 name_former_School = cell.getStringCellValue();
				 }
			 }
			 
			 Name_Of_Former_School.sendKeys(name_former_School);
			 
			act.moveToElement(Previous_Grade).click().perform();
			act.moveToElement(Previous_Grade_1).click().perform();
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			 String result = null;
			 try
			 {
				 Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='3. Parent / Guardian Information']")).isDisplayed();
				 if(Guardian_Information==true)
				 {
					 result= "Pass";
				 }
				 
				 Reporter.log("Former School Name : "+name_former_School+"--->"+"--->"+"name_former_School Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				 
			 }
			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-13")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("Former School Name : "+name_former_School+"--->"+"--->"+"Former School Failed"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(1).getCell(7).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(1,7);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='former_school_name'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='former_school_name'])")).sendKeys(Utility.getdata(14,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				 
				
				 

			 }
			 
		
		 }
		
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
	
	
	
	
	

}
