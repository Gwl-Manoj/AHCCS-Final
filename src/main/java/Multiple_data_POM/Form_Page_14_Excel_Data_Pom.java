package Multiple_data_POM;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_14_Excel_Data_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Parent_Name;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_14_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Set_Student_Name(WebDriver driver) throws InterruptedException, IOException
	{
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_14");
		String student_Name = null;

		for(int i =1; i<=9; i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==0)
				{
					student_Name = cell.getStringCellValue();
				}
			}
			Student_Name.clear();
			Student_Name.sendKeys(student_Name);
			
			Parent_Name.clear();
			String parent_Name = Utility.getdata(56,1);
			Parent_Name.sendKeys(parent_Name);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-5")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-5")).getText();
				
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("student_Name  : "+student_Name+"--->"+"student_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
				
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(1).getCell(55).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(1,55);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					
					driver.findElement(By.id("student_name")).clear();
					driver.findElement(By.id("student_name")).sendKeys(Utility.getdata(55,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}


				
			}
			
			catch(Exception e)
			{
				
			}
			
			try
			{
				Boolean Computer_Equipment_Agreement = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='15. Students under 18 years old must have a parent/guardian sign below.']")).isDisplayed();
				if(Computer_Equipment_Agreement==true)
				{
					result= "Pass";
					Reporter.log("student_Name   : "+student_Name+"--->"+"student_Name Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}

				

			}
			catch(Exception e)
			{
				
				
			}
			}
		
		
	}
	
	public void Set_Parent_Name(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_14");
		String parent_Name = null;

		for(int i =1; i<=9; i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==1)
				{
					parent_Name = cell.getStringCellValue();
				}
			}
			Student_Name.clear();
			String student_Name = Utility.getdata(55,1);
			Student_Name.sendKeys(student_Name);
			
			Parent_Name.clear();
			Parent_Name.sendKeys(parent_Name);
			
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

					Reporter.log("parent_Name  : "+parent_Name+"--->"+"parent_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(2).getCell(55).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(2,55);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					
					driver.findElement(By.id("gaurdian_name")).clear();
					driver.findElement(By.id("gaurdian_name")).sendKeys(Utility.getdata(56,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}


				
			}
			
			catch(Exception e)
			{
				
			}
			
			try
			{
				Boolean Computer_Equipment_Agreement = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='15. Students under 18 years old must have a parent/guardian sign below.']")).isDisplayed();
				if(Computer_Equipment_Agreement==true)
				{
					result= "Pass";
					Reporter.log("parent_Name   : "+parent_Name+"--->"+"parent_Name Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}

				

			}
			catch(Exception e)
			{
				
				
			}
			}
		
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}

}
