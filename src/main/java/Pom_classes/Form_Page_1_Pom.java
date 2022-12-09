package Pom_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_1_Pom
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
	@FindBy(xpath = "(//div[@class='fs-option-label'])[40]") private WebElement Day_1;
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
	@FindBy(xpath = "(//div[@class='fs-option-label'])[143]") private WebElement Country_2;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement ZipCode1;
	
	
	
	
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Student_Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Student_Mail;
	@FindBy (xpath = "(//div[@class='fs-label'])[9]") private WebElement Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[211]") private WebElement Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public Form_Page_1_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Student_FirstName(String student_firstName) throws InterruptedException
	{
		Student_FirstName.clear();
		Thread.sleep(1000);
		Student_FirstName.sendKeys(student_firstName);
//		Reporter.log("The first Name is entered", true);
		System.out.println("The first Name is entered");
//		Reporter.log(" ", true);

	}
	
	public void Set_Student_PreferredName(String student_preferredName) throws InterruptedException
	{
		Student_PreferredName.clear();
		Thread.sleep(1000);
		Student_PreferredName.sendKeys(student_preferredName);
		Reporter.log("The Student Preffered Name is entered", true);
		Reporter.log(" ",true);

	}
	
	public void Set_Student_LastName(String student_LastName) throws InterruptedException
	{
		Student_LastName.clear();
		Thread.sleep(1000);
		Student_LastName.sendKeys(student_LastName);
		Reporter.log("The Last Name is entered", true);
		Reporter.log(" ", true);

	}
	
	public void Set_Student_MiddleInitialName(String student_MiddleInitialName) throws InterruptedException
	{
		Student_MiddleInitialName.clear();
		Thread.sleep(1000);
		Student_MiddleInitialName.sendKeys(student_MiddleInitialName);
		Reporter.log("The Middle Initial Name is entered", true);
		Reporter.log(" ", true);
	
	}
	
	public void setDateofBirth_Year(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Actions act = new Actions(driver);
		act.moveToElement(Year).click().perform();
		act.moveToElement(Year_1).click().perform();
		Reporter.log("The Date of year is selected", true);
		Reporter.log(" ", true);
	}
	
	public void setDateofBirth_Month(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month).click().perform();
		act.moveToElement(Month_1).click().perform();
		Reporter.log("The Date of month is selected", true);
		Reporter.log(" ", true);
	}
	
	public void setDateofBirth_Day(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day).click().perform();
		act.moveToElement(Day_1).click().perform();
		Reporter.log("The Date is selected", true);
		Reporter.log(" ", true);
	}
	
	public void set_Sex(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Sex).click().perform();
		act.moveToElement(Sex_Male).click().perform();
		Reporter.log("The gender is selected", true);
		Reporter.log(" ", true);
	
	}
	
	public void Set_Home_Address(String home_Address) throws InterruptedException
	{
		Home_Address.clear();
		Thread.sleep(1000);
		Home_Address.sendKeys(home_Address);
		
	
	}
	
	public void Set_City(String city) throws InterruptedException
	{
		City.clear();
		Thread.sleep(1000);
		City.sendKeys(city);
		
	}
	
	public void set_State(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State).click().perform();
		act.moveToElement(State_1).click().perform();
	
	}
	
	public void set_Country(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Country).click().perform();
		act.moveToElement(Country_1).click().perform();
	
	}
	
	public void Set_ZipCode(String city) throws InterruptedException
	{
		ZipCode.clear();
		Thread.sleep(1000);
		ZipCode.sendKeys(city);
		
	}
	
	public void Click_ChechBox()
	{
		if(CheckBox.isSelected())
		{
		Reporter.log("The checkbox is already selected", true);	
		Reporter.log(" ", true);
		}
		else
		{
			CheckBox.click();
		}
		
//		CheckBox.click();
		
	}
	
	public void Student_Mail_Mailing_address(String student_Mail_Mailing_address)
	{
		Student_Mail_Mailing_address.clear();
		Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
		
	}
	
	public void Set_City_Mailing_Address(String city) throws InterruptedException
	{
		City1.clear();
		Thread.sleep(1000);
		City1.sendKeys(city);

	}
	
	public void set_State_Mailing_address(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State1).click().perform();
		act.moveToElement(State_2).click().perform();
	
	}
	
	public void set_Country_Mailing_Address(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Country1).click().perform();
		act.moveToElement(Country_2).click().perform();
	
	}
	
	public void Set_ZipCode_Mailing_Address(String zipcode) throws InterruptedException
	{
		ZipCode1.clear();
		Thread.sleep(1000);
		ZipCode1.sendKeys(zipcode);
	
	}
	
	public void Set_StudentPhone(String city) throws InterruptedException
	{
		Student_Phone_Number.clear();
		Thread.sleep(1000);
		Student_Phone_Number.sendKeys(city);
	
	}
	
	public void Set_StudentMail(String city) throws InterruptedException
	{
		Student_Mail.clear();
		Thread.sleep(1000);
		Student_Mail.sendKeys(city);
	
	}
	
	
	public void set_Grade(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Grade).click().perform();
		act.moveToElement(Grade_1).click().perform();
	
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_1(WebDriver driver, String fname, String Pname, String Lname, String MiddleName, String H_address, String city,String zipcode, String Mailing_Address, String Mailing_city, String Mailing_zipcode, String s_phone, String s_mail   ) throws InterruptedException,  IOException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Set_Student_FirstName(fname);
		
		Set_Student_PreferredName(Pname);
		
		Set_Student_LastName(Lname);
		
		Set_Student_MiddleInitialName(MiddleName);
		
		setDateofBirth_Year(driver);
		
		setDateofBirth_Month(driver);
		
		setDateofBirth_Day(driver);
		
		set_Sex(driver);
		
		Set_Home_Address(H_address);
		
		js.executeScript("window.scrollBy(0,300)");
		
		Set_City(city);
		
		set_State(driver);
		
		set_Country(driver);
		
		Set_ZipCode(zipcode);
		
		Click_ChechBox();
		
		Student_Mail_Mailing_address(Mailing_Address);
		
		js.executeScript("window.scrollBy(0,300)");
		
		Set_City_Mailing_Address(Mailing_city);
		
		set_State_Mailing_address(driver);
		
		set_Country_Mailing_Address(driver);
		
		Set_ZipCode_Mailing_Address(Mailing_zipcode);		
		
		Set_StudentPhone(s_phone);
		
		Set_StudentMail(s_mail);
		
		js.executeScript("window.scrollBy(0,300)");
		
		set_Grade(driver);
		
		Click_Next_Btn();

			
	}

}
