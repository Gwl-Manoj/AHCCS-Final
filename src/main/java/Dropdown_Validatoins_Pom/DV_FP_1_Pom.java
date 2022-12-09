package Dropdown_Validatoins_Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class DV_FP_1_Pom
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_FirstName;
	@FindBy (xpath = "(//input[@class='form-control'])[2]") private WebElement Student_PreferredName;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Student_LastName;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Student_MiddleInitialName;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[1]") private WebElement Year_2;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Year_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Month;
	@FindBy(xpath = "(//div[@class='fs-option g0'])[25]") private WebElement Month_1;
	@FindBy(xpath = "(//div[@class='fs-option g0'])[25]") private WebElement Month_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Day;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[45]") private WebElement Day_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[4]") private WebElement Sex;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[68]") private WebElement Sex_Male;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Home_Address;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement City;
	@FindBy(xpath = "(//div[@class='fs-label'])[5]") private WebElement State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[71]") private WebElement State_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[70]") private WebElement State_12;
	@FindBy(xpath = "(//div[@class='fs-label'])[6]") private WebElement Country;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[76]") private WebElement Country_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[72]") private WebElement Country_12;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement ZipCode;
	@FindBy(name = "hasMailingAddress") private WebElement CheckBox;
	@FindBy(name = "mailing_address") private WebElement Student_Mail_Mailing_address;
	
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement City1;
	@FindBy(xpath = "(//div[@class='fs-label'])[7]") private WebElement State1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[141]") private WebElement State_2;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[140]") private WebElement State_22;
	@FindBy(xpath = "(//div[@class='fs-label'])[8]") private WebElement Country1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[171]") private WebElement Country_2;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[142]") private WebElement Country_22;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement ZipCode1;
	
	
	
	
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Student_Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Student_Mail;
	@FindBy (xpath = "(//div[@class='fs-label'])[9]") private WebElement Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[211]") private WebElement Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public DV_FP_1_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public void setDateofBirth_Year(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
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
		act.moveToElement(Year_2).click().perform();
		
		
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
		Student_Phone_Number.sendKeys(Utility.getdata(10,1));
		
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

		 
		 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
		 String actual_validation = driver.findElement(By.id("parsley-id-15")).getText();
		
		 
		 if(iserror==true)
		 {
			 result = "Fail";
			 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
			 Reporter.log(" ", true);
			 
			 Sheet sh = Utility.getmultipledata("Validations");
			 String expected_validation=sh.getRow(10).getCell(3).getStringCellValue();
			 
//			 String expected_validation = Utility.get_validations_data(10,3);
			 if(actual_validation.equals(expected_validation))
			 {
				 Reporter.log("The validation message is same for Year i.e "+actual_validation, true);
				 Reporter.log(" ", true);
			 }


			 act.moveToElement(Year).click().perform();
			 act.moveToElement(Year_1).click().perform();
			 
			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			 String actual_validation1 = driver.findElement(By.id("parsley-id-19")).getText();
			 
			 
			 String expected_validation1=sh.getRow(11).getCell(3).getStringCellValue();
			 
//			 String expected_validation1 = Utility.get_validations_data(11,3);
			 if(actual_validation1.equals(expected_validation1))
			 {
				 Reporter.log("The validation message is same for Month i.e "+actual_validation1, true);
				 Reporter.log(" ", true);
			 }

			 act.moveToElement(Month).click().perform();
			 act.moveToElement(Month_1).click().perform();

			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			 String actual_validation2 = driver.findElement(By.id("parsley-id-23")).getText();
			 
			
			 String expected_validation2=sh.getRow(12).getCell(3).getStringCellValue();
			 
//			 String expected_validation2 = Utility.get_validations_data(12,3);
			 if(actual_validation2.equals(expected_validation2))
			 {
				 Reporter.log("The validation message is same for Day i.e "+actual_validation2, true);
				 Reporter.log(" ", true);
			 }
			 act.moveToElement(Day).click().perform();
			 act.moveToElement(Day_1).click().perform();
			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			

	 }
	 }

	 
	 
	 
	 catch(Exception e)
	 {
//		 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//		 if(Student_District==true)
//		 {
//			 result= "Pass";
//		
//		 }
//		 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//		 Reporter.log(" ", true);
//		 Thread.sleep(2000);
////		 driver.navigate().back();
//		 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//		 Thread.sleep(2000);
		 
		 
	 }
	
 }

	



	
	
	


	public void set_State(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		

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
		act.moveToElement(State_12).click().perform();
		
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
		Student_Phone_Number.sendKeys(Utility.getdata(10,1));
		
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

		 
		 Boolean iserror = driver.findElement(By.xpath("(//ul[@class='parsley-errors-list filled'])[1]")).isDisplayed();
		 String actual_validation = driver.findElement(By.id("error_state")).getText();
		
		 
		 if(iserror==true)
		 {
			 result = "Fail";
			 Reporter.log("State : "+"--->"+" State Success"+"--->"+result, true);
			 Reporter.log(" ", true);
			 
			 Sheet sh = Utility.getmultipledata("Validations");
			 String expected_validation=sh.getRow(13).getCell(3).getStringCellValue();
			 
//			 String expected_validation = Utility.get_validations_data(13,3);
			 if(actual_validation.equals(expected_validation))
			 {
				 Reporter.log("The validation message is same i.e "+actual_validation, true);
				 Reporter.log(" ", true);
			 }


			 act.moveToElement(State).click().perform();
				act.moveToElement(State_1).click().perform();
			 
			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			 
			

	 }
	 }

	 
	 
	 
	 catch(Exception e)
	 {
//		 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//		 if(Student_District==true)
//		 {
//			 result= "Pass";
//		
//		 }
//		 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//		 Reporter.log(" ", true);
//		 Thread.sleep(2000);
////		 driver.navigate().back();
//		 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//		 Thread.sleep(2000);
		 
		 
	 }
	
		
	
	}
	
	public void set_Country(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{

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
		act.moveToElement(Country_12).click().perform();
		
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
		Student_Phone_Number.sendKeys(Utility.getdata(10,1));
		
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

		 
		 Boolean iserror = driver.findElement(By.id("parsley-id-39")).isDisplayed();
		 String actual_validation = driver.findElement(By.id("parsley-id-39")).getText();
		
		 
		 if(iserror==true)
		 {
			 result = "Fail";
			 Reporter.log("County : "+"--->"+" County Success"+"--->"+result, true);
			 Reporter.log(" ", true);
			 
			 Sheet sh = Utility.getmultipledata("Validations");
			 String expected_validation=sh.getRow(14).getCell(3).getStringCellValue();
			 
//			 String expected_validation = Utility.get_validations_data(14,3);
			 if(actual_validation.equals(expected_validation))
			 {
				 Reporter.log("The validation message is same i.e "+actual_validation, true);
				 Reporter.log(" ", true);
			 }


			 act.moveToElement(Country).click().perform();
			act.moveToElement(Country_1).click().perform();
			 
			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			 
			

	 }
	 }

	 
	 
	 
	 catch(Exception e)
	 {
//		 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//		 if(Student_District==true)
//		 {
//			 result= "Pass";
//		
//		 }
//		 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//		 Reporter.log(" ", true);
//		 Thread.sleep(2000);
////		 driver.navigate().back();
//		 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//		 Thread.sleep(2000);
		 
		 
	 }
	
		
	 
	
	}

	public void set_Country_Mailing_Address(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
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
		act.moveToElement(Country_22).click().perform();
		
		ZipCode1.clear();
		String zipcode1 = Utility.getdata(9,1);
		ZipCode1.sendKeys(zipcode1);
		
		Student_Phone_Number.clear();
		Student_Phone_Number.sendKeys(Utility.getdata(10,1));
		
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

		 
		 Boolean iserror = driver.findElement(By.id("parsley-id-56")).isDisplayed();
		 String actual_validation = driver.findElement(By.id("parsley-id-56")).getText();
		
		 
		 if(iserror==true)
		 {
			 result = "Fail";
			 Reporter.log("County : "+"--->"+" County Success"+"--->"+result, true);
			 Reporter.log(" ", true);
			 
			 Sheet sh = Utility.getmultipledata("Validations");
			 String expected_validation=sh.getRow(16).getCell(3).getStringCellValue();
			 
//			 String expected_validation = Utility.get_validations_data(16,3);
			 if(actual_validation.equals(expected_validation))
			 {
				 Reporter.log("The validation message is same i.e "+actual_validation, true);
				 Reporter.log(" ", true);
			 }


			 act.moveToElement(Country1).click().perform();
				act.moveToElement(Country_2).click().perform();
			 
			 Thread.sleep(2000);
			 Next_Btn.click();
			 Thread.sleep(2000);
			 
			

	 }
	 }

	 
	 
	 
	 catch(Exception e)
	 {
//		 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//		 if(Student_District==true)
//		 {
//			 result= "Pass";
//		
//		 }
//		 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//		 Reporter.log(" ", true);
//		 Thread.sleep(2000);
////		 driver.navigate().back();
//		 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//		 Thread.sleep(2000);
		 
		 
	 }
	}
	
	 public void set_State_Mailing_Address(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
		{
			
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
			act.moveToElement(State_22).click().perform();
			
			act.moveToElement(Country1).click().perform();
			act.moveToElement(Country_2).click().perform();
			
			ZipCode1.clear();
			String zipcode1 = Utility.getdata(9,1);
			ZipCode1.sendKeys(zipcode1);
			
			Student_Phone_Number.clear();
			Student_Phone_Number.sendKeys(Utility.getdata(10,1));
			
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

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-56")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-56")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("State : "+"--->"+" State Status"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(15).getCell(3).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(15,3);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(State1).click().perform();
					act.moveToElement(State_2).click().perform();
				 
				 Thread.sleep(2000);
				 Next_Btn.click();
				 Thread.sleep(2000);
				 
				

		 }
		 }

		 
		 
		 
		 catch(Exception e)
		 {
//			 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//			 if(Student_District==true)
//			 {
//				 result= "Pass";
//			
//			 }
//			 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//			 Reporter.log(" ", true);
//			 Thread.sleep(2000);
////			 driver.navigate().back();
//			 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//			 Thread.sleep(2000);
			 
			 
		 }
	
	}




}
