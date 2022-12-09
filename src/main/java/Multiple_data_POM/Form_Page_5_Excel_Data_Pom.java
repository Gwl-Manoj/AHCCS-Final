package Multiple_data_POM;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_5_Excel_Data_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Ethinicity;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Ethinicity_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Race;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Race_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement State_Of_Birth;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[16]") private WebElement State_Of_Birth_1;
	@FindBy(id = "pa_year") private WebElement Year1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public Form_Page_5_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Year(WebDriver driver) throws InterruptedException, IOException
	{
		Sheet sh = Utility.getmultipledata("Form_Page_5");
		 String year = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 5; j<row.getLastCellNum(); j++)
			 {
				 Cell cell = row.getCell(j);
				 
				 if(j==5)
				 {
					 year = cell.getStringCellValue();
				 }
			 }
			 
		Year.clear();
		Year.sendKeys(year);
		
		Actions act = new Actions(driver);
		act.moveToElement(Ethinicity).click().perform();
		act.moveToElement(Ethinicity_1).click().perform();
		
		act.moveToElement(Race).click().perform();
		act.moveToElement(Race_1).click().perform();
		
		act.moveToElement(State_Of_Birth).click().perform();
		act.moveToElement(State_Of_Birth_1).click().perform();
		
		Year1.clear();
		String year1 = Utility.getdata(25,1);
		Year1.sendKeys(year1);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		String result = null;
		try 
		{
			Boolean iserror = driver.findElement(By.xpath("//ul[@id='parsley-id-34']")).isDisplayed();

			if(iserror==true)
			{
				result = "Fail";

				Reporter.log("year  : "+year+"--->"+"year Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			
				driver.findElement(By.id("grade_year")).clear();
				driver.findElement(By.id("grade_year")).sendKeys("2021", Keys.TAB);
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
			Boolean AHCCS_Contact_Sheet = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='6. AHCCS Contact Sheet']")).isDisplayed();
			if(AHCCS_Contact_Sheet==true)
			{
				result= "Pass";
				Reporter.log("year  : "+year+"--->"+"year Success"+"--->"+result, true);
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
	
	
	public void Set_Year1(WebDriver driver) throws InterruptedException, IOException
	{
		Sheet sh = Utility.getmultipledata("Form_Page_5");
		 String year1 = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 5; j<row.getLastCellNum(); j++)
			 {
				 Cell cell = row.getCell(j);
				 
				 if(j==5)
				 {
					 year1 = cell.getStringCellValue();
				 }
			 }
			 
		Year.clear();
		String year = Utility.getdata(25,1);
		Year.sendKeys(year);
		
		Actions act = new Actions(driver);
		act.moveToElement(Ethinicity).click().perform();
		act.moveToElement(Ethinicity_1).click().perform();
		
		act.moveToElement(Race).click().perform();
		act.moveToElement(Race_1).click().perform();
		
		act.moveToElement(State_Of_Birth).click().perform();
		act.moveToElement(State_Of_Birth_1).click().perform();
		
		Year1.clear();
		Year1.sendKeys(year1);
		
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		String result = null;
		try 
		{
			Boolean iserror = driver.findElement(By.xpath("//ul[@id='parsley-id-58']")).isDisplayed();

			if(iserror==true)
			{
				result = "Fail";

				Reporter.log("year1  : "+year1+"--->"+"year1 Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			
				driver.findElement(By.id("pa_year")).clear();
				driver.findElement(By.id("pa_year")).sendKeys("2022", Keys.TAB);
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
			Boolean AHCCS_Contact_Sheet = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='6. AHCCS Contact Sheet']")).isDisplayed();
			if(AHCCS_Contact_Sheet==true)
			{
				result= "Pass";
				Reporter.log("year1  : "+year1+"--->"+"year1 Success"+"--->"+result, true);
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
	
	
	


}
