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

public class Form_Page_8_Excel_Data_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name;
	@FindBy (xpath = "(//input[@class='form-control'])[2]") private WebElement Case_Number;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement People_Count;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement People_Count_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Annual_Salary;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[14]") private WebElement Annual_Salary_1;


	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;

	public Form_Page_8_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void Set_Name(WebDriver driver) throws InterruptedException, IOException
	{
		Sheet sh = Utility.getmultipledata("Form_Page_8");
		String name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==0)
				{
					name = cell.getStringCellValue();
				}
			}
			
			
		Name.clear();
		Name.sendKeys(name);
		
		Case_Number.clear();
		String case_Number = Utility.getdata(60,1);
		Case_Number.sendKeys(case_Number);
		
		Actions act = new Actions(driver);
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_1).click().perform();
		Thread.sleep(2000);
		
		act.moveToElement(Annual_Salary).click().perform();
		act.moveToElement(Annual_Salary_1).click().perform();
		Thread.sleep(2000);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		String result = null;
		try 
		{
			Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

			if(iserror==true)
			{
				result = "Fail";

				Reporter.log("name  : "+name+"--->"+"name Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			
				Name.clear();
				Name.sendKeys(Utility.getdata(59,1));
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
			Boolean Home_Language_Survey = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='9. Home Language Survey']")).isDisplayed();
			if(Home_Language_Survey==true)
			{
				result= "Pass";
				Reporter.log("name   : "+name+"--->"+"name Success"+"--->"+result, true);
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

	public void Set_Case_Number(WebDriver driver) throws InterruptedException, IOException
	{
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_8");
		String case_number = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==1)
				{
					case_number = cell.getStringCellValue();
				}
			}
			
			
		Name.clear();
		String name = Utility.getdata(59,1);
		Name.sendKeys(name);
		
		Case_Number.clear();
		Case_Number.sendKeys(case_number);
		
		Actions act = new Actions(driver);
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_1).click().perform();
		Thread.sleep(2000);
		
		act.moveToElement(Annual_Salary).click().perform();
		act.moveToElement(Annual_Salary_1).click().perform();
		Thread.sleep(2000);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		String result = null;
		try 
		{
			Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

			if(iserror==true)
			{
				result = "Fail";

				Reporter.log("case_number  : "+case_number+"--->"+"case_number Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			
				
				driver.findElement(By.id("case_no")).clear();
				driver.findElement(By.id("case_no")).sendKeys(Utility.getdata(60,1));
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
			Boolean Home_Language_Survey = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='9. Home Language Survey']")).isDisplayed();
			if(Home_Language_Survey==true)
			{
				result= "Pass";
				Reporter.log("case_number   : "+case_number+"--->"+"case_number Success"+"--->"+result, true);
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

	public void set_People_Count(WebDriver driver) throws InterruptedException
	{

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



	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}




}
