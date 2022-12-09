package Other_Alternate_Options_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_5_Pom 
{
	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement education_service_Radio;
	@FindBy(name = "challenge_type") private WebElement challenge_type;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[3]") private WebElement medical_accommodations_Radio;
	@FindBy(name = "medical_need") private WebElement medical_need;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[5]") private WebElement learning_program_Radio;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[7]") private WebElement foreign_exchange_Radio;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[9]") private WebElement meal_plan_Radio;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[11]") private WebElement current_grade_Radio;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[13]") private WebElement national_guard_Radio;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement education_service_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[4]") private WebElement medical_accommodations_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[6]") private WebElement learning_program_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[8]") private WebElement foreign_exchange_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[10]") private WebElement meal_plan_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[12]") private WebElement current_grade_Radio1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[14]") private WebElement national_guard_Radio1;
	
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Ethinicity;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Ethinicity_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Race;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Race_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement State_Of_Birth;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[16]") private WebElement State_Of_Birth_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public Form_Page_5_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_education_service_Radio() throws InterruptedException
	{
		education_service_Radio.click();
		Thread.sleep(2000);
		challenge_type.clear();
		challenge_type.sendKeys("Child's Challenge");
		Reporter.log("education_service_Radio Yes selected", true);
		Reporter.log("																", true);
		
		
	}
	
	public void Click_medical_accommodations_Radio() throws InterruptedException
	{
		medical_accommodations_Radio.click();
		Thread.sleep(2000);
		medical_need.clear();
		medical_need.sendKeys("medical_need");
		Reporter.log("medical_accommodations_Radio Yes selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_learning_program_Radio() throws InterruptedException
	{
		learning_program_Radio.click();
		Thread.sleep(2000);
		Reporter.log("learning_program_Radio Yes selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_foreign_exchange_Radio() throws InterruptedException
	{
		foreign_exchange_Radio.click();
		Thread.sleep(2000);
		Reporter.log("foreign_exchange_Radio Yes selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_meal_plan_Radio() throws InterruptedException
	{
		meal_plan_Radio.click();
		Thread.sleep(2000);
		Reporter.log("meal_plan_Radio Yes selected", true);
		Reporter.log("																", true);
	}
	
	public void Set_Year(String year) throws InterruptedException
	{
		Year.clear();
		Year.sendKeys(year);		
	}
	
	public void Click_current_grade_Radio() throws InterruptedException
	{
		current_grade_Radio.click();
		Thread.sleep(2000);
		Reporter.log("current_grade_Radio Yes selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_national_guard_Radio() throws InterruptedException
	{
		national_guard_Radio.click();
		Thread.sleep(2000);
	}
	
	public void set_Ethinicity(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions act = new Actions(driver);
		act.moveToElement(Ethinicity).click().perform();
		act.moveToElement(Ethinicity_1).click().perform();
		
	}
	
	public void set_Race(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Race).click().perform();
		act.moveToElement(Race_1).click().perform();
		
	}
	
	public void set_State_Of_Birth(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(State_Of_Birth).click().perform();
		act.moveToElement(State_Of_Birth_1).click().perform();
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	

	public void Click_education_service_Radio1() throws InterruptedException
	{
		education_service_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("education_service_Radio1 No selected", true);
		Reporter.log("																", true);
		
		
		
	}
	
	public void Click_medical_accommodations_Radio1() throws InterruptedException
	{
		medical_accommodations_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("medical_accommodations_Radio1 No selected", true);
		Reporter.log("																", true);
		
	}
	
	public void Click_learning_program_Radio1() throws InterruptedException
	{
		learning_program_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("learning_program_Radio1 No selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_foreign_exchange_Radio1() throws InterruptedException
	{
		foreign_exchange_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("foreign_exchange_Radio1 No selected", true);
		Reporter.log("																", true);
	}
	
	public void Click_meal_plan_Radio1() throws InterruptedException
	{
		meal_plan_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("meal_plan_Radio1 No selected", true);
		Reporter.log("																", true);
		
	}
	
	public void Click_current_grade_Radio1() throws InterruptedException
	{
		current_grade_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("current_grade_Radio1 No selected", true);
		Reporter.log("																", true);
		
	}
	
	public void Click_national_guard_Radio1() throws InterruptedException
	{
		national_guard_Radio1.click();
		Thread.sleep(2000);
		Reporter.log("national_guard_Radio1 No selected", true);
		Reporter.log("																", true);
		
	}
	
	
}
