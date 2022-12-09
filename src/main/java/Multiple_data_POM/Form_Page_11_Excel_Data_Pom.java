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

public class Form_Page_11_Excel_Data_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Service_Provider;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Type_Of_Connection;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Type_Of_Connection_1;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Internet_Speed;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Internet_access;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_11_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Service_Provider(WebDriver driver) throws InterruptedException, IOException
	{
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_11");
		String service_Provider = null;

		for(int i =1; i<=8; i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==0)
				{
					service_Provider = cell.getStringCellValue();
				}
			}
			
			Service_Provider.clear();
			Service_Provider.sendKeys(service_Provider);
			
			Actions act = new Actions(driver);
			act.moveToElement(Type_Of_Connection).click().perform();
			act.moveToElement(Type_Of_Connection_1).click().perform();
			
			Internet_Speed.clear();
			String internet_Speed = Utility.getdata(51,1);
			Internet_Speed.sendKeys(internet_Speed);
			
			Internet_access.clear();
			String internet_access = Utility.getdata(52,1) ;
			Internet_access.sendKeys(internet_access);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("service_Provider  : "+service_Provider+"--->"+"service_Provider Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
				
					
					driver.findElement(By.id("service_provider")).clear();
					driver.findElement(By.id("service_provider")).sendKeys(Utility.getdata(53,1));
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
				Boolean Computer_Equipment_Agreement = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='12. Computer Equipment Agreement']")).isDisplayed();
				if(Computer_Equipment_Agreement==true)
				{
					result= "Pass";
					Reporter.log("service_Provider   : "+service_Provider+"--->"+"service_Provider Success"+"--->"+result, true);
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
	
	public void set_Type_Of_Connection(WebDriver driver)
	{
		
		
		Actions act = new Actions(driver);
		act.moveToElement(Type_Of_Connection).click().perform();
		act.moveToElement(Type_Of_Connection_1).click().perform();
	
	}
	
	public void Set_Internet_Speed(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_11");
		String internet_Speed = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
			Cell cell = row.getCell(j);

				if(j==1)
				{
					internet_Speed = cell.getStringCellValue();
				}
			}
			
			Service_Provider.clear();
			String service_Provider= Utility.getdata(53,1);
			Service_Provider.sendKeys(service_Provider);
			
			Actions act = new Actions(driver);
			act.moveToElement(Type_Of_Connection).click().perform();
			act.moveToElement(Type_Of_Connection_1).click().perform();
			
			Internet_Speed.clear();
			Internet_Speed.sendKeys(internet_Speed);
			
			Internet_access.clear();
			String internet_access = Utility.getdata(52,1) ;
			Internet_access.sendKeys(internet_access);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-16")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-16")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("internet_Speed  : "+internet_Speed+"--->"+"internet_Speed Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
				
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(2).getCell(43).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(2,43);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					driver.findElement(By.id("access_internet")).clear();
					driver.findElement(By.id("access_internet")).sendKeys(Utility.getdata(51,1));
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
				Boolean Computer_Equipment_Agreement = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='12. Computer Equipment Agreement']")).isDisplayed();
				if(Computer_Equipment_Agreement==true)
				{
					result= "Pass";
					Reporter.log("internet_Speed   : "+internet_Speed+"--->"+"internet_Speed Success"+"--->"+result, true);
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
	
	public void Set_Internet_access(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_11");
		String internet_access = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 2; j<row.getLastCellNum(); j++)
			{
			Cell cell = row.getCell(j);

				if(j==2)
				{
					internet_access = cell.getStringCellValue();
				}
			}
			
			Service_Provider.clear();
			String service_Provider= Utility.getdata(53,1);
			Service_Provider.sendKeys(service_Provider);
			
			Actions act = new Actions(driver);
			act.moveToElement(Type_Of_Connection).click().perform();
			act.moveToElement(Type_Of_Connection_1).click().perform();
			
			Internet_Speed.clear();
			String internet_Speed = Utility.getdata(51,1);
			Internet_Speed.sendKeys(internet_Speed);
			
			Internet_access.clear();
			Internet_access.sendKeys(internet_access);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-18")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-18")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("internet_access  : "+internet_access+"--->"+"internet_access Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
				
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(3).getCell(43).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(3,43);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					driver.findElement(By.id("avaliable_internet")).clear();
					driver.findElement(By.id("avaliable_internet")).sendKeys(Utility.getdata(52,1));
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
				Boolean Computer_Equipment_Agreement = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='12. Computer Equipment Agreement']")).isDisplayed();
				if(Computer_Equipment_Agreement==true)
				{
					result= "Pass";
					Reporter.log("internet_access   : "+internet_access+"--->"+"internet_access Success"+"--->"+result, true);
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
