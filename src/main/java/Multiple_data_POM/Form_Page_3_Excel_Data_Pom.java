package Multiple_data_POM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_3_Excel_Data_Pom 
{

	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Child_Lives_with;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Child_Lives_with_1;
	@FindBy(xpath = "//input[@class='form-control tag-field']") private WebElement Father_First_last_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Home_address;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement City;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[15]") private WebElement State_1;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Zip_Code;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Cell_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Work_Number;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;


	public Form_Page_3_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void set_Child_Lives_with(WebDriver driver)
	{

		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_1).click().perform();

	}

	public void Set_Father_First_last_Name(WebDriver driver) throws InterruptedException, IOException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_1).click().perform();

		Sheet sh = Utility.getmultipledata("Form_Page_3");
		String Father_First_Last_Name = null;

		for(int i =1; i<=8; i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 4; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==4)
				{
					Father_First_Last_Name = cell.getStringCellValue();
				}
			}


			Father_First_last_Name.clear();
			Father_First_last_Name.sendKeys(Father_First_Last_Name);

			Home_address.clear();
			String home_address = Utility.getdata(18,1);
			Home_address.sendKeys(home_address);

			City.clear();
			String city = Utility.getdata(19,1);
			City.sendKeys(city);

			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			String zip_Code = Utility.getdata(20,1);
			Zip_Code.sendKeys(zip_Code);

			Cell_Number.clear();
			String cell_Number = Utility.getdata(21,1);
			Cell_Number.sendKeys(cell_Number);

			Work_Number.clear();
			String work_Number = Utility.getdata(22,1);
			Work_Number.sendKeys(work_Number);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//ul[@id='parsley-id-20']")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-20")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("Father_First_Last_Name  : "+Father_First_Last_Name+"--->"+"--->"+"Father_First_Last_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(1).getCell(11).getStringCellValue();
					 
					 String expected_validation1=sh1.getRow(2).getCell(11).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(1,11);
//					String expected_validation1 = Utility.get_validations_data(2,11);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 if(actual_validation.equals(expected_validation1))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 
					 
					driver.findElement(By.id("father_name")).clear();
					driver.findElement(By.id("father_name")).sendKeys(Utility.getdata(17,1));
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
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
					Reporter.log("Father_First_Last Name  : "+Father_First_Last_Name+"--->"+"--->"+"Father_First_Last_Name Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}

				

			}
			catch(Exception e)
			{
				
				
			}
			
			

//			Father_First_last_Name.clear();

		}


	}

	public void Set_Home_address(WebDriver driver) throws InterruptedException, IOException
	{
		//		Home_address.clear();
		//		Home_address.sendKeys(home_address);

		

			Father_First_last_Name.clear();
			String Father_First_Last_Name = Utility.getdata(17,1);
			Father_First_last_Name.sendKeys(Father_First_Last_Name);
			
			Sheet sh = Utility.getmultipledata("Form_Page_3");
			String home_address = null;
			String result = null;

			for(int i =1; i<=8; i++)
			{
				Row row=sh.getRow(i);
				for(int j= 5; j<row.getLastCellNum(); j++)
				{
					Cell cell = row.getCell(j);

					if(j==5)
					{
						home_address = cell.getStringCellValue();
					}
				}

			

			Home_address.clear();
			Home_address.sendKeys(home_address);

			City.clear();
			String city = Utility.getdata(19,1);
			City.sendKeys(city);

			Actions act = new Actions(driver);
			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			String zip_Code = Utility.getdata(20,1);
			Zip_Code.sendKeys(zip_Code);

			Cell_Number.clear();
			String cell_Number = Utility.getdata(21,1);
			Cell_Number.sendKeys(cell_Number);

			Work_Number.clear();
			String work_Number = Utility.getdata(22,1);
			Work_Number.sendKeys(work_Number);

			Next_Btn.click();
			Thread.sleep(2000);


			try
			{
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
				}

				Reporter.log("home_address   : "+home_address+"--->"+"--->"+"home_address Success"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Back']")).click();
				Thread.sleep(2000);

			}
			catch(Exception e)
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

				}


				Reporter.log("home_address  : "+home_address+"--->"+"--->"+"home_address Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			}

			Home_address.clear();

		}



	}

	public void Set_City(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_3");
		String city = null;
		String result = null;

		for(int i =1; i<=8; i++)
		{
			Row row=sh.getRow(i);
			for(int j= 6; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==6)
				{
					city = cell.getStringCellValue();
				}
			}


			Father_First_last_Name.clear();
			String Father_First_Last_Name = Utility.getdata(17,1);
			Father_First_last_Name.sendKeys(Father_First_Last_Name);

			Home_address.clear();
			String home_address = Utility.getdata(18,1);
			Home_address.sendKeys(home_address);

			City.clear();
			City.sendKeys(city);

			Actions act = new Actions(driver);
			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			String zip_Code = Utility.getdata(20,1);
			Zip_Code.sendKeys(zip_Code);

			Cell_Number.clear();
			String cell_Number = Utility.getdata(21,1);
			Cell_Number.sendKeys(cell_Number);

			Work_Number.clear();
			String work_Number = Utility.getdata(22,1);
			Work_Number.sendKeys(work_Number);

			Next_Btn.click();
			Thread.sleep(2000);


			try
			{
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
				}

				Reporter.log("City   : "+city+"--->"+"--->"+"City Success"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Back']")).click();
				Thread.sleep(2000);

			}
			catch(Exception e)
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

				}


				Reporter.log("City  : "+city+"--->"+"--->"+"City Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			}

			City.clear();

		}


	}



	public void Set_Zip_Code(WebDriver driver) throws InterruptedException, IOException
	{


		Sheet sh = Utility.getmultipledata("Form_Page_3");
		String zipcode = null;
		String result = null;

		for(int i =1; i<=8; i++)
		{
			Row row=sh.getRow(i);
			for(int j= 7; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==7)
				{
					zipcode = cell.getStringCellValue();
				}
			}


			Father_First_last_Name.clear();
			String Father_First_Last_Name = Utility.getdata(17,1);
			Father_First_last_Name.sendKeys(Father_First_Last_Name);

			Home_address.clear();
			String home_address = Utility.getdata(18,1);
			Home_address.sendKeys(home_address);

			City.clear();
			String city = Utility.getdata(19,1);
			City.sendKeys(city);

			Actions act = new Actions(driver);
			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			Zip_Code.sendKeys(zipcode);

			Cell_Number.clear();
			String cell_Number = Utility.getdata(21,1);
			Cell_Number.sendKeys(cell_Number);

			Work_Number.clear();
			String work_Number = Utility.getdata(22,1);
			Work_Number.sendKeys(work_Number);

			Next_Btn.click();
			Thread.sleep(2000);


			try
			{
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
				}

				Reporter.log("zipcode   : "+zipcode+"--->"+"--->"+"zipcode Success"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Back']")).click();
				Thread.sleep(2000);

			}
			catch(Exception e)
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

				}


				Reporter.log("zipcode  : "+zipcode+"--->"+"--->"+"zipcode Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			}

			Zip_Code.clear();

		}


	}

	public void Set_Cell_Number(WebDriver driver) throws InterruptedException, IOException
	{


		Sheet sh = Utility.getmultipledata("Form_Page_3");
		String cell_number = null;
		String result = null;

		for(int i =1; i<=8; i++)
		{
			Row row=sh.getRow(i);
			for(int j= 8; j<row.getLastCellNum(); j++)
			{
				 Cell cell = row.getCell(j);

				if(j==8)
				{
					cell_number = cell.getStringCellValue();
				}
			}


			Father_First_last_Name.clear();
			String Father_First_Last_Name = Utility.getdata(17,1);
			Father_First_last_Name.sendKeys(Father_First_Last_Name);

			Home_address.clear();
			String home_address = Utility.getdata(18,1);
			Home_address.sendKeys(home_address);

			City.clear();
			String city = Utility.getdata(19,1);
			City.sendKeys(city);

			Actions act = new Actions(driver);
			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			String zipcode = Utility.getdata(20,1);
			Zip_Code.sendKeys(zipcode);

			Cell_Number.clear();
			Cell_Number.sendKeys(cell_number);

			Work_Number.clear();
			String work_Number = Utility.getdata(22,1);
			Work_Number.sendKeys(work_Number);

			Next_Btn.click();
			Thread.sleep(2000);


			try
			{
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
				}

				Reporter.log("cell_number   : "+cell_number+"--->"+"--->"+"cell_number Success"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Back']")).click();
				Thread.sleep(2000);

			}
			catch(Exception e)
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

				}


				Reporter.log("cell_number  : "+cell_number+"--->"+"--->"+"cell_number Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			}

			Cell_Number.clear();

		}


	}

	public void Set_Work_Number(WebDriver driver) throws InterruptedException, IOException
	{
		Sheet sh = Utility.getmultipledata("Form_Page_3");
		String work_number = null;
		String result = null;

		for(int i =1; i<=8; i++)
		{
			Row row=sh.getRow(i);
			for(int j= 8; j<row.getLastCellNum(); j++)
			{
				 Cell cell = row.getCell(j);

				if(j==8)
				{
					work_number = cell.getStringCellValue();
				}
			}


			Father_First_last_Name.clear();
			String Father_First_Last_Name = Utility.getdata(17,1);
			Father_First_last_Name.sendKeys(Father_First_Last_Name);

			Home_address.clear();
			String home_address = Utility.getdata(18,1);
			Home_address.sendKeys(home_address);

			City.clear();
			String city = Utility.getdata(19,1);
			City.sendKeys(city);

			Actions act = new Actions(driver);
			act.moveToElement(State).click().perform();
			act.moveToElement(State_1).click().perform();

			Zip_Code.clear();
			String zipcode = Utility.getdata(20,1);
			Zip_Code.sendKeys(zipcode);

			Cell_Number.clear();
			String cell_number = Utility.getdata(21,1);
			Cell_Number.sendKeys(cell_number);

			Work_Number.clear();
			Work_Number.sendKeys(work_number);

			Next_Btn.click();
			Thread.sleep(2000);


			try
			{
				Boolean Guardian_Information = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='4. Parent / Guardian: Please read each statement below']")).isDisplayed();
				if(Guardian_Information==true)
				{
					result= "Pass";
				}

				Reporter.log("work_number   : "+work_number+"--->"+"--->"+"work_number Success"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Back']")).click();
				Thread.sleep(2000);

			}
			catch(Exception e)
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

				}


				Reporter.log("work_number  : "+work_number+"--->"+"--->"+"work_number Failed"+"--->"+result, true);
				Reporter.log("                                                                                                    ", true);
			}

			Work_Number.clear();

		}


	}

	public void click_Next_Btn(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn btn-primary btn-lg']")));
		Next_Btn.click();
		Thread.sleep(2000);
	}




}
