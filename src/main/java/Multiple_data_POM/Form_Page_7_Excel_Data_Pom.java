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

public class Form_Page_7_Excel_Data_Pom 
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
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[1]") private WebElement Earning_from_weges;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[3]") private WebElement Earning_from_weges1;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[5]") private WebElement Earning_from_weges2;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[9]") private WebElement Earning_from_weges9;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[13]") private WebElement Earning_from_weges13;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[15]") private WebElement Earning_from_weges15;
			
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_7_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Set_Student_Name(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_7");
		String student_Name = null;

		for(int i =1; i<=9; i++)
		{
			Row row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==0)
				{
					student_Name = cell.getStringCellValue();
				}
			}
			
			Student_Name.clear();
			Student_Name.sendKeys(student_Name);

			Actions act = new Actions(driver);
			act.moveToElement(Grade).click().perform();
			act.moveToElement(Grade_1).click().perform();
			
			act.moveToElement(Year).click().perform();
			act.moveToElement(Year_1).click().perform();
			
			act.moveToElement(Month).click().perform();
			act.moveToElement(Month_1).click().perform();
			
			act.moveToElement(Day).click().perform();
			act.moveToElement(Day_1).click().perform();
			
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
					 String expected_validation=sh1.getRow(1).getCell(27).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(1,27);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					Student_Name.clear();
					Student_Name.sendKeys(Utility.getdata(45,1));
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
				Boolean Annual_Household_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='8. Annual Household Income']")).isDisplayed();
				if(Annual_Household_Income==true)
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
	
	
	
	
}
