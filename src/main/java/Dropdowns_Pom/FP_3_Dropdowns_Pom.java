package Dropdowns_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FP_3_Dropdowns_Pom 
{
	
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Child_Lives_with;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Child_Lives_with_Both_Parents;	
	
	@FindBy(id = "father_name") private WebElement Father_First_last_Name;
	@FindBy(name = "father_address") private WebElement Father_Home_address;
	@FindBy(name = "father_city") private WebElement Father_City;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Father_State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[15]") private WebElement Father_State_1;
	@FindBy(name = "father_zip_code") private WebElement Father_Zip_Code;
	@FindBy(name = "father_phone_no") private WebElement Father_Cell_Number;
	@FindBy(name = "father_work_no") private WebElement Father_Work_Number;

	@FindBy(id = "mother_name") private WebElement Mother_First_last_Name;
	@FindBy(name = "mother_address") private WebElement Mother_Home_address;
	@FindBy(name = "mother_city") private WebElement Mother_City;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Mother_State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[65]") private WebElement Mother_State_1;
	@FindBy(name = "mother_zip_code") private WebElement Mother_Zip_Code;
	@FindBy(name = "mohter_phone_no") private WebElement Mother_Cell_Number;
	@FindBy(name = "mother_work_no") private WebElement Mother_Work_Number;
	
	@FindBy(xpath = "(//div[@class='fs-option-label'])[3]") private WebElement Child_Lives_with_Both_Parents_Alternately;

	@FindBy(id = "mother_check") private WebElement mother_check;
	
	@FindBy(id = "father_check") private WebElement father_check;
	
	
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Child_Lives_with_Mother_Only;

	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Child_Lives_with_Father_Only;
	
	@FindBy(xpath = "(//div[@class='fs-option-label'])[6]") private WebElement Child_Lives_with_Legal_Guardian;
	
	@FindBy(id = "adult_name") private WebElement Legal_Guardian_First_last_Name;
	@FindBy(name = "adult_address") private WebElement Legal_Guardian_Home_address;
	@FindBy(name = "adult_city") private WebElement Legal_Guardian_City;
	@FindBy(xpath = "(//div[@class='fs-label'])[4]") private WebElement Legal_Guardian_State;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[120]") private WebElement Legal_Guardian_State_1;
	@FindBy(name = "adult_zip_code") private WebElement Legal_Guardian_Zip_Code;
	
	@FindBy(xpath = "(//div[@class='fs-option-label'])[7]") private WebElement Child_Lives_with_Foster_Parents;
	
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Child_Lives_with_Other_Adult_Self;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public FP_3_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void set_Child_Lives_with_Both_Parents(WebDriver driver, String father_First_last_Name, String father_home_address, String father_city,String father_zip_Code,String father_cell_Number,String father_work_Number, String mother_First_last_Name, String mother_home_address, String mother_city,String mother_zip_Code,String mother_cell_Number,String mother_work_Number) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Both_Parents).click().perform();
		Reporter.log("Child_Lives_with_Both_Parents Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		Reporter.log("Father_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Father_Home_address.clear();
		Father_Home_address.sendKeys(father_home_address);
		Reporter.log("Father_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Father_City.clear();
		Father_City.sendKeys(father_city);
		Reporter.log("Father_City is entered", true);
		Reporter.log(" ", true);
		
		act.moveToElement(Father_State).click().perform();
		act.moveToElement(Father_State_1).click().perform();
		Reporter.log("Father_State is Selected", true);
		Reporter.log(" ", true);
		
		Father_Zip_Code.clear();
		Father_Zip_Code.sendKeys(father_zip_Code);
		Reporter.log("Father_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Father_Cell_Number.clear();
		Father_Cell_Number.sendKeys(father_cell_Number);
		Reporter.log("Father_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Father_Work_Number.clear();
		Father_Work_Number.sendKeys(father_work_Number);
		Reporter.log("Father_Work_Number is entered", true);
		Reporter.log(" ", true);
		
		
		Mother_First_last_Name.clear();
		Mother_First_last_Name.sendKeys(mother_First_last_Name);
		Reporter.log("Mother_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Mother_Home_address.clear();
		Mother_Home_address.sendKeys(mother_home_address);
		Reporter.log("Mother_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Mother_City.clear();
		Mother_City.sendKeys(mother_city);
		Reporter.log("Mother_City is entered", true);
		Reporter.log(" ", true);
		
		
		act.moveToElement(Mother_State).click().perform();
		act.moveToElement(Mother_State_1).click().perform();
		Reporter.log("Mother_State is Selected", true);
		Reporter.log(" ", true);
		
		Mother_Zip_Code.clear();
		Mother_Zip_Code.sendKeys(mother_zip_Code);
		Reporter.log("Mother_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Mother_Cell_Number.clear();
		Mother_Cell_Number.sendKeys(mother_cell_Number);
		Reporter.log("Mother_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Mother_Work_Number.clear();
		Mother_Work_Number.sendKeys(mother_work_Number);
		Reporter.log("Mother_Work_Number is entered", true);
		Reporter.log(" ", true);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		
	}
	
	public void set_Child_Lives_with_Both_Parents_Alternately(WebDriver driver, String father_First_last_Name, String father_home_address, String father_city,String father_zip_Code,String father_cell_Number,String father_work_Number, String mother_First_last_Name, String mother_home_address, String mother_city,String mother_zip_Code,String mother_cell_Number,String mother_work_Number) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Both_Parents_Alternately).click().perform();
		Reporter.log("Child_Lives_with_Both_Parents_Alternately is Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		mother_check.click();
		Thread.sleep(2000);
		
		father_check.click();
		Thread.sleep(2000);
		
		father_check.click();
		Reporter.log("Father Checkbox is selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		Reporter.log("Father_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Father_Home_address.clear();
		Father_Home_address.sendKeys(father_home_address);
		Reporter.log("Father_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Father_City.clear();
		Father_City.sendKeys(father_city);
		Reporter.log("Father_City is entered", true);
		Reporter.log(" ", true);
		
		act.moveToElement(Father_State).click().perform();
		act.moveToElement(Father_State_1).click().perform();
		Reporter.log("Father_State is Selected", true);
		Reporter.log(" ", true);
		
		Father_Zip_Code.clear();
		Father_Zip_Code.sendKeys(father_zip_Code);
		Reporter.log("Father_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Father_Cell_Number.clear();
		Father_Cell_Number.sendKeys(father_cell_Number);
		Reporter.log("Father_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Father_Work_Number.clear();
		Father_Work_Number.sendKeys(father_work_Number);
		Reporter.log("Father_Work_Number is entered", true);
		Reporter.log(" ", true);
		
				
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		father_check.click();
		Reporter.log("Father Checkbox is Deselected", true);
		Reporter.log(" ", true);

		Thread.sleep(2000);
		
		mother_check.click();
		Reporter.log("Mother Checkbox is selected", true);
		Reporter.log(" ", true);

		Thread.sleep(2000);
		

		Mother_First_last_Name.clear();
		Mother_First_last_Name.sendKeys(mother_First_last_Name);
		Reporter.log("Mother_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Mother_Home_address.clear();
		Mother_Home_address.sendKeys(mother_home_address);
		Reporter.log("Mother_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Mother_City.clear();
		Mother_City.sendKeys(mother_city);
		Reporter.log("Mother_City is entered", true);
		Reporter.log(" ", true);
		
		
		act.moveToElement(Mother_State).click().perform();
		act.moveToElement(Mother_State_1).click().perform();
		Reporter.log("Mother_State is Selected", true);
		Reporter.log(" ", true);
		
		Mother_Zip_Code.clear();
		Mother_Zip_Code.sendKeys(mother_zip_Code);
		Reporter.log("Mother_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Mother_Cell_Number.clear();
		Mother_Cell_Number.sendKeys(mother_cell_Number);
		Reporter.log("Mother_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Mother_Work_Number.clear();
		Mother_Work_Number.sendKeys(mother_work_Number);
		Reporter.log("Mother_Work_Number is entered", true);
		Reporter.log(" ", true);
				
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		father_check.click();
		Reporter.log("Both Father And Mother Checkboxes are selected", true);
		Reporter.log(" ", true);

		Thread.sleep(2000);
		
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		Reporter.log("Father_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Father_Home_address.clear();
		Father_Home_address.sendKeys(father_home_address);
		Reporter.log("Father_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Father_City.clear();
		Father_City.sendKeys(father_city);
		Reporter.log("Father_City is entered", true);
		Reporter.log(" ", true);
		
		act.moveToElement(Father_State).click().perform();
		act.moveToElement(Father_State_1).click().perform();
		Reporter.log("Father_State is Selected", true);
		Reporter.log(" ", true);
		
		Father_Zip_Code.clear();
		Father_Zip_Code.sendKeys(father_zip_Code);
		Reporter.log("Father_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Father_Cell_Number.clear();
		Father_Cell_Number.sendKeys(father_cell_Number);
		Reporter.log("Father_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Father_Work_Number.clear();
		Father_Work_Number.sendKeys(father_work_Number);
		Reporter.log("Father_Work_Number is entered", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Mother_First_last_Name.clear();
		Mother_First_last_Name.sendKeys(mother_First_last_Name);
		Reporter.log("Mother_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Mother_Home_address.clear();
		Mother_Home_address.sendKeys(mother_home_address);
		Reporter.log("Mother_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Mother_City.clear();
		Mother_City.sendKeys(mother_city);
		Reporter.log("Mother_City is entered", true);
		Reporter.log(" ", true);
		
		
		act.moveToElement(Mother_State).click().perform();
		act.moveToElement(Mother_State_1).click().perform();
		Reporter.log("Mother_State is Selected", true);
		Reporter.log(" ", true);
		
		Mother_Zip_Code.clear();
		Mother_Zip_Code.sendKeys(mother_zip_Code);
		Reporter.log("Mother_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Mother_Cell_Number.clear();
		Mother_Cell_Number.sendKeys(mother_cell_Number);
		Reporter.log("Mother_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Mother_Work_Number.clear();
		Mother_Work_Number.sendKeys(mother_work_Number);
		Reporter.log("Mother_Work_Number is entered", true);
		Reporter.log(" ", true);
			
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	
	public void set_Child_Lives_with_Mother_Only(WebDriver driver, String mother_First_last_Name, String mother_home_address, String mother_city,String mother_zip_Code,String mother_cell_Number,String mother_work_Number) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Mother_Only).click().perform();
		Reporter.log("Child_Lives_with_Mother_only Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);		
		
		Mother_First_last_Name.clear();
		Mother_First_last_Name.sendKeys(mother_First_last_Name);
		Reporter.log("Mother_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Mother_Home_address.clear();
		Mother_Home_address.sendKeys(mother_home_address);
		Reporter.log("Mother_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Mother_City.clear();
		Mother_City.sendKeys(mother_city);
		Reporter.log("Mother_City is entered", true);
		Reporter.log(" ", true);
		
		
		act.moveToElement(Mother_State).click().perform();
		act.moveToElement(Mother_State_1).click().perform();
		Reporter.log("Mother_State is Selected", true);
		Reporter.log(" ", true);
		
		Mother_Zip_Code.clear();
		Mother_Zip_Code.sendKeys(mother_zip_Code);
		Reporter.log("Mother_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Mother_Cell_Number.clear();
		Mother_Cell_Number.sendKeys(mother_cell_Number);
		Reporter.log("Mother_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Mother_Work_Number.clear();
		Mother_Work_Number.sendKeys(mother_work_Number);
		Reporter.log("Mother_Work_Number is entered", true);
		Reporter.log(" ", true);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		
	}
	
	public void set_Child_Lives_with_Father_Only(WebDriver driver, String father_First_last_Name, String father_home_address, String father_city,String father_zip_Code,String father_cell_Number,String father_work_Number) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Father_Only).click().perform();
		Reporter.log("Child_Lives_with_Father_Only Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		Reporter.log("Father_First_last_Name is entered", true);
		Reporter.log(" ", true);
		
		Father_Home_address.clear();
		Father_Home_address.sendKeys(father_home_address);
		Reporter.log("Father_Home_address is entered", true);
		Reporter.log(" ", true);
		
		Father_City.clear();
		Father_City.sendKeys(father_city);
		Reporter.log("Father_City is entered", true);
		Reporter.log(" ", true);
		
		act.moveToElement(Father_State).click().perform();
		act.moveToElement(Father_State_1).click().perform();
		Reporter.log("Father_State is Selected", true);
		Reporter.log(" ", true);
		
		Father_Zip_Code.clear();
		Father_Zip_Code.sendKeys(father_zip_Code);
		Reporter.log("Father_Zip_Code is entered", true);
		Reporter.log(" ", true);
		
		Father_Cell_Number.clear();
		Father_Cell_Number.sendKeys(father_cell_Number);
		Reporter.log("Father_Cell_Number is entered", true);
		Reporter.log(" ", true);
		
		Father_Work_Number.clear();
		Father_Work_Number.sendKeys(father_work_Number);
		Reporter.log("Father_Work_Number is entered", true);
		Reporter.log(" ", true);
	

		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Child_Lives_with_Legal_Guardian(WebDriver driver, String guardian_First_last_Name, String guardian_home_address, String guardian_city,String guardian_zip_Code) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Legal_Guardian).click().perform();
		Reporter.log("Child_Lives_with_Legal_Guardian Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Legal_Guardian_First_last_Name.clear();
		Legal_Guardian_First_last_Name.sendKeys(guardian_First_last_Name);
		Reporter.log("Legal_Guardian_First_last_Name is entered i.e. "+guardian_First_last_Name, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Home_address.clear();
		Legal_Guardian_Home_address.sendKeys(guardian_home_address);
		Reporter.log("Legal_Guardian_Home_address is entered i.e "+guardian_home_address, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_City.clear();
		Legal_Guardian_City.sendKeys(guardian_city);
		Reporter.log("Legal_Guardian_City is entered i.e. "+guardian_city, true);
		Reporter.log(" ", true);
		
		act.moveToElement(Legal_Guardian_State).click().perform();
		act.moveToElement(Legal_Guardian_State_1).click().perform();
		Reporter.log("Legal_Guardian_State is Selected", true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Zip_Code.clear();
		Legal_Guardian_Zip_Code.sendKeys(guardian_zip_Code);
		Reporter.log("Legal_Guardian_Zip_Code is entered i.e "+guardian_zip_Code, true);
		Reporter.log(" ", true);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	
	public void Child_Lives_with_Foster_Parents(WebDriver driver, String guardian_First_last_Name, String guardian_home_address, String guardian_city,String guardian_zip_Code) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Foster_Parents).click().perform();
		Reporter.log("Child_Lives_with_Foster_Parents Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Legal_Guardian_First_last_Name.clear();
		Legal_Guardian_First_last_Name.sendKeys(guardian_First_last_Name);
		Reporter.log("Foster_Parents_First_last_Name is entered i.e. "+guardian_First_last_Name, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Home_address.clear();
		Legal_Guardian_Home_address.sendKeys(guardian_home_address);
		Reporter.log("Foster_Parents_Home_address is entered i.e "+guardian_home_address, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_City.clear();
		Legal_Guardian_City.sendKeys(guardian_city);
		Reporter.log("Foster_Parents_City is entered i.e. "+guardian_city, true);
		Reporter.log(" ", true);
		
		act.moveToElement(Legal_Guardian_State).click().perform();
		act.moveToElement(Legal_Guardian_State_1).click().perform();
		Reporter.log("Foster_Parents_State is Selected", true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Zip_Code.clear();
		Legal_Guardian_Zip_Code.sendKeys(guardian_zip_Code);
		Reporter.log("Foster_Parents_Zip_Code is entered i.e "+guardian_zip_Code, true);
		Reporter.log(" ", true);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void Child_Lives_with_Other_Adult_Self(WebDriver driver, String guardian_First_last_Name, String guardian_home_address, String guardian_city,String guardian_zip_Code) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_Other_Adult_Self).click().perform();
		Reporter.log("Child_Lives_with_Other_Adult_Self Selected", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Legal_Guardian_First_last_Name.clear();
		Legal_Guardian_First_last_Name.sendKeys(guardian_First_last_Name);
		Reporter.log("Adult_First_last_Name is entered i.e. "+guardian_First_last_Name, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Home_address.clear();
		Legal_Guardian_Home_address.sendKeys(guardian_home_address);
		Reporter.log("Adult_Home_address is entered i.e "+guardian_home_address, true);
		Reporter.log(" ", true);
		
		Legal_Guardian_City.clear();
		Legal_Guardian_City.sendKeys(guardian_city);
		Reporter.log("Adult_City is entered i.e. "+guardian_city, true);
		Reporter.log(" ", true);
		
		act.moveToElement(Legal_Guardian_State).click().perform();
		act.moveToElement(Legal_Guardian_State_1).click().perform();
		Reporter.log("Adult_State is Selected", true);
		Reporter.log(" ", true);
		
		Legal_Guardian_Zip_Code.clear();
		Legal_Guardian_Zip_Code.sendKeys(guardian_zip_Code);
		Reporter.log("Adult_Zip_Code is entered i.e "+guardian_zip_Code, true);
		Reporter.log(" ", true);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
	}

	
	
	
	
}