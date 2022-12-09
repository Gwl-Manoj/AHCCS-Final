package Other_Alternate_Options_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form_Page_3_Pom 
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
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement court_instruction_Radio_Button1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement court_instruction_Radio_Button2;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_3_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void set_Child_Lives_with(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Child_Lives_with).click().perform();
		act.moveToElement(Child_Lives_with_1).click().perform();
		
	}
	
//	public void court_instruction_Radio_Button()
//	{
//		court_instruction_Radio_Button1.click();
//	}
//	
//	public void court_instruction_Radio_Button1()
//	{
//		court_instruction_Radio_Button2.click();
//	}
	
	public void Set_Father_First_last_Name(String father_First_last_Name) throws InterruptedException
	{
		Father_First_last_Name.clear();
		Father_First_last_Name.sendKeys(father_First_last_Name);
		
	}
	
	public void Set_Home_address(String home_address) throws InterruptedException
	{
		Home_address.clear();
		Home_address.sendKeys(home_address);
		
	}
	
	public void Set_City(String city) throws InterruptedException
	{
		City.clear();
		City.sendKeys(city);
		
	}
	
	public void set_State(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(State).click().perform();
		act.moveToElement(State_1).click().perform();
		
	}
	
	public void Set_Zip_Code(String zip_Code) throws InterruptedException
	{
		Zip_Code.clear();
		Zip_Code.sendKeys(zip_Code);
		
	}
	
	public void Set_Cell_Number(String cell_Number) throws InterruptedException
	{
		Cell_Number.clear();
		Cell_Number.sendKeys(cell_Number);
		
	}
	
	public void Set_Work_Number(String work_Number) throws InterruptedException
	{
		Work_Number.clear();
		Work_Number.sendKeys(work_Number, Keys.TAB);
		
	}
	
	public void click_Next_Btn(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn btn-primary btn-lg']")));
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	
	
	
}
