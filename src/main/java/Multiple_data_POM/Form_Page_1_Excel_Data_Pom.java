package Multiple_data_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class Form_Page_1_Excel_Data_Pom
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_FirstName;
	@FindBy (xpath = "(//input[@class='form-control'])[2]") private WebElement Student_PreferredName;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Student_LastName;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Student_MiddleInitialName;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Year_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Month;
	@FindBy(xpath = "(//div[@class='fs-option g0'])[25]") private WebElement Month_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Day;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[45]") private WebElement Day_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[4]") private WebElement Sex;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[68]") private WebElement Sex_Male;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Home_Address;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement City;
	@FindBy(xpath = "(//div[@class='fs-label'])[5]") private WebElement State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[71]") private WebElement State_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[6]") private WebElement Country;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[76]") private WebElement Country_1;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement ZipCode;
	@FindBy(name = "hasMailingAddress") private WebElement CheckBox;
	@FindBy(name = "mailing_address") private WebElement Student_Mail_Mailing_address;
	
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement City1;
	@FindBy(xpath = "(//div[@class='fs-label'])[7]") private WebElement State1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[141]") private WebElement State_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[8]") private WebElement Country1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[171]") private WebElement Country_2;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement ZipCode1;
	
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Student_Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Student_Mail;
	@FindBy (xpath = "(//div[@class='fs-label'])[9]") private WebElement Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[211]") private WebElement Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement School_District;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement School_District_1;
	
	public Form_Page_1_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Student_FirstName(WebDriver driver) throws InterruptedException, IOException
	{
		

		
		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String First_Name = null;
		 String result = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 0; j<row.getLastCellNum(); j++)
			 {
				 Cell cell = row.getCell(j);
				 
				 if(j==0)
				 {
					 First_Name = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	Student_FirstName.sendKeys(First_Name);
			 		
			 	Student_PreferredName.clear();
			 	String student_preferredName = Utility.getdata(4,1);
				Student_PreferredName.sendKeys(student_preferredName);
					
			 
				Student_LastName.clear();
				String student_LastName = Utility.getdata(5,1);
				Student_LastName.sendKeys(student_LastName);
				
				
				Student_MiddleInitialName.clear();
				String student_MiddleInitialName = Utility.getdata(6, 1);
				Student_MiddleInitialName.sendKeys(student_MiddleInitialName);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_Address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_Address);
				
				City.clear();
				String city=Utility.getdata(8,1);
				City.sendKeys(city, Keys.TAB);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				

			 
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("First Name : "+First_Name+"--->"+"First Name Success"+"--->"+result, true);
				 Reporter.log(" ", true);

				 Thread.sleep(2000);

				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }
			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).getText();
				
				 if(iserror==true)
				 {
					 result = "Fail";
					 Reporter.log("First Name : "+First_Name+"--->"+"First Name Status"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(1).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(1,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='first_name'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='first_name'])")).sendKeys(Utility.getdata(3,1), Keys.TAB);
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);	
					 
				 }
				
			 }
			 

		 }
	
	}
	
	public void Set_Student_PreferredName(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{

		
		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String Preffered_Name = null;
		 
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 1; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==1)
				 {
					 Preffered_Name = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	Student_PreferredName.sendKeys(Preffered_Name);
			 
			 	Student_LastName.clear();
				String student_LastName = Utility.getdata(5,1);
				Student_LastName.sendKeys(student_LastName);
				
				
				Student_MiddleInitialName.clear();
				String student_MiddleInitialName = Utility.getdata(6, 1);
				Student_MiddleInitialName.sendKeys(student_MiddleInitialName);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_Address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_Address);
				
				City.clear();
				String city=Utility.getdata(8,1);
				City.sendKeys(city, Keys.TAB);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("(//div[@class='fs-label'])[1]")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Preffered Name : "+Preffered_Name+"--->"+"Preffered Name Success"+"--->"+result, true);
				 Reporter.log(" ", true);

				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
//				 String Actual_Validation = driver.findElement(By.id("parsley-id-9")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 Reporter.log("Preffered Name : "+Preffered_Name+"--->"+"Preffered Name Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					
				 }
				 
				 
			 }
			 
		 }
		
			 
			 
			 
			 
			 
		
		
		
	}
	
	public void Set_Student_LastName(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String Last_Name = null;
		
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 2; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==2)
				 {
					 Last_Name = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	Student_LastName.sendKeys(Last_Name);
			 	
				Student_MiddleInitialName.clear();
				String student_MiddleInitialName = Utility.getdata(6, 1);
				Student_MiddleInitialName.sendKeys(student_MiddleInitialName);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_Address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_Address);
				
				City.clear();
				String city=Utility.getdata(8,1);
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Last Name : "+Last_Name+"--->"+"Last Name Status"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-9")).getText();
						 
				 if(iserror==true)
				 {
					 result = "Fail";
					 Reporter.log("Last Name : "+Last_Name+"--->"+"Last Name Status"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(2).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(2,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='last_name'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='last_name'])")).sendKeys(Utility.getdata(5,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				 
				 	
				 
				 
//				 System.out.println("First Name : "+First_Name+"--->"+"password : "+password+"--->"+"Login Success"+"--->"+result);
			 }
			
		 }
		
			
		
		
	}
	
	public void Set_Student_MiddleInitialName(WebDriver driver) throws InterruptedException, IOException
	{

		
	

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String MiddleInitial_Name = null;
		
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 3; j<row.getLastCellNum(); j++)
			 {
				 Cell cell = row.getCell(j);
				 
				 if(j==3)
				 {
					 MiddleInitial_Name = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_Address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_Address);
				
				City.clear();
				String city=Utility.getdata(8,1);
				City.sendKeys(city, Keys.TAB);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("MiddleInitial_Name : "+MiddleInitial_Name+"--->"+" MiddleInitial_Name Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
//				 driver.navigate().back();
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 
				 if(iserror==true)
				 {
					 result = "Fail";
					
				 }
				 Reporter.log("MiddleInitial_Name : "+MiddleInitial_Name+"--->"+" MiddleInitial_Name Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 

			 }
			 Student_MiddleInitialName.clear();
		 }
		
			
		
	
	
	}
		
		

	public void Set_Home_Address(WebDriver driver) throws InterruptedException, IOException
	{

		
	
		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String home_address = null;
		
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 4; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==4)
				 {
					 home_address = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city=Utility.getdata(8,1);
				City.sendKeys(city, Keys.TAB);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Home Address : "+home_address+"--->"+" Home Address Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);

				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }
//			 catch(NoSuchElementException ex)
//			 {
//				 boolean emailerror = driver.findElement(By.id("email-error")).isDisplayed();
//				 if(emailerror==true)
//				 {
//					 result="Fail";
//				 }				
//				 System.out.println("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Success"+"--->"+result);
//				 
//			 }
			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-29")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("Home Address : "+home_address+"--->"+" Home Address Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(3).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(3,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='address'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='address'])")).sendKeys(Utility.getdata(7,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				
				 
			 }
			
		 }
		
			
		
	
		
		
	}
//	
	public void Set_City(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String city = null;
		
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 5; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==5)
				 {
					 city = cell.getStringCellValue();
				 }
//				 if(j==1)
//				 {
//					 password = cell.getStringCellValue();
//				 }
			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("City : "+city+"--->"+" City Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-31")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("City : "+city+"--->"+" City Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(4).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(4,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='city'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='city'])")).sendKeys(Utility.getdata(8,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				 
				 
			 }
			
		 }
		
			
		
		
	}

	
	
	public void Set_ZipCode(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String zipcode = null;
		 
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 6; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==6)
				 {
					 zipcode = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("ZipCode : "+zipcode+"--->"+" ZipCode Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
//				 driver.navigate().back();
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }
	 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-41")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("ZipCode : "+zipcode+"--->"+" ZipCode Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(5).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(5,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='zip_code'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='zip_code'])")).sendKeys(Utility.getdata(9,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				 
			 }
			 
		 }
		
			
		
		
	}
	
	

	
	public void Student_Mail_Mailing_address(WebDriver driver) throws IOException, InterruptedException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String Mailing_address = null;
		
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 4; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==4)
				 {
					 Mailing_address = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				Student_Mail_Mailing_address.sendKeys(Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Student_Mail_Mailing_address : "+Mailing_address+"--->"+" Student_Mail_Mailing_address Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
//				 driver.navigate().back();
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-46")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("Student_Mail_Mailing_address : "+Mailing_address+"--->"+" Student_Mail_Mailing_address Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(6).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(6,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='mailing_address'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='mailing_address'])")).sendKeys(Utility.getdata(7,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				
				 
//				 
			 }
			 
		 }
		
	}
	
	public void Set_City_Mailing_Address(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String Mailing_city = null;
		
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 5; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==5)
				 {
					 Mailing_city = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(Mailing_address);
				
				City1.clear();
				City1.sendKeys(Mailing_city);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Mailing_city : "+Mailing_city+"--->"+" Mailing_city Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
//				 driver.navigate().back();
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation = driver.findElement(By.id("parsley-id-48")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("Mailing_city : "+Mailing_city+"--->"+" Mailing_city Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(7).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(7,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='mailing_city'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='mailing_city'])")).sendKeys(Utility.getdata(8,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					 
					
				 }
				
				 
			 }
			
		 }
		
		
	}
	

	
	public void Set_ZipCode_Mailing_Address(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String Mailing_zipcode = null;
		 
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 6; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==6)
				 {
					 Mailing_zipcode = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(Mailing_address);
				
				City1.clear();
				String Mailing_city = Utility.getdata(8,1);
				City1.sendKeys(Mailing_city);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				ZipCode1.sendKeys(Mailing_zipcode);
				
				Student_Phone_Number.clear();
				String phonenumber = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(phonenumber);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("Mailing_zipcode : "+Mailing_zipcode+"--->"+" Mailing_zipcode Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }
			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 String actual_validation= driver.findElement(By.id("parsley-id-58")).getText();
				 if(iserror==true)
				 {
					 result = "Fail";
					 
					 Reporter.log("Mailing_zipcode : "+Mailing_zipcode+"--->"+" Mailing_zipcode Success"+"--->"+result, true);
					 Reporter.log(" ", true);
					 
					 Sheet sh1 = Utility.getmultipledata("Validations");
					 String expected_validation=sh1.getRow(8).getCell(3).getStringCellValue();
					 
//					 String expected_validation = Utility.get_validations_data(8,3);
					 if(actual_validation.equals(expected_validation))
					 {
						 Reporter.log("The validation message is same i.e "+actual_validation, true);
						 Reporter.log(" ", true);
					 }
					 
					 driver.findElement(By.xpath("(//input[@name='mailing_zip_code'])")).clear();
					 driver.findElement(By.xpath("(//input[@name='mailing_zip_code'])")).sendKeys(Utility.getdata(9,1));
					 Thread.sleep(2000);
					 Next_Btn.click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
					 Thread.sleep(2000);
					
				 }
				
				 
			 }
			
		 }
		
		
		
	}
	
	
	
	
	
//	
	public void Set_StudentPhone(WebDriver driver) throws InterruptedException, IOException
	{

		

		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String studentPhone = null;
		 
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 7; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==7)
				 {
					 studentPhone = cell.getStringCellValue();
				 }

			 }
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				Student_Phone_Number.sendKeys(studentPhone);
				
				Student_Mail.clear();
				String mail = Utility.getdata(11,1);
				Student_Mail.sendKeys(mail);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
				
				
			 
			 
			 
			 
			 String result = null;
			 try
			 {
				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
				 if(Student_District==true)
				 {
					 result= "Pass";
				
				 }
				 Reporter.log("studentPhone : "+studentPhone+"--->"+" studentPhone Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 Thread.sleep(2000);
//				 driver.navigate().back();
				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
				 Thread.sleep(2000);
				 
			 }

			 
			 
			 
			 catch(Exception e)
			 {
				 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
				 
				 if(iserror==true)
				 {
					 result = "Fail";
					
				 }
				 Reporter.log("studentPhone : "+studentPhone+"--->"+" studentPhone Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
			 }
			
		 }
		
			
	
		
		
	}
	
	public void Set_StudentMail(WebDriver driver) throws InterruptedException, IOException
	{
		
		Sheet sh = Utility.getmultipledata("Form_Page_1");
		 String studentMail = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			Row row=sh.getRow(i);
			 for(int j= 8; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==8)
				 {
					 studentMail = cell.getStringCellValue();
				 }

			 }
		 
			 
			 	Student_FirstName.clear();
			 	String student_firstName = Utility.getdata(3,1);
			 	Student_FirstName.sendKeys(student_firstName);
			 
			 	
			 	Student_PreferredName.clear();
			 	String preffered_Name = Utility.getdata(4,1);
			 	Student_PreferredName.sendKeys(preffered_Name);
	
			 	Student_LastName.clear();
			 	String student_LastName = Utility.getdata(5,1);
			 	Student_LastName.sendKeys(student_LastName);
			 	
				Student_MiddleInitialName.clear();
				String MiddleInitial_Name = Utility.getdata(6,1);
				Student_MiddleInitialName.sendKeys(MiddleInitial_Name);
				
				Actions act = new Actions(driver);
				act.moveToElement(Year).click().perform();
				act.moveToElement(Year_1).click().perform();
				
				
				act.moveToElement(Month).click().perform();
				act.moveToElement(Month_1).click().perform();
				
				act.moveToElement(Day).click().perform();
				act.moveToElement(Day_1).click().perform();
				
				act.moveToElement(Sex).click().perform();
				act.moveToElement(Sex_Male).click().perform();
				
				
				Home_Address.clear();
				String home_address = Utility.getdata(7,1);
				Home_Address.sendKeys(home_address);
				
				City.clear();
				String city = Utility.getdata(8,1) ;
				City.sendKeys(city);
				
				act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
				
				act.moveToElement(Country).click().perform();
				act.moveToElement(Country_1).click().perform();
				
				ZipCode.clear();
				String zipcode = Utility.getdata(9,1);
				ZipCode.sendKeys(zipcode);
				
				if(CheckBox.isEnabled())
				{
					Reporter.log("The checkbox is already selected", true);
					Reporter.log(" ", true);
				}
				else
				{
					CheckBox.click();
				}
				
				Student_Mail_Mailing_address.clear();
				String student_Mail_Mailing_address = Utility.getdata(7,1);
				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
				
				City1.clear();
				String city1=Utility.getdata(8,1);
				City1.sendKeys(city1);
				
				act.moveToElement(State1).click().perform();
				act.moveToElement(State_2).click().perform();
				
				act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
				
				ZipCode1.clear();
				String zipcode1 = Utility.getdata(9,1);
				ZipCode1.sendKeys(zipcode1);
				
				Student_Phone_Number.clear();
				String studentPhone = Utility.getdata(10,1);
				Student_Phone_Number.sendKeys(studentPhone);
				
				Student_Mail.clear();
				Student_Mail.sendKeys(studentMail,Keys.TAB);
				
				act.moveToElement(Grade).click().perform();
				act.moveToElement(Grade_1).click().perform();
				
				Next_Btn.click();
				Thread.sleep(2000);
			 
			 
			
			 
				 String result = null;
				 
				 try
				 {
					 boolean emailerror = driver.findElement(By.xpath("//li[text()='Please enter valid email address.']")).isDisplayed();
					 String actual_validation= driver.findElement(By.id("parsley-id-62")).getText();

					 if(emailerror==true)
					 {
						 result="Fail";
						 //						 System.out.println("User Name : "+studentMail+"--->"+"--->"+"Student_Mail Failed-- Please enter a valid email address. "+"--->"+result);
						 Reporter.log("User Name : "+studentMail+"--->"+"--->"+"Student_Mail Failed-- Please enter a valid email address. "+"--->"+result,true);
						 Reporter.log(" ", true);
						 
						 Sheet sh1 = Utility.getmultipledata("Validations");
						 String expected_validation=sh1.getRow(9).getCell(3).getStringCellValue();
						 
//						 String expected_validation = Utility.get_validations_data(9,3);
						 if(actual_validation.equals(expected_validation))
						 {
							 Reporter.log("The validation message is same i.e "+actual_validation, true);
							 Reporter.log(" ", true);
						 }
						 driver.findElement(By.xpath("(//input[@name='email'])")).clear();
						 driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys(Utility.getdata(11,1));
						 Next_Btn.click();
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
						 Thread.sleep(2000);	 


				 }

					 
				 }
					 
					 catch(Exception e )
					 {
 
					 }
				 
				 try
				 {
					 boolean Page_2 = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
					 
					 if(Page_2==true)
						 
					 {
						 result= "Pass";
						 Reporter.log("Student_Mail : "+studentMail+"--->"+" Student_Mail Success"+"--->"+result, true);
						 Reporter.log(" ", true);
						 
					
							driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
							Thread.sleep(2000);	 
					 }	
				 
				 }
				 catch(Exception e)
				 {
					 
				 }
				 


			 
		 }
	}
}	
			
		
	
	
	
		 	
	


