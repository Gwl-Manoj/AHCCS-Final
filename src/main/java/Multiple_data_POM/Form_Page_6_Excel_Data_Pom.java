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

public class Form_Page_6_Excel_Data_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Full_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Primary_Parent_Email;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Primary_Parent_Phone;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Primary_Parent_Employeer;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement Work_number;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Work_Email;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Contact_Option;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[27]") private WebElement Contact_Option_1;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Contact_Language;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Name;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement Email;
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Relationship_With_Student;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[13]") private WebElement Name1;
	@FindBy(xpath = "(//input[@class='form-control'])[14]") private WebElement Email1;
	@FindBy(xpath = "(//input[@class='form-control'])[15]") private WebElement Relationship_With_Student1;
	@FindBy(xpath = "(//input[@class='form-control'])[16]") private WebElement Phone_Number1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public Form_Page_6_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Set_Full_Name(WebDriver driver) throws InterruptedException, IOException
	{
	
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String full_Name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==0)
				{
					full_Name = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("full_Name  : "+full_Name+"--->"+"full_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("classroom_name")).clear();
					driver.findElement(By.name("classroom_name")).sendKeys("Oliver Noah");
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("full_Name   : "+full_Name+"--->"+"full_Name Success"+"--->"+result, true);
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
	
	public void Set_Primary_Parent_Email(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String primary_Parent_Email = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==1)
				{
					primary_Parent_Email = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-23")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-23")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("primary_Parent_Email  : "+primary_Parent_Email+"--->"+"primary_Parent_Email Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(1).getCell(23).getStringCellValue();
					 
					 String expected_validation1=sh1.getRow(2).getCell(23).getStringCellValue();
					
//					String expected_validation = Utility.get_validations_data(1,23);
//					String expected_validation1 = Utility.get_validations_data(2,23);
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

					driver.findElement(By.name("guardian_email")).clear();
					driver.findElement(By.name("guardian_email")).sendKeys(Utility.getdata(29,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("primary_Parent_Email   : "+primary_Parent_Email+"--->"+"primary_Parent_Email Success"+"--->"+result, true);
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
	
	public void Set_Primary_Parent_Phone(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String primary_Parent_Phone = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 2; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==2)
				{
					primary_Parent_Phone = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-25")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-25")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("primary_Parent_Phone  : "+primary_Parent_Phone+"--->"+"primary_Parent_Phone Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(3).getCell(23).getStringCellValue();
					
//					String expected_validation = Utility.get_validations_data(3,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }

					driver.findElement(By.name("guardian_phone_no")).clear();
					driver.findElement(By.name("guardian_phone_no")).sendKeys(Utility.getdata(30,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("primary_Parent_Phone   : "+primary_Parent_Phone+"--->"+"primary_Parent_Phone Success"+"--->"+result, true);
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
	
	public void Set_Primary_Parent_Employeer(WebDriver driver) throws InterruptedException, IOException
	{
		
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String primary_Parent_Employeer = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 3; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==3)
				{
					primary_Parent_Employeer = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("primary_Parent_Employeer  : "+primary_Parent_Employeer+"--->"+"primary_Parent_Employeer Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("guardian_employer")).clear();
					driver.findElement(By.name("guardian_employer")).sendKeys("Signature");
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("primary_Parent_Employeer   : "+primary_Parent_Employeer+"--->"+"primary_Parent_Employeer Success"+"--->"+result, true);
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
	
	public void Set_Work_number(WebDriver driver) throws InterruptedException, IOException
	{
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String work_number = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 4; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==4)
				{
					work_number = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("work_number  : "+work_number+"--->"+"work_number Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("guardian_work_no")).clear();
					driver.findElement(By.name("guardian_work_no")).sendKeys("7854414556");
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("work_number   : "+work_number+"--->"+"work_number Success"+"--->"+result, true);
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
	
	public void Set_Work_Email(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String work_Email = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		 Row	row=sh.getRow(i);
			for(int j= 5; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==5)
				{
					work_Email = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-31")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-31")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("work_Email  : "+work_Email+"--->"+"work_Email Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(4).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(4,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }

					driver.findElement(By.name("guardian_work_email")).clear();
					driver.findElement(By.name("guardian_work_email")).sendKeys(Utility.getdata(33,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("work_Email   : "+work_Email+"--->"+"work_Email Success"+"--->"+result, true);
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
	
//	public void set_Contact_Option(WebDriver driver)
//	{
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(Contact_Option).click().perform();
//		act.moveToElement(Contact_Option_1).click().perform();
//		
//	}
	
	public void Set_Contact_Language(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String contact_Language = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 6; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==6)
				{
					contact_Language = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name =Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-37")).isDisplayed();
				String actual_validation= driver.findElement(By.id("parsley-id-37")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("contact_Language  : "+contact_Language+"--->"+"contact_Language Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);

					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(5).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(5,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					driver.findElement(By.name("contact_language")).clear();
					driver.findElement(By.name("contact_language")).sendKeys(Utility.getdata(34,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("contact_Language   : "+contact_Language+"--->"+"contact_Language Success"+"--->"+result, true);
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
	
	public void Set_Name(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 7; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==7)
				{
					name = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-39")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-39")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("name  : "+name+"--->"+"name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);

					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(6).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(6,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					driver.findElement(By.name("contact1_name")).clear();
					driver.findElement(By.name("contact1_name")).sendKeys(Utility.getdata(35,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
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
	
	public void Set_Email(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String email = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 8; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==8)
				{
					email = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name = Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student =Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-41")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-41")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("email  : "+email+"--->"+"email Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(7).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(7,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }

					driver.findElement(By.name("contact1_email")).clear();
					driver.findElement(By.name("contact1_email")).sendKeys(Utility.getdata(36,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("email   : "+email+"--->"+"email Success"+"--->"+result, true);
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
	
	public void Set_Relationship_With_Student(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String relationship_With_Student = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 9; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==9)
				{
					relationship_With_Student = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name = Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			String phone_Number = Utility.getdata(38,1);
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-43")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-43")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("relationship_With_Student  : "+relationship_With_Student+"--->"+"relationship_With_Student Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					
					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(8).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(8,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }

					driver.findElement(By.name("contact1_relation")).clear();
					driver.findElement(By.name("contact1_relation")).sendKeys(Utility.getdata(37,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("relationship_With_Student   : "+relationship_With_Student+"--->"+"relationship_With_Student Success"+"--->"+result, true);
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
	
	public void Set_Phone_Number(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_6");
		String phone_Number = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 10; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==10)
				{
					phone_Number = cell.getStringCellValue();
				}
			}
			
			Full_Name.clear();
			String full_Name = Utility.getdata(28,1);
			Full_Name.sendKeys(full_Name);
			
			Primary_Parent_Email.clear();
			String primary_Parent_Email = Utility.getdata(29,1);
			Primary_Parent_Email.sendKeys(primary_Parent_Email);
			
			Primary_Parent_Phone.clear();
			String primary_Parent_Phone = Utility.getdata(30,1);
			Primary_Parent_Phone.sendKeys(primary_Parent_Phone);
			
			Primary_Parent_Employeer.clear();
			String primary_Parent_Employeer = Utility.getdata(31,1);
			Primary_Parent_Employeer.sendKeys(primary_Parent_Employeer);
			
			Work_number.clear();
			String work_number = Utility.getdata(32,1);
			Work_number.sendKeys(work_number);
			
			Work_Email.clear();
			String work_Email = Utility.getdata(33,1);
			Work_Email.sendKeys(work_Email);
			
			Actions act = new Actions(driver);
			act.moveToElement(Contact_Option).click().perform();
			act.moveToElement(Contact_Option_1).click().perform();
			
			Contact_Language.clear();
			String contact_Language = Utility.getdata(34,1);
			Contact_Language.sendKeys(contact_Language);
			
			Name.clear();
			String name = Utility.getdata(35,1);
			Name.sendKeys(name);
			
			Email.clear();
			String email = Utility.getdata(36,1);
			Email.sendKeys(email);
		
			Relationship_With_Student.clear();
			String relationship_With_Student = Utility.getdata(37,1);
			Relationship_With_Student.sendKeys(relationship_With_Student);
			
			Phone_Number.clear();
			Phone_Number.sendKeys(phone_Number);
			
			Name1.clear();
			String name1 = Utility.getdata(39,1);
			Name1.sendKeys(name1);
			
			Email1.clear();
			String email1 = Utility.getdata(40,1);
			Email1.sendKeys(email1);
			
			Relationship_With_Student1.clear();
			String relationship_With_Student1 = Utility.getdata(41,1);
			Relationship_With_Student1.sendKeys(relationship_With_Student1);
			
			Phone_Number1.clear();
			String phone_Number1 = Utility.getdata(42,1);
			Phone_Number1.sendKeys(phone_Number1);
			
			Next_Btn.click();
			Thread.sleep(2000);
			
			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.id("parsley-id-45")).isDisplayed();
				String actual_validation = driver.findElement(By.id("parsley-id-45")).getText();
				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("phone_Number  : "+phone_Number+"--->"+"phone_Number Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);

					Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(9).getCell(23).getStringCellValue();
					 
//					String expected_validation = Utility.get_validations_data(9,23);
					
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }

					driver.findElement(By.name("contact1_phone_no")).clear();
					driver.findElement(By.name("contact1_phone_no")).sendKeys(Utility.getdata(38,1));
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
				Boolean Family_Income = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='7. Family Income/Free and Reduced Lunch Form']")).isDisplayed();
				if(Family_Income==true)
				{
					result= "Pass";
					Reporter.log("phone_Number   : "+phone_Number+"--->"+"phone_Number Success"+"--->"+result, true);
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
	
//	public void Set_Name1(String name1) throws InterruptedException
//	{
//		Name1.clear();
//		Name1.sendKeys(name1);
//		
//	}
//	
//	public void Set_Email1(String email1) throws InterruptedException
//	{
//		Email1.clear();
//		Email1.sendKeys(email1);
//		
//	}
//	
//	public void Set_Relationship_With_Student1(String relationship_With_Student1) throws InterruptedException
//	{
//		Relationship_With_Student1.clear();
//		Relationship_With_Student1.sendKeys(relationship_With_Student1);
//		
//	}
//	
//	public void Set_Phone_Number1(String phone_Number1) throws InterruptedException
//	{
//		Phone_Number1.clear();
//		Phone_Number1.sendKeys(phone_Number1);
//		
//	}
//	
//	public void Click_Next_Btn() throws InterruptedException
//	{
//		Next_Btn.click();
//		Thread.sleep(2000);
//	}
	
	
	
	

}
