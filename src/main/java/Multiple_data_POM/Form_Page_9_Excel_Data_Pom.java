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

public class Form_Page_9_Excel_Data_Pom 
{
	
	@FindBy (id = "guardian_name") private WebElement Guardian_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Student_Language;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_9_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Guardian_Name(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_9");
		String guardian_Name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==0)
				{
					guardian_Name = cell.getStringCellValue();
				}
			}
			
		Guardian_Name.clear();
		Guardian_Name.sendKeys(guardian_Name);
		
		Student_Language.clear();
		String student_Language = Utility.getdata(48,1);
		Student_Language.sendKeys(student_Language);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		String result = null;
		try 
		{
			Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

			if(iserror==true)
			{
				result = "Fail";

				Reporter.log("guardian_Name  : "+guardian_Name+"--->"+"guardian_Name Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			
				
				driver.findElement(By.id("guardian_name")).clear();
				driver.findElement(By.id("guardian_name")).sendKeys("Oliver");
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
			Boolean Student_Photo_Release_Form = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='10. Student Photo Release Form']")).isDisplayed();
			if(Student_Photo_Release_Form==true)
			{
				result= "Pass";
				Reporter.log("guardian_Name   : "+guardian_Name+"--->"+"guardian_Name Success"+"--->"+result, true);
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
	
	public void Set_Student_Language(WebDriver driver) throws InterruptedException, IOException
	{
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_9");
		String student_Language = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==1)
				{
					student_Language = cell.getStringCellValue();
				}
			}
			
		Guardian_Name.clear();
		String guardian_Name = Utility.getdata(59,1);
		Guardian_Name.sendKeys(guardian_Name);
		
		Student_Language.clear();
		Student_Language.sendKeys(student_Language);
		
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

				Reporter.log("student_Language  : "+student_Language+"--->"+"student_Language Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				
				Sheet sh1 = Utility.getmultipledata("Validations");
				 String expected_validation=sh1.getRow(1).getCell(35).getStringCellValue();
				 
//				String expected_validation = Utility.get_validations_data(1,35);
				
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }
				
				driver.findElement(By.id("first_language")).clear();
				driver.findElement(By.id("first_language")).sendKeys(Utility.getdata(48,1));
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
			Boolean Student_Photo_Release_Form = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='10. Student Photo Release Form']")).isDisplayed();
			if(Student_Photo_Release_Form==true)
			{
				result= "Pass";
				Reporter.log("student_Language   : "+student_Language+"--->"+"student_Language Success"+"--->"+result, true);
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
