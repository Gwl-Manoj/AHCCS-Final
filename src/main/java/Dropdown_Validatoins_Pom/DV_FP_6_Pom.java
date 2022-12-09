package Dropdown_Validatoins_Pom;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class DV_FP_6_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Full_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Primary_Parent_Email;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Primary_Parent_Phone;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Primary_Parent_Employeer;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement Work_number;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Work_Email;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Contact_Option;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[27]") private WebElement Contact_Option_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[25]") private WebElement Contact_Option_2;
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
	
	
	
	public DV_FP_6_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	public void set_Contact_Option(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Contact_Option).click().perform();
		act.moveToElement(Contact_Option_2).click().perform();
		
		Thread.sleep(2000);
		 Next_Btn.click();
		 Thread.sleep(2000);
		
		String result = null;
		 try
		 {

			 
			 Boolean iserror = driver.findElement(By.id("parsley-id-35")).isDisplayed();
			 String actual_validation = driver.findElement(By.id("parsley-id-35")).getText();
			
			 
			 if(iserror==true)
			 {
				 result = "Fail";
				 Reporter.log("Contact_Option : "+"--->"+" Contact_Option Success"+"--->"+result, true);
				 Reporter.log(" ", true);
				 
				 Sheet sh = Utility.getmultipledata("Validations");
				 String expected_validation=sh.getRow(10).getCell(23).getStringCellValue();
				 
//				 String expected_validation = Utility.get_validations_data(10,23);
				 if(actual_validation.equals(expected_validation))
				 {
					 Reporter.log("The validation message is same i.e "+actual_validation, true);
					 Reporter.log(" ", true);
				 }


				 act.moveToElement(Contact_Option).click().perform();
					act.moveToElement(Contact_Option_1).click().perform();
				 
				 Thread.sleep(2000);
				 Next_Btn.click();
				 Thread.sleep(2000);
				 
					

			 }
			 }

			 
			 
			 
			 catch(Exception e)
			 {
//				 Boolean Student_District = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='2. School District of Residence and Former School Information']")).isDisplayed();
//				 if(Student_District==true)
//				 {
//					 result= "Pass";
//				
//				 }
//				 Reporter.log("studentPhone : "+"--->"+" studentPhone Success"+"--->"+result, true);
//				 Reporter.log(" ", true);
//				 Thread.sleep(2000);
////				 driver.navigate().back();
//				 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
//				 Thread.sleep(2000);
				 
				 
			 }
		
		
	}
	
	
	
	
}
