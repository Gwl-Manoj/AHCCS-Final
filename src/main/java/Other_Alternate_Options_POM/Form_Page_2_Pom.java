package Other_Alternate_Options_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Page_2_Pom
{

	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement School_District;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement School_District_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Former_School_Type;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[504]") private WebElement Former_School_Type_1;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name_Of_Former_School;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Previous_Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[513]") private WebElement Previous_Grade_1;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement Special_Education_service_Radio_Button1;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement Special_Education_service_Radio_Button2; 
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[3]") private WebElement Special_Education_service_Radio_Button3;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[4]") private WebElement Special_Education_service_Radio_Button4;
	
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_2_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_School_District(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(School_District).click().perform();
		act.moveToElement(School_District_1).click().perform();
	
	}
	
	public void set_Former_School_Type(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Former_School_Type).click().perform();
		act.moveToElement(Former_School_Type_1).click().perform();
	
	}
	
	public void Set_Name_Of_Former_School(String name_Of_Former_School) throws InterruptedException
	{
		Name_Of_Former_School.clear();
		Name_Of_Former_School.sendKeys(name_Of_Former_School);
		
	}
	
	public void set_Previous_Grade(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Previous_Grade).click().perform();
		act.moveToElement(Previous_Grade_1).click().perform();
	
	}
	
	public void Special_Education_service(WebDriver driver) throws InterruptedException
	{
		Special_Education_service_Radio_Button1.click();
		Thread.sleep(2000);
		Special_Education_service_Radio_Button3.click();
		Thread.sleep(2000);
		Next_Btn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		Thread.sleep(2000);
		Special_Education_service_Radio_Button4.click();
		Thread.sleep(2000);
	}
	
	public void Special_Education_service1(WebDriver driver) throws InterruptedException
	{
		Special_Education_service_Radio_Button2.click();
		Thread.sleep(2000);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
}
