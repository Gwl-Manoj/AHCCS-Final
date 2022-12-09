package Dropdowns_Pom;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Library_Files.Utility;

public class FP_1_Dropdowns_Pom
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
	@FindBy(xpath = "(//div[@class='fs-option-label'])[211]") private WebElement Grade_7;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[212]") private WebElement Grade_8;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[213]") private WebElement Grade_9;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[214]") private WebElement Grade_10;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[215]") private WebElement Grade_11;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[216]") private WebElement Grade_12;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public FP_1_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Student_FirstName(String student_firstName) throws InterruptedException
	{
		Student_FirstName.clear();
		Thread.sleep(1000);
		Student_FirstName.sendKeys(student_firstName);
		Reporter.log("The first Name is entered", true);

	}
	
	public void Set_Student_PreferredName(String student_preferredName) throws InterruptedException
	{
		Student_PreferredName.clear();
		Thread.sleep(1000);
		Student_PreferredName.sendKeys(student_preferredName);
		Reporter.log("The Student Preffered Name is entered", true);

	}
	
	public void Set_Student_LastName(String student_LastName) throws InterruptedException
	{
		Student_LastName.clear();
		Thread.sleep(1000);
		Student_LastName.sendKeys(student_LastName);
		Reporter.log("The Last Name is entered", true);

	}
	
	public void Set_Student_MiddleInitialName(String student_MiddleInitialName) throws InterruptedException
	{
		Student_MiddleInitialName.clear();
		Thread.sleep(1000);
		Student_MiddleInitialName.sendKeys(student_MiddleInitialName);
		Reporter.log("The Middle Initial Name is entered", true);

	}
	
	public void setDateofBirth_Year(WebDriver driver) throws InterruptedException
	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(Year).click().perform();
//		act.moveToElement(Year_1).click().perform();
//		Reporter.log("The Date of year is selected", true);
		
		
		
		driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/div/form/div/div[5]/div/div[2]/div/div[1]/div")).click();
		
		int length = driver.findElements(By.xpath("/html/body/div/section/div/div[2]/div/div/form/div/div[5]/div/div[2]/div/div[2]/div[3]/div")).size();
		System.out.println(length);
		for (int i = 2; i <= length; i++) {
		
			String option = driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/div/form/div/div[5]/div/div[2]/div/div[2]/div[3]/div["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/div/form/div/div[5]/div/div[2]/div/div[2]/div[3]/div["+i+"]")).click();
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]")).getAttribute("innerText"));
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"));
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"));
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"));
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]")).getAttribute("innerText"));
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"));
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]")).getAttribute("innerText"));
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"));
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[22]")).getAttribute("innerText"));
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			System.out.println(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"));
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[23]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[24]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[25]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[26]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[27]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[28]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[29]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[30]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[31]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[32]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[36]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
	
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[37]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[50]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[61]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[2]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option g0'])[33]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-label'])[3]"))).click().perform();
			act.moveToElement(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]"))).click().perform();
			Reporter.log(driver.findElement(By.xpath("(//div[@class='fs-option-label'])[63]")).getAttribute("innerText"), true);
			Thread.sleep(1000);
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/div/form/div/div[5]/div/div[2]/div/div[1]/div")).click();
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
	
	}
	
	public void setDateofBirth_Month(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month).click().perform();
		act.moveToElement(Month_1).click().perform();
		Reporter.log("The Date of month is selected", true);
	}
	
	public void setDateofBirth_Day(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day).click().perform();
		act.moveToElement(Day_1).click().perform();
		Reporter.log("The Date is selected", true);
	}
	
	public void Verify_Sex(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Sex')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Sex')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Sex')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Sex')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Sex')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
		
	
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
	
	public void set_State(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'State ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'State ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'State ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'State ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'State ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
	
	}
	
	public void Set_country(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("(//label[contains(.,'County')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'County')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++) {
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'County')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'County')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'County')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	}
	
	public void set_Country1(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
//		WebElement element;
//		WebElement element1 = driver.findElement(By.xpath("//select[@id='county']"));
//		element = driver.findElement(By.cssSelector("#student_form > div > div:nth-child(10) > div > div.col-md-6.mt-4.dropdown-height > div"));
//		element.click();
//		Thread.sleep(2000);
//		Select sdropdown;
//		sdropdown = new Select(element1);
//
//		List<WebElement> alloptions = sdropdown.getOptions();
//		int count = alloptions.size();
//		System.out.println(count);
//
//		int i;
//		for ( i = 1; i <= count; i++ )
//		{
//		
////			element.click();	
//			
//			driver.findElement(By.xpath("(//div[@class='fs-label'])[6]")).click();
//			Thread.sleep(2000);
//		String listofvalue = alloptions.get(i).getText();
//		
//		sdropdown.selectByIndex(i);
//		System.out.println(listofvalue);
//		i++;
//		System.out.println(count);
//		}
		
		
		
//		Actions act = new Actions(driver);
//		act.moveToElement(Country).click().perform();
//		act.moveToElement(Country_1).click().perform();
		
//		List<WebElement> options = driver.findElements(By.xpath("//select[@id='county']/option"));
//		
//		WebElement option = driver.findElement(By.xpath("//select[@id='county']"));
//		 for(int i =0; i<options.size(); i++)
//		 {
////			 String Values = options.get(i).getAttribute("innerText");
//			 
//			 String Valuesd = options.get(i).getAccessibleName();
//			 
//			 Reporter.log(Valuesd, true);

			 
//		WebElement element;
//		element = driver.findElement(By.xpath("//select[@id='county']/option"));
//		element.click();
////		element =driver.findElement(By.cssSelector("#student_form > div > div:nth-child(10) > div > div.col-md-6.mt-4.dropdown-height > div > div.fs-label-wrap > span"));
//
//		Select sdropdown;
//		sdropdown = new Select(element);
//
//		List<WebElement> alloptions = sdropdown.getOptions();
//		int count = alloptions.size();
//		System.out.println(count);
//
////		int i=0;
////		for ( i = 1; i <= count; i++ )
////		{
//		
//			element.click();	
//			
//			
//		String listofvalue = alloptions.get(1).getText();
//		
//		sdropdown.selectByIndex(1);
//		System.out.println(listofvalue);
////		i++;
//
////		}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
//			 WebElement element = options.get(i);
//			 
////			 driver.findElement(By.xpath("(//div[@class='fs-label'])[6]")).click();
////			 Thread.sleep(2000);
//			 Select select = new Select(element);
//			 Thread.sleep(2000);
//			 
//			 select.getOptions();
			 
//			// Javascript executor class with executeScript method
//		      JavascriptExecutor j = (JavascriptExecutor) driver;
//		     
//		      j.executeScript ("document.getElementById('county').click();");
//			 select.selectByIndex(i);
//			 
//			 Thread.sleep(2000);
//			 ZipCode.clear();
//			 String zipcode = Utility.getdata(9,1);
//			 ZipCode.sendKeys(zipcode);
//			 
//			 Student_Mail_Mailing_address.clear();
//			 String student_Mail_Mailing_address = Utility.getdata(7,1);
//				Student_Mail_Mailing_address.sendKeys(student_Mail_Mailing_address);
			 
			 
//		 }
		
		List<WebElement> options = driver.findElements(By.xpath("(//div[@class='fs-options'])[6]//div[@class='fs-option-label']"));
		
		for(int i=1;i<=options.size();i++)
		{	
	

			
			String values = options.get(i).getAttribute("innerText");
			Reporter.log(values, true);
			
			WebElement element = options.get(i);
			
			driver.findElement(By.xpath("(//div[@class='fs-label'])[6]")).click();
			Thread.sleep(2000);
			
			element.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@class='col-md-12 mt-4'])[6]")).click();
			Thread.sleep(2000);
			
//			Next_Btn.click();
//			Thread.sleep(2000);
//			
//			driver.navigate().back();
//			Thread.sleep(2000);
			
		
		}	
		 
		
//		Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='county']")));
//		int noOfDropDownValues=  dropdown.getOptions().size()-1;
//
//		for(int i=1;i<noOfDropDownValues;i++){
//		    new Select(driver.findElement(By.xpath("//select[@id='county']"))).selectByValue(String.valueOf(i));
//		}
		
		   
		 
	
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
	
	public void set_State_Mailing_address(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'State ')])[2]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'State ')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'State ')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'State ')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'State ')])[2]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	
	}
	
	public void set_Country_Mailing_Address(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'County')])[2]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'County')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++) {
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'County')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'County')])[2]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'County')])[2]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	
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
	
	
	public void set_Grade(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Entering Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Entering Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Entering Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Entering Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Entering Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
		
//		Actions act = new Actions(driver);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_7).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_8).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_9).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_10).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_11).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.moveToElement(Grade).click().perform();
//		act.moveToElement(Grade_12).click().perform();
//		Next_Btn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//	
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}

}
